import java.util.Calendar;

public class Loop_For {
	public static void main(String[] args) {
		
		/** for loop
		 * 1. start point; 
		 * 2. condition check, do operation in curly brackets (print); 
		 * 3. execute the instruction (increment) 
		 */
		
		int aa = 14;
		long nn = 17174;
		double pi = Math.PI;
		
		
		// i=i+1 equals i++
		for(int i=1; i<5; i++) {
			// System.out.println("test "+i);
			
			/** calendar 
			* Calendar c = Calendar.getInstance();
			* System.out.printf("%tB %te, %tY%n", c, c, c);
			*/
			
			/** printf - prints inline
			 * %var, eg %d (d for decimal int, f for float, s for string)
			 * , name of var in order of commas
			 * %n for new line
			 * 08 Eight characters in width, with leading zeroes as necessary.
			 * + Includes sign, whether positive or negative.
			 * , Includes locale-specific grouping characters.
			 * - Left-justified..
			 * .3 Three places after decimal point.
			 * 10.3	Ten characters in width, right justified, with three places after decimal point
			*/ 
			
			// System.out.printf("test %d value %d %n ", i, aa);
			System.out.printf("%d. operation value is %15.14f %n", i, pi+i);
			

		}
			
	}
}
