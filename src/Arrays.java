
public class Arrays {
	public static void letterJ(char[][] grid) {

		// building letter J
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 9; j++) {
				grid[i][j] = ' ';

				for (int col = 0; col < 5; col++)
					grid[col][8] = 'J';
				for (int row = 4; row < 8; row++)
					grid[4][row] = 'J';
				grid[3][4] = 'J';

			}
	}

	// building letter A
	public static void letterA(char[][] grid) {

		for (int row = 0; row < grid.length; row++)
			for (int col = 0; col < grid[row].length; col++)
				if (col == (grid.length - 1 - row) | col + 2 == (grid.length + 1 + row)) {
					grid[row][col] = 'A';

				} else {
					grid[row][col] = ' ';
				}
		for (int col = 1; col < 8; col++)
			grid[3][col] = 'A';
	}

	public static void letterV(char[][] grid) {
		// building letter V
		for (int row = 0; row < grid.length; row++)
			for (int col = 0; col < grid[row].length; col++)
				if (col == (grid.length - row + 3) | col + 2 == (grid.length + row - 3)) {
					grid[row][col] = 'V';

				} else {
					grid[row][col] = ' ';
				}
	}
}
