public class String_builders_formatting {
	public static void main(String[] args) {
		
		// inefficient
		String info = "";
		info += "";
		info += "Test message";
		/* in't not an appendix (change) to previous string, 
		 * just next string (created) comes in the place of old one 
		 */
		System.out.println(info);
		
		/* proper way of doing this
		 * string builder appends, doesn't create new strings 
		 */
		String a = "anfaf";
		StringBuilder build = new StringBuilder("");
		build.append("Test");							// appending returns references to strings
		build.append(" message 2")
		.append(" and final ")							// chaining methods together
		.append(a).append(" at that.");
		System.out.println(build.toString());
		
		// formatting ////////////////////////////
		// [-] aligns text to the left (easy way to adding spaces left/right)
		System.out.printf("uabf \tuafb %-3d + %6.4f hq %s\n", 15, 786781933.394818, "teab");
		
		for (int i = 0; i < 15; i++) {
			System.out.printf("%2d: test number\n", i); // aligning text using 2 digit wide space
		}
		
	}
}