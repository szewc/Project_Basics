public class Arrays {
	public static void main(String[] args) {

		
		int[] values = new int[4];
		values[0] = 10; // values' index is starting at 0
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		
		int[] numbers = { 6, 7, 8, 9 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		
		int test[] = new int[9]; // deklaracja tablicy o 9 elementach
		for (int i = 0; i < test.length; i++) {
			test[i] = i; // zapelnia tablice wartosciami od 0 do 8
			System.out.println(test[i]);
		}

		
		// TODO
		int[] b = new int[test.length];
			System.arraycopy(test, 0, b, 0, 8);
			System.out.println(b);

		
		for (int i = 5; i < test.length; i++) { // drukuje w formie for
			System.out.printf("ot %d ", test[i]);
		}
		System.out.printf("\n");

		for (int x : test) { // drukuje w formie for each
			System.out.println(x + 1); // x+1 = od numeru 1 zamiast od 0
		}

		
		int[] malePierwsze = {2,3,5,7,11,13,17,19,23};
		int[] duze = {154, 194, 10484, 438, 8499, 156, 519, 1694, 1963, 1873, 3941, 189};
		System.arraycopy(malePierwsze, 2, duze, 4, 5);
		System.out.println("duze length is "+ duze.length + " and numbers are:");
		for (int i = 0; i < duze.length; i++) {
			System.out.println(i + ":" + duze[i]);
		}
			
			
		/*
		// SAMPLE 1
		// intializing an array arr1
		int[] arr1 = new int[] { 45, 32, 75 };
		// printing the array
		System.out.println("Printing 1st array:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		// copying array arr1 to arr2 with newlength as 5
		TODO int[] arr2 = Arrays.copyOf(arr1, arr1.length); // <------- WTF?
		arr2[3] = 11;
		arr2[4] = 55;
		// printing the array arr2
		System.out.println("Printing new array:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		*/
		
	}

	public static void sort(int[] numbersChosen) {
		// TODO Auto-generated method stub
		
	}
}