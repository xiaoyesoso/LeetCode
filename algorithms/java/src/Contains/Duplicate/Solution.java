package Contains.Duplicate;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		Integer[] array = new Integer[nums.length];
		for (int i = 0; i < nums.length; i++)
			array[i] = new Integer(nums[i]);
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(Arrays.asList(array));
		return hs.size() < nums.length;
	}
}