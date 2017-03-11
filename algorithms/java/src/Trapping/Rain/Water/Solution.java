package Trapping.Rain.Water;

public class Solution {
	public int trap(int[] height) {
		if (height.length <= 2)
			return 0;
		int bg, ed, tmpsum = 0, MinH, sum = 0;
		for (int mid = 1; mid < height.length - 1; ++mid) {
			bg = mid - 1;
			if (height[bg] < height[mid])
				continue;
			ed = mid + 1;
			if (height[ed] < height[mid])
				continue;
			tmpsum = 0;
			while (bg >= 0 && height[bg] >= height[bg + 1]) {
				tmpsum += height[bg + 1];
				--bg;
			}
			++bg;
			MinH = height[bg];
			while (ed < height.length && height[ed] >= height[ed - 1]
					&& height[ed] <= MinH) {
				tmpsum += height[ed - 1];
				++ed;
			}
			--ed;
			if (height[ed] < MinH) {
				MinH = height[ed];
				while (height[bg + 1] >= MinH) {
					tmpsum -= height[bg + 1];
					++bg;
				}
			}
			sum += (ed - bg - 1) * MinH - (tmpsum - height[mid]);
			mid = ed;
		}
		return sum;
	}
}