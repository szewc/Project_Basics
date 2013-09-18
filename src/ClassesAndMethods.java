// only one public class per 'class file'
// unlimited non-public classes

class Persons {
	/*
	 * 	class can contain:
	 * 	1. data
	 * 	2. subroutines (methods)
	 */
	// 1. instance variable (data 'metadata' or 'state') 
	String name;
	int age;
	
	// 2. method (subroutine)
	// () round brackets, {} curly parenthesis
	// this method can be called for every object of class Persons
	void speak() {
		for (int i = 0; i < 2; i++) {
			System.out.println("My name " + name + " age " + (age+i));
		}
	}
	void kick() {
		System.out.println("Bullshit.");
	}
}

class Pets {
	String petName;
	String petType;
	
	void sound() {
		System.out.println("Pet " + petType + " called " + petName);
	}
}

public class ClassesAndMethods {
	public static void main(String[] args) {
		
		// objects from classes
		// invoking one class objects (data) from other class method
		Persons person1 = new Persons();
		person1.name = "Joe Test";
		person1.age = 108;
		person1.speak();
		person1.kick();
		
		Persons person2 = new Persons();
		person2.name = "Allesandro del Piero";
		person2.age = 923;
		person2.speak();
		person2.kick();
		
		Pets pet1 = new Pets();
		pet1.petName = "Marian";
		pet1.petType = "cat";
		pet1.sound();
		
		Pets pet2 = new Pets();
		pet2.petName = "Zofia";
		pet2.petType = "cow";
		pet2.sound();
		
		System.out.println(person2.name + " aged " + person2.age + " has a " + pet2.petType + " named " + pet2.petName);
	}
}
