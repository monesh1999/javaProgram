package dailyTasks;

public class calculator {
	
	
	static int add(int a,int b) {
		return a+b;
	}
    static int sub(int a,int b) {
		return a-b;
	}
    static int mul(int a,int b) {
		return a*b;
	}
    static int div(int a,int b) {
		return a/b;
	}
    static int mod(int a,int b) {
		return a%b;
	}

	public static void main(String[] args) {
		int a = 55;
		int b = 5;
		System.out.println("Addition of "+a+" and "+b+" is : "+add(a,b));
		System.out.println("Subration of "+a+" and "+b+" is : "+sub(a,b));
		System.out.println("Multiplication of "+a+" and "+b+" is : "+mul(a,b));
		System.out.println("Divide of "+a+" and "+b+" is : "+div(a,b));
		System.out.println("mod of "+a+" and "+b+" is : "+mod(a,b));

	}

}
