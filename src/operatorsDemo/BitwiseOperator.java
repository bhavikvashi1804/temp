package operatorsDemo;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		System.out.println("Bitwise Operator: AND &: both must be true");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		
		System.out.println("Bitwise Operator: OR !: anyone must be true");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		
		System.out.println("Bitwise Operator: XOR ^: anyone must be different");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}

}
