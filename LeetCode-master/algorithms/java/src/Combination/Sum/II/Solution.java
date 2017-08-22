package Combination.Sum.II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		// 计算出 ，result前面部分是 tmpList ，从数组第bg位开始的各类数值
		track(result, new ArrayList<Integer>(), target, candidates, 0);
		return result;
	}

	void track(List<List<Integer>> result, ArrayList<Integer> tmpList,
			int remian, int[] nums, int bg) {
		if (remian < 0)
			return;
		else if (remian == 0) {
			result.add((ArrayList<Integer>) tmpList.clone());
			return;
		} else {
			for (int i = bg; i < nums.length; ++i) {
				if(i > bg && nums[i] == nums[i-1]) continue;
				tmpList.add(nums[i]);
				track(result, tmpList, remian - nums[i], nums, i + 1);
				tmpList.remove(tmpList.size() - 1);
			}
		}
	}
}
