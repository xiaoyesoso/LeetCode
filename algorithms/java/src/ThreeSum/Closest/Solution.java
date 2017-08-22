package ThreeSum.Closest;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; ++i) {
			int bg = i;
			int mid = i + 1;
			int ed = nums.length - 1;
			while (mid < ed) {
				int sum = nums[bg] + nums[mid] + nums[ed];
				if (Math.abs(target - result) > Math.abs(target - sum))
					result = sum;
				if (sum > target)
					--ed;
				else
					++mid;
			}
		}
		return result;
	}
}
