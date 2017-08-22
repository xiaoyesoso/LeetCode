package Move.Zeroes;

public class Solution {
	public void moveZeroes(int[] nums) {
		int pnozero = 0;
		int pzero = 0;
		int len = nums.length;
		while (true) {
			while (pnozero < len && nums[pnozero] == 0)
				++pnozero;
			if (pnozero == len)
				break;
			while (pzero < len && nums[pzero] != 0)
				++pzero;
			if (pzero == len)
				break;
			if (pzero < pnozero) {
				nums[pzero] = nums[pnozero];
				nums[pnozero] = 0;
			}
			++pnozero;
		}
	}
}