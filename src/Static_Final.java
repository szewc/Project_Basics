class Thing {
	public String name;										// usually we declare variables private!
	/*														// instance variables
	 * static/class variable, same for every 
	 * instance of class object; it's initialized 
	 * always, no need to create new class object
	 * which would make constructor	run							
	 */
	public static String description;		
	public final static int NUMBER = 7;						// final fields have to be assigned with value on creation

	public void showName() {								// typical instance method dealing with instance data
		System.out.println("id: " + id + 
				",description: " + description + ": " + this.name);	// associated with particular objects, not static
	}														// instance method can access static data
	public static void showInfo() {
		System.out.println(description);			// static methods have access to static variables
													// since both are in the same class, can't use 'this'
		// System.out.println(name);				// won't work, that's instance data, can't be accessed
	}												// by static method
	
	public static int count = 0;
	public int id;									// instance variables are initialized with default value of 0
	public Thing() {								// useful for counting: with each creation of class object
		id = count;									// id is 'joined' with each incremental object
		count++;									// count increments, there is only one shared copy of it
	}												
}
public class Static_Final {
	public static void main(String[] args) {
		
		System.out.println(Thing.count);			// count == 0
		
		Thing thing1 = new Thing();					// count == 1, increments right after creating new object
		Thing thing2 = new Thing();					// count == 2
		
		thing1.name = "Lama";
		thing2.name = "Bob";
		System.out.println(thing1.name + " " + thing2.name);
		
		Thing.description = "description";
		System.out.println(Thing.description);		// that's static description, we can use thing1.desc
													// but that's not recommended
		thing1.showName();							
		thing2.showName();							
		Thing.showInfo();							// calling static method
		System.out.println(Math.PI);				// final static class as a double (2^50)
													// final data -> UPPERCASE
		System.out.println(Thing.NUMBER);			// to access data through class (Thing.xx) we have to use static
		System.out.println(Thing.count);			// testing count 2 - normally we should use getter for 
													// getters give better encapsulation, static data doesn't need that

	}
}
