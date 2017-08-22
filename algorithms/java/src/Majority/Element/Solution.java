package Majority.Element;

public class Solution {
	public int majorityElement(int[] nums) {
		int index = 0;
		int cnt = 1;
		for (int i = 1; i < nums.length; ++i) {
			if (nums[i] == nums[index])
				++cnt;
			else {
				--cnt;
				if (cnt == -1) {
					index = 1;
					cnt = 1;
				}
			}
		}
		return nums[index];
	}
}
