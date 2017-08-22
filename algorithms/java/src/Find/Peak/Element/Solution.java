package Find.Peak.Element;

public class Solution {
	public int findPeakElement(int[] nums) {
		// 思路： 由于是找到一个最高点，
		// 则 nums 是有一个递增序列 和 一个递减序列组成的
		// 所以可以使用二分法
		int bg = 0;
		int ed = nums.length - 1;
		int mid = 0;
		while (bg < ed) {
			mid = (bg + ed) / 2;
			if (nums[mid + 1] > nums[mid])
				bg = mid + 1;
			else
				ed = mid;
		}
		return bg;
	}
}