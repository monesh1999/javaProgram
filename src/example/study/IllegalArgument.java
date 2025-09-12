package example.study;

public class IllegalArgument {
	
	public static void print(int a) {
		if (a>=18) {
			System.out.println("Eligible to vote");
			
		}
		else {
			throw new IllegalArgumentException("not Eligible to vote");
		}
	}

	public static void main(String[] args) {
		
		print(24);
		

	}

}
