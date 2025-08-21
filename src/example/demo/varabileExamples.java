package example.demo;

public class varabileExamples {
	int age1 =5; //instance variable
	static int age =5; //static variable
	static String a ="monesh";
	
	public void myMethod() {
		int locVar = 30; // Local variable
		System.out.println(locVar);
	}

	public static void main(String[] args) {
		varabileExamples obj = new varabileExamples();
		
		obj.myMethod();
		System.out.println(a);
		System.out.println(obj.age1);
		int year = 2025; //local variable can be declare inside main
		System.out.println(year);

	}

}
