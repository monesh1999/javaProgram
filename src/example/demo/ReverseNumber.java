package example.demo;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 10;   // reverse the number
//		while(i>0) {
//			System.out.println(i);
//			i--;
//			if(i==0) {
//				System.out.println("blast");
//			}
//		}
		
		
		int sum = 0,j=0;  
		while(j<=10) {
			sum+=j;
			j+=2;
		}
		System.out.println("sum of odd nums"+sum);
		
		

	}

}
