
public class Arrays_of_Strings {
	public static void main(String[] args) {
		
		/*
		 * arrays of strings doesn't allocate memory to strings,
		 * just referencing to them. machine wouldn't know how much
		 * to allocate to array or to string, since it can be massive in length.
		 * each string is 'allocated' with 'null' as a default.
		 */
		
		// method 0 - typical concatenation  
		String[] nonsense = new String[5];
		nonsense[2] = "uaf ua";
		nonsense[4] = "ahu auhfua fua";
		System.out.println(nonsense[1] + " + " + nonsense[4]);
		
		// method 1 - for loop
		String[] lamas1 = {"lama1", "lama2", "lama3"};
		for (int i = 0; i < lamas1.length; i++) {
			System.out.print(lamas1[i] + " ");
		}
		
		System.out.printf("\n\n");

		// method 2 - for each 
		String[] lamas2 = {"lama1", "lama2", "lama3"};
		for (String lamasArray : lamas2) {
			System.out.println(lamasArray);
		}
			
	}
}
