package First.Missing.Positive;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		// 思路是：将数值v 落在数值id为v-1的位置上，
		// 然后遍历
		int i = 0;
		while (i < nums.length) {
			// 由于每次交换，必然有一个数值的位置调整完毕
			// 所以一共最多交换n次
			int num = nums[i];
			if (num > 0 && num <= nums.length && nums[num - 1] != num) {
				nums[i] = nums[num - 1];
				nums[num - 1] = num;
			} else
				++i;
		}

		i = 0;
		while (i < nums.length && nums[i] == i + 1)
			++i;
		return i + 1;
	}
}