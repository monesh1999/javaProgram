package example.study;

public class Strindhandling {
	//string is datatype use to represent text
	// it include letter number puncvastions spaces symbols etc
	// string are immutable . once u create str obj u cant change the content

	public static void main(String[] args) {
		int a = 10; //integer
		String sa = "hello welcome";//string literal
		String sb = new String("hello welcome"); //new keyword
		String s = String.valueOf(a);//passing int into string
		System.out.println(s);
		
		String a1 ="apple0";
		String b1 ="orange";
		
		String c1 = a1+b1;
		System.out.println(c1);
		String d1 = a1.concat(b1);
		System.out.println(d1);
		
		int a11 = a1.length();
		System.out.println(a11);
		
		char[] arr = {'a','b','c','d'};
		String dum = String.valueOf(arr);
		System.out.println(dum);
		

	}

}
