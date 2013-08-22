public class Loop_While {
	public static void main(String[] args) {
		boolean loop1 = 4 < 5;
		boolean loop2 = 6 < 1;
		
		int value1 = 7;
		boolean loop3 = value1 < 10;
		
		System.out.println("condition loop1 is "+loop1);
		System.out.println("condition loop2 is "+loop2);
		System.out.println("condition loop3 is "+loop3);
		
		int value2 = 15;
		
			while(value2 <= 20) {
				System.out.println("I klops" + value2);
				value2 = value2+1;
			}
		
	}

}
