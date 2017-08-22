package Third.Maximum.Number;

public class Solution {
	public int thirdMax(int[] nums) {
		int m1 = nums[0], m2 = Integer.MIN_VALUE, m3 = Integer.MIN_VALUE, tmp;
		int index = 1;
		while (index < nums.length && nums[index] == m1)
			++index;
		if (index == nums.length)
			return m1;
		else {
			if (nums[index] > m1) {
				tmp = m1;
				m1 = nums[index];
				m2 = tmp;
			} else
				m2 = nums[index];
			++index;
		}
		while (index < nums.length && (nums[index] == m1 || nums[index] == m2))
			++index;
		if (index == nums.length)
			return m1;
		else {
			if (nums[index] > m1) {
				m3 = m2;
				m2 = m1;
				m1 = nums[index];
			} else if (nums[index] > m2) {
				m3 = m2;
				m2 = nums[index];
			} else
				m3 = nums[index];
		}
		while (index < nums.length) {
			while (index < nums.length
					&& (nums[index] == m1 || nums[index] == m2 || nums[index] <= m3))
				++index;
			if (index < nums.length) {
				if (nums[index] > m1) {
					m3 = m2;
					m2 = m1;
					m1 = nums[index];
				} else if (nums[index] > m2) {
					m3 = m2;
					m2 = nums[index];
				} else
					m3 = nums[index];
			}
		}
		return m3;
	}
}
