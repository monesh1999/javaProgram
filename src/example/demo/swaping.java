package example.demo;

public class swaping {

	public static void main(String[] args) {
		
		System.out.println("hello");
		 int x=5,y=9 ;
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println(x+" "+y);
		 
		 int temp =x;
		 x=y;
		 y=temp;
		 System.out.println(x+" "+y);

	}

}
