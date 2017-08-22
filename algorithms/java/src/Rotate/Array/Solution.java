package Rotate.Array;

public class Solution {
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		int mvLen = len - k % len;
		int[] tmp = new int[mvLen];
		for (int i = 0; i < mvLen; ++i)
			tmp[i] = nums[i];
		int j = 0;
		for (int i = mvLen; i < len; ++i) {
			nums[j] = nums[i];
			++j;
		}
		for (int i = 0; i < mvLen; ++i) {
			nums[j] = tmp[i];
			++j;
		}
	}
}
