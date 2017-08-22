package Find.the.Duplicate.Number;

public class Solution {
	public int findDuplicate(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; ++i) {
			index = nums[i] > 0 ? nums[i] - 1 : -nums[i] - 1;
			if (nums[index] < 0)
				return index + 1;
			else
				nums[index] = -nums[index];
		}
		return 0;
	}
}
