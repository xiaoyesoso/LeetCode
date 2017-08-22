package Search.Insert.Position;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		// 二分查找
		int bg = 0, ed = nums.length - 1, mid;
		while (bg <= ed) {
			mid = (bg + ed) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target)
				ed = mid - 1;
			else
				bg = mid + 1;
		}
		return bg;
	}
}
