package Minimum.Size.Subarray.Sum;

public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int sum = 0;
		int MIN = Integer.MAX_VALUE;
		int len = nums.length;
		int bg = 0;
		int ed = 0;
		while (ed < len) {
			sum += nums[ed++];
			boolean is = false;
			while (sum >= s) {
				is = true;
				sum -= nums[bg++];
			}
			if (is)
				MIN = Math.min(MIN, ed - bg + 1);
		}
		return MIN == Integer.MAX_VALUE ? 0 : MIN;
	}
}
