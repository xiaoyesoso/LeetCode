package Container.With.Most.Water;

public class Solution {
	public int maxArea(int[] height) {
		int bg = 0;
		int ed = height.length - 1;
		int Max = ed * Math.min(height[bg], height[ed]);
		while (bg != ed) {
			if (height[bg] < height[ed]) {
				++bg;
				if (height[bg] <= height[bg - 1])
					continue;
			} else {
				--ed;
				if (height[ed] <= height[ed + 1])
					continue;
			}
			Max = Math.max(Max, (ed - bg) * Math.min(height[bg], height[ed]));
		}
		return Max;
	}
}