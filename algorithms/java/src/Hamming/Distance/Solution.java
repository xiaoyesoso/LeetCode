package Hamming.Distance;

public class Solution {
	public int hammingDistance(int x, int y) {
		int num = 0;
		while (x != 0 && y != 0) {
			if (x % 2 != y % 2)
				++num;
			x /= 2;
			y /= 2;
		}

		int r = 0;

		if (x == 0)
			r = y;
		else
			r = x;

		while (r != 0) {
			if (r % 2 == 1)
				++num;
			r /= 2;
		}

		return num;

	}
}
