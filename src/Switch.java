import java.util.*;

public class Switch {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Command?: ");

		String aText = input.nextLine();
		//while (true) {
		switch (aText) {

		case "start":
			System.out.println("Machine started ");
			break;

		case "stop":
			System.out.println("Machine stopped ");
			break;

		default:
			System.out.println("Wat?");
		}
		input.close();
	}
}
//}
