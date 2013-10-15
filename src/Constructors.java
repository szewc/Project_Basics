class Machine {
	private String name;
	private int number;
	
	public Machine() {							// constructor, same name as a class (including capitals), 
												// no return type, runs always when a class is initialized
		name = "Test";							// name of every Machine object will be set to 'Test' upon creation
												// since it's a part of a constructor 
		System.out.println(name + " running");
	}
	public Machine(String name) {				// we can create as many constructors as we please
		this(name, 5);	
		/*
		 * calling another constructor that accepts string and int	
		 * this way one simple (or complex constructors) can be run in another one
		 */
		this.name = name;
		System.out.println(name + " running");
	}
	public Machine(String name, int number) {
		this();									// calling default constructor from within another
												// it has to be first line in constructor
		this.name = name;
		this.number = number;
		System.out.println(name + " " + number + " running");
	}
}
public class Constructors {
	public static void main(String[] args) {
		Machine machine1 = new Machine();		// it's really a call to constructor method
		/*
		 * ^^ this initialization (creating) of an class Machine object is enough
		 * to run constructor from given class (Machine in this case) 
		 */
		
		// Machine machine2 = new Machine("Lama");
		new Machine("Lama");					// this make constructor run as well, printing and setting name
												// but this time it's looking for constructor with string and passes it
		Machine machine3 = new Machine("Borealis", 55);
	}						
}