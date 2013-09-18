import java.util.Scanner;
public class Investments_Array {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("What's your start balance?: ");
   		final int startBalance = input.nextInt();
		System.out.println("How long (in months) will the deposit be made for?: ");
		final int nMonths = input.nextInt();
		System.out.println("How many different rates do you want to simulate?: ");
		final int nRates = input.nextInt();
		System.out.println("What's the start/base rate (in double, percentages)?: ");
		final double startRate = input.nextDouble();
		System.out.println("What's the rates difference (in double, percentages)?: ");
		final double x = input.nextDouble();
		
		// creating a row with rates (interval of 1%)
		// doesn't come into our array
		double[] interestRate = new double[nRates]; 
		for (int j = 0; j < interestRate.length; j++) {
			interestRate[j] = (startRate + j * x) / 100;
		}
		// 2-dimension array (matrix) i-rows j-columns
		// [x][y] - x row, y number of column in x row
		double[][] balanceArray = new double[nMonths][nRates];
		
		// setting up all start balances (rates don't come into array)
		for (int j = 0; j < balanceArray[0].length; j++) {
			balanceArray[0][j] = startBalance;
		}
		/* calculating the income from rates
		 * to go through all the 2-dimension array 
		 * we have to nest one loop into another
		 * one for rows, another for columns
		 * first row is already populated with start balances
		 */
		for (int i = 1; i < balanceArray.length; i++) {
			for (int j = 0; j < balanceArray[i].length; j++) {
				// get an input balance from previous row
				double oldBalance = balanceArray[i-1][j];
				// calculating the interest
				double interest = oldBalance * interestRate[j];
				// calculating new balance
				balanceArray[i][j] = oldBalance + interest;
			}
		}
		System.out.println();
		System.out.println("Here you go!");
		System.out.println();
		// printing rates row
		for (int j = 0; j < interestRate.length; j++) {
			System.out.printf("  %2.2f%%   ", 100*interestRate[j]);
		}
		System.out.println();
		// printing balances array - rows
		for (double[] row : balanceArray) {
			// printing columns in rows
			for (double column : row) {
				System.out.printf("%10.2f", column);
			}
			System.out.println();
		}
		input.close();
	}
}