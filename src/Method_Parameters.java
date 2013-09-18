class Robot {
	public void speak(String dupa) {
		System.out.println(dupa);
	}
	public void jump(int height) {
		System.out.println("Jumping " + height + " meters");
	}
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direcion " + direction);
	}
}
public class Method_Parameters {
	public static void main(String[] args) {
		Robot dupas = new Robot();
		dupas.speak("Dupa dupa");
		dupas.jump(50);
		dupas.move("south", 15.5);
		
		String lama = new String("Gargantua");
		/*
		 *  passing on a string 'lama' to 'speak' method
		 *  method doesn't care for a name as long as the type matches
		 *  it renames the string for the method parameter
		 *  that allows us to not care about variables' names
		 *  with non-primitive types it's only a reference for a variable
		 */
		dupas.speak(lama);		
		
		int value = 14;
		/*
		 * the same as above, but primitive variables hold a number in memory 
		 * and swap it (for different var name) when needed
		 */
		dupas.jump(value);

	}
}
