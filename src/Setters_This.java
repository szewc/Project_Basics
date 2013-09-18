class Lama {
	private String name;
	private int age;
	
	public void setName(String name) {				// we have to avoid directly accessing variables
		this.name = name;							// this.xx means local instance variable / class variable
	}												// 'xx' alone refers to the closest / last used, eg lama1's name
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setInfo(String name, int age) {		
		setName(name);
		this.setAge(age);							// don't have to use .this
	}
}
public class Setters_This {
	public static void main(String[] args) {
		
		Lama lama1 = new Lama();
		// lama1.name = "Dolores";					// direct setting, doesn't follow encapsulation
		// lama1.age = 4;
		
		lama1.setName("Ann");
		lama1.setAge(5);
		
		lama1.setInfo("Dupa", 1);
		System.out.println("Lama " + lama1.getName() + ": " + lama1.getAge());

	}
}
