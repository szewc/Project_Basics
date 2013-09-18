class test {
	
	String name;
	int age;
	int[] dupa;
	
	// void doesn't return anything
	void speak() {
		System.out.println("Bum's name is " + name + ", aged " + age);
	}
	// method returning an int
	int yearsLeftToRetirement() {
		int yearsLeft = 67 - age;
		return yearsLeft;
	}
	// same method with getter
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
	int[] getDupe() {
		return dupa;
	}
}
public class GettersAndReturns {
	public static void main(String[] args) {
		
		test person1 = new test();
		person1.name = "zjeb";
		person1.age = 45;
		person1.dupa = new int[] {12,124,14};
		
		// typical calling of method
		// person1.speak();
		
		// setting new int to the return value of this method
		int years = person1.yearsLeftToRetirement();
		System.out.println("years left: " + years);
		
		// using getter to avoid accessing the data directly
		int wiek = person1.getAge();
		System.out.println(wiek);
		
		String name = person1.getName();
		System.out.println(name);
		
		for (int czolg : person1.getDupe()) {
		System.out.printf("%d \t", czolg);
		}
	}
}