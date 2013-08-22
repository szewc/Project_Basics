import java.util.Scanner;

public class Loop_Do_While {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		int value = 0;
		do {
			System.out.println("Input an integer 5: ");
			value = input.nextInt();
		}
		while (value !=5);
		
		//else
		System.out.println("Got 5!");
		*/

		
		/*
		System.out.println("Input an integer 5: ");
		int value1 = input.nextInt();
		while (value1 != 5) {
			System.out.println("Input an integer 5: ");
			value1 = input.nextInt();
		}
		System.out.println("Got 5!");
		*/
		
		

		int inputInt1 = 0;
		
		System.out.println("Input an integer from 1 to 8: ");
		do {
		  if(input.hasNextInt()) inputInt1 = input.nextInt();
		  else input.next();
		} 
		while (inputInt1 < 1 || inputInt1 > 8);
		System.out.println("Nice "+inputInt1);
		
		
		input.close();
	}
}
