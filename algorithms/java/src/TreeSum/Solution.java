package TreeSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	public List<List<Integer>> twoSum(int[] nums, int target, int bg,
			Set<Integer> pvisited) {
		// HashMap 存储遍历过的值 <v,id>
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		List<List<Integer>> valList = new ArrayList<List<Integer>>();
		Set<Integer> visited = new HashSet<Integer>();
		for (int i = bg + 1; i < nums.length; ++i) {
			// 若HashMap中存储过 与现在遍历的值相加为0
			// 则返回结果
			if (myMap.containsKey(target - nums[i])
					&& !visited.contains(nums[i])
					&& !pvisited.contains(nums[i])
					&& !pvisited.contains(target - nums[i])) {
				List<Integer> ids = new ArrayList<Integer>();
				ids.add(target - nums[i]);
				ids.add(nums[i]);
				visited.add(nums[i]);
				visited.add(target - nums[i]);
				valList.add(ids);
			}
			myMap.put(nums[i], i);
		}
		return valList;
	}

	public List<List<Integer>> threeSum(int[] nums) {
		Set<Integer> visited = new HashSet<Integer>();
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		int bg = 0;
		while (bg + 2 < nums.length) {
			while (bg + 2 < nums.length && visited.contains(nums[bg]))
				++bg;
			if (bg + 2 == nums.length)
				break;
			List<List<Integer>> result = twoSum(nums, 0 - nums[bg], bg, visited);
			Iterator<List<Integer>> it = result.iterator();
			while (it.hasNext()) {
				List<Integer> vals = it.next();
				vals.add(nums[bg]);
				Collections.sort(vals);
				results.add(vals);
			}
			visited.add(nums[bg]);
			++bg;
		}
		return results;
	}
}
