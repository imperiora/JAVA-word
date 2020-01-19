import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		String word;
		Scanner inputDevice = new Scanner(System.in);// inputting word to print
		System.out.print("Enter word");
		word = inputDevice.next();

		char[][] grid = new char[5][9]; // initialazing grid for drawing out

		// drawing inputted letters + calling on printing method and constructor for
		// each letter
		for (int i = 0; i < word.length(); i++) {
			{
				if ((word.charAt(i)) == 'J') {
					Arrays.letterJ(grid);
					printarray(grid);
					System.out.println();
				}

				if ((word.charAt(i)) == 'A') {
					Arrays.letterA(grid);
					printarray(grid);
					System.out.println();
				}
				
				if ((word.charAt(i)) == 'V') {
					Arrays.letterV(grid);
					printarray(grid);
					System.out.println();
				}

			}

		}

	}

	public static void printarray(char[][] grid) { // Start of printarray method.
		for (int row = 0; row < grid.length; row++) { // Start of row for loop.
			for (int column = 0; column < grid[row].length; column++) { // Start of column for loop.
				System.out.print(grid[row][column] + " ");
				// End of column for loop.
			}
			System.out.println();
		} // End of row for loop

	}
}