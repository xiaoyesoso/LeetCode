package Find.Minimum.in.Rotated.Sorted.Array;

public class Solution {
	public int findMin(int[] nums) {
		// 思路：使用二分法

		int bg = 0;
		int ed = nums.length - 1;
		while (bg < ed) {
			if (nums[bg] < nums[ed])
				return nums[bg];
			int mid = (bg + ed) / 2;
			// bg 在 左边递增序列 和 Min 之间
			if (nums[mid] >= nums[bg]) {
				bg = mid + 1;
			} else {
				// ed 在 右边递增序列
				ed = mid;
			}
		}
		return nums[bg];
	}
}
