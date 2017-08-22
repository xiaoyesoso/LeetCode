package Two.Sum.II.Input.array.is.sorted;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int bg = 0;
		int ed = numbers.length - 1;
		int[] result = new int[2];
		while (bg < ed) {
			int v = numbers[bg] + numbers[ed];
			if (v == target) {
				result[0] = bg + 1;
				result[1] = ed + 1;
				return result;
			} else if (v > target)
				--ed;
			else
				++bg;
		}
		return result;
	}
}
