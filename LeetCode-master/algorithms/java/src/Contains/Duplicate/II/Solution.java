package Contains.Duplicate.II;

import java.util.HashSet;
import java.util.Set;


public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> myset = new HashSet<Integer>();
		int len = nums.length;
		for (int i = 0; i < len && i <= k; ++i)
			if (!myset.add(nums[i]))
				return true;
		for (int i = k + 1; i < len; ++i) {
			myset.remove(nums[i - k - 1]);
			if (!myset.add(nums[i]))
				return true;
		}
		return false;
	}
}
