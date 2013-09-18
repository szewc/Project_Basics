public class Arrays_multi_dimensional {
	public static void main(String[] args) {
		
		// 1
		int[] values = { 1, 124, 1235 };
		System.out.println(values[2]);
		System.out.println();
		
		// 2 grid initialization
		int[][] grid = { 
				{ 1, 124, 1235 }, 
				{ 6, 74 },
				{ 24, 242, 5744, 525, 265 } 
				};
		System.out.printf("%d \n \n", grid[2][1]);
		
		// 3 print grid with for each loop and tab
		for (int[] row : grid) {
			for (int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4 print grid with for loop and space
		for (int row =0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + " ");
			}
			System.out.println();
		}
		
		// 5 array of strings
		String[][] text = new String[4][3];
		text[2][1] = "dupa";
		System.out.println();
		// System.out.println(text[2][1]);
		System.out.println(text[2][2]);			// null for empty
		System.out.println();
		
		// 6 array with empty second dimension
		String[][] empty = new String[2][];
		empty[1] = new String[3];
		empty[1][2] = "dupa";
		System.out.println(empty[1][2]);
	}
}
