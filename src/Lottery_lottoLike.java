import java.util.*;
public class Lottery_lottoLike {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to draw? ");
		int k = input.nextInt();
		System.out.println("What's a maximum number possible to draw? ");
		int n = input.nextInt();
		
		// creating an array with numbers 1 to n
		int[] numbersAll = new int[n];
		for (int i = 0; i < numbersAll.length; i++) {
			numbersAll[i] = i + 1;			// can't start with 0
		}
		// creating an array with k numbers 
		int[] numbersChosen = new int[k];
		for (int i = 0; i < numbersChosen.length; i++) {
			// drawing random numbers 0 to n-1
			int r = (int) (Math.random()*n);
			// getting a k results from first array of n
			numbersChosen[i] = numbersAll[r];
			// making sure there is no duplicates
			// pushing drawn number*r as last number in array
			numbersAll[r] = numbersAll[n - 1];	// n-1 as an adress
			// deleting last number in array
			n--;
		}
		Arrays.sort(numbersChosen);
		System.out.println("Check these out!");
		for (int a : numbersChosen) {
			System.out.print(a + " ");
		}
		input.close();
	}
}