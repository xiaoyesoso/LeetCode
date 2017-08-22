package Find.All.Numbers.Disappeared.in.an.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		// 思路就是 把出现过的数值为id，数组上该id数值变为负数
		for (int i = 0; i < nums.length; ++i) {
			// 若id > 0 ,且未变过，变为负
			if (nums[i] > 0 && nums[nums[i] - 1] > 0)
				nums[nums[i] - 1] = -nums[nums[i] - 1];
			// 若id < 0 ,且未变过，变为负
			if (nums[i] < 0 && nums[-nums[i] - 1] > 0)
				nums[-nums[i] - 1] = -nums[-nums[i] - 1];
		}
		List<Integer> result = new ArrayList<Integer>(nums.length);
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] > 0)
				result.add(i + 1);
		}
		return result;
	}
/*
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> a = s.findDisappearedNumbers(arr);
	}
	*/
}
