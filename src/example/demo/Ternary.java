package example.demo;

public class Ternary {

	public static void main(String[] args) {
		int a=2,b=3;
		int max=(a>b) ? a:b;   //(condition) ? true:false;
		System.out.println(max);	
	
		int a1=2,b1=3;
		String max1=(a1>b1) ? "hello":"welcome";   //(condition) ? true:false;
		System.out.println(max1);
		
		
		int score =85;      // nested ternary for assigning grade
		String grade = (score >= 90) ? "A":
			          (score >= 80) ? "B" :
			        	  (score>=70) ? "c":"f";
		
		System.out.println(grade);
		int a22 = 4;
		String max2=(a22 % 2 ==0) ? "Even":"Odd"; 
		System.out.println(max2);
		
		boolean login= false;
		String max22= login ? "welcome back":"please log in";
		System.out.println(max22);
	}

}
