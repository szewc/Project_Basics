import java.util.*;

public class Input_User {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a line of text: ");
		String userInputLine1 = input.nextLine();
		System.out.println("Congrats, you can write like this: " + userInputLine1);
	
		System.out.println("Enter a floating point value: ");
		float userInputNext2 = input.nextFloat();
		System.out.println("Congrats, you can write like this: " + userInputNext2);
		
		System.out.println("End");
		input.close();
	}
}
