package Island.Perimeter;

public class Solution {
	public int islandPerimeter(int[][] grid) {

		int Num = 0;
		int Nei = 0;

		for (int i = 0; i < grid.length; ++i) {
			for (int j = 0; j < grid[i].length; ++j) {
				if (grid[i][j] == 1) {
					Num += 1;
					if (i < grid.length - 1 && grid[i + 1][j] == 1)
						Nei += 1;
					if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
						Nei += 1;
				}
			}
		}

		return Num * 4 - Nei * 2;
	}
}
