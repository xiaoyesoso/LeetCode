package Search.a.Range;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		// 二分查找
		int bg = 0, ed = nums.length - 1, mid, index = -1;
		int[] result = { -1, -1 };
		while (bg <= ed) {
			mid = (bg + ed) / 2;
			if (nums[mid] == target) {
				index = mid;
				break;
			} else if (nums[mid] > target)
				ed = mid - 1;
			else
				bg = mid + 1;
		}
		if (index != -1) {
			int tmpIndex = index;
			while (tmpIndex >= 0 && nums[tmpIndex] == target)
				--tmpIndex;
			result[0] = tmpIndex + 1;
			tmpIndex = index;
			while (tmpIndex < nums.length && nums[tmpIndex] == target)
				++tmpIndex;
			result[1] = tmpIndex - 1;
		}
		return result;
	}
}
