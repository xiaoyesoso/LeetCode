package Two.Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		// HashMap 存储遍历过的值 <v,id>
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; ++i) {
			// 若HashMap中存储过 与现在遍历的值相加为target
			// 则返回结果
			if (myMap.containsKey(target - nums[i])) {
				result[0] = myMap.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			myMap.put(nums[i], i);
		}
		return result;
	}
}
