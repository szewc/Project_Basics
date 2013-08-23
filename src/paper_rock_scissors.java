import java.util.Scanner;

public class paper_rock_scissors {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String e = "exit";
		String p = "paper";
		String r = "rock";
		String s = "scissors";
		
		System.out
		.println("You can type 'exit' to quit the program at any time.");

		while (true) {

			System.out
					.println("Please enter you choice: rock, paper, scissors.");
			String userTurn = input.nextLine();

			if (userTurn.equalsIgnoreCase(e)) {
				System.out.println("Shutting down.");
				break;
			}

			else {
				int cpuTurnInt = (int) (Math.random()) * 3;
				String cpuTurn;

				switch (cpuTurnInt) {
				case 0:
					cpuTurn = "paper";
					break;

				case 1:
					cpuTurn = "rock";
					break;

				case 2:
					cpuTurn = "scissors";
					break;

				default:
					cpuTurn = "error";
					System.out.println("Error");
					break;
				}

				if (userTurn.equalsIgnoreCase(cpuTurn)) {
					System.out.printf("Computer chooses %s as well! Draw. \n",
							cpuTurn);
				}

				else if ((userTurn.equalsIgnoreCase(p) && cpuTurn
						.equalsIgnoreCase(s))
						|| (userTurn.equalsIgnoreCase(r) && cpuTurn
								.equalsIgnoreCase(p))
						|| (userTurn.equalsIgnoreCase(s) && cpuTurn
								.equalsIgnoreCase(r))) {
					System.out.printf("Computer chooses %s, computer wins! \n",
							cpuTurn);
				}

				else if ((userTurn.equalsIgnoreCase(p) && cpuTurn
						.equalsIgnoreCase(r))
						|| (userTurn.equalsIgnoreCase(r) && cpuTurn
								.equalsIgnoreCase(s))
						|| (userTurn.equalsIgnoreCase(s) && cpuTurn
								.equalsIgnoreCase(p))) {
					System.out.printf("Computer chooses %s, you win! \n",
							cpuTurn);
				} else {
					System.out.println("Something went wrong.");
					System.out.printf("You choose %1$s, computer choose %2$s. \n", userTurn, cpuTurn);
				}
			}
		}
		input.close();
	}
}
