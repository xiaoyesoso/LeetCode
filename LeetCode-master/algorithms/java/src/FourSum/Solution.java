package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		return N_Sum(nums, target, 4);
	}

	List<List<Integer>> N_Sum(int[] nums, int target, int N) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length < N || N < 2)
			return result;
		Arrays.sort(nums);
		computeResult(nums, target, N, 0, result, new ArrayList<>());
		return result;
	}

	// @path 计算时被临时选入数
	void computeResult(int[] nums, int target, int N, int start,
			List<List<Integer>> result, List<Integer> path) {
		int max = nums[nums.length - 1];
		if (nums[start] * N > target || max * N < target)
			return;
		if (N == 2) {
			int bg = start;
			int ed = nums.length - 1;
			while (bg < ed) {
				if (nums[bg] + nums[ed] > target)
					--ed;
				else if (nums[bg] + nums[ed] < target)
					++bg;
				else {
					// 得到一条结果,加入之前的被选入的数
					result.add(new ArrayList<>(path));
					// nums[bg] 和 nums[ed]
					result.get(result.size() - 1).addAll(
							Arrays.asList(nums[bg], nums[ed]));
					++bg;
					--ed;
					// 跳过重复的数
					while (bg < ed && nums[bg] == nums[bg - 1])
						++bg;
					while (bg < ed && nums[ed] == nums[ed + 1])
						--ed;
				}
			}
		} else {
			// 每一层递归都选入一个数字
			for (int i = start; i < nums.length - N + 1; ++i) {
				// 跳过重复的数字
				if (i > start && nums[i] == nums[i - 1])
					continue;
				// 跳过太小的数字
				if (nums[i] + max * (N - 1) < target)
					continue;
				// 若该数字已经太大，那么就退出计算
				if (nums[i] * N > target)
					break;
				// 若相加为 target
				if (nums[i] * N == target) {
					// 连续 N 个数字相等,得到一条结果
					if (nums[i] == nums[i + N - 1]) {
						result.add(new ArrayList<>(path));
						List<Integer> tmp = new ArrayList<>();
						for (int j = 0; j < N; ++j)
							tmp.add(nums[i]);
						result.get(result.size() - 1).addAll(tmp);
					}
					// 不会有其他解了，退出
					break;
				}
				// 选入到临时结果
				path.add(nums[i]);
				// 递归
				computeResult(nums, target - nums[i], N - 1, i + 1, result,
						path);
				// 恢复
				path.remove(path.size() - 1);
			}
		}
	}
}