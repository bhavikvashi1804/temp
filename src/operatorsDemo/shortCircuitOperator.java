package operatorsDemo;

public class shortCircuitOperator {
	
	public static void main(String[] args) {
		boolean x = true, y = true;
		
		//if(x&y) { this does not work
		if(x && y) {
			System.out.println("Inside if");
		}
	}

}
