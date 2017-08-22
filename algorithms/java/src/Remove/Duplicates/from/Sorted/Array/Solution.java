package Remove.Duplicates.from.Sorted.Array;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		int cnt = 1;
		for (int i = 0; i < nums.length - 1; ++i)
			if (nums[i] != nums[i + 1])
				nums[cnt++] = nums[i + 1];
		return cnt;
	}
}