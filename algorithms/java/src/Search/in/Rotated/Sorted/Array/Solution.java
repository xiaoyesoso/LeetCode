package Search.in.Rotated.Sorted.Array;

public class Solution {
	public int search(int[] nums, int target) {
		// 二分查找
		int bg = 0, ed = nums.length - 1;
		while (bg < ed) {
			int mid = (bg + ed) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > nums[ed]) {
				// 在（mid，ed】 数，肯定>nums[mid] 或者 <= nums[ed]
				if (target > nums[mid] || target <= nums[ed])
					bg = mid + 1;
				else
					ed = mid - 1;
			}
			// nums[mid] < nums[ed]
			else {
				// 在（mid，ed】 数，肯定>nums[mid] 并且 <= nums[ed]
				if (target > nums[mid] && target <= nums[ed])
					bg = mid + 1;
				else
					ed = mid - 1;
			}
		}
		return -1;
	}
}
