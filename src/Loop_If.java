public class Loop_If {
	public static void main(String[] args) {
		
		int aInt = 5;
		
		if (aInt < 10) {
			System.out.println("yeah1");
		}	
		if (aInt < 20) {
			System.out.println("yeah2");
		}
		else if (aInt < 20) {
			System.out.println("no");
		} 
		else System.out.println("none");
		
		while(aInt <10) {
			
			System.out.println("running");
			System.out.println("looping "+aInt);
			
			if (aInt == 9){
				break;
			}
			aInt++;
		}
	}
}
