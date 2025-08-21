package example.demo;

public class controlStatement {
	
	//control statement is use to control flow of program based input
	//if , if-else , nested If ,Switch case

	public static void main(String[] args) {
		int a=5;
		int b=5;
		
		if(a!=b) {
			
			System.out.println("hello welcome monesh");
			
		}
		else if(a==b){
			System.out.println("welcome");
			
		}
		else {
			
			System.out.println(a+" = "+b);
			++b;
			if(a==b) {
				System.out.println("hello welcome");
				
			}
		}
		
		int x=2,y=3,z=4;
		if(x>y && x>y) {
			 System.out.println("X is greatest");
		}
		else if(y>z && y>x) {
			System.out.print("Y is greatest");
			
		}
		else if(z>x && z>y)  {
			System.out.println("Z is greatest");
			
		}
//		int a12 = 0;
//		int i=0;
//		for(;; i++) {
//		if(true) {
//			a12++;
//			System.out.println("hello welcome "+a12);
//		}
//		System.out.println("loading....");
//		}
	}

}
