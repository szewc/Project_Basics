class Frog {
	private int id;									// encapsulation - making private (invisible)
	private String name;							// only way of access is by public method in the same class
	
	public Frog(int id, String name) {				// constructor dependent on newly created Frog object
		this.id = id;
		this.name = name;
	}
	public String toString() {						// we replace default 'toString' method (class@id)
													// with our own via return
		StringBuilder builder1 = new StringBuilder();
		builder1.append(id).append(": ").append(name);
		return builder1.toString();
		
		// return String.format("%2d: %s", this.id, this.name);	// alternatively - close to 'printf' (print format)
		
		// return id + ": " + name;					// inefficient, converting to non-primitive objects
	}												// and concatenating (creating new string with each +)
}
public class ToString {
	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "Bunny");
		Frog frog2 = new Frog(5, "Funny");
		
		System.out.println(frog1);
		System.out.println(frog2);

		// System.out.println(frog1.id);				// can't access private variables 
	}
}
