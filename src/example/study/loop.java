package example.study;

public class loop {

	public static void main(String[] args) {
		
		int i = 0; // Initializer
//		while(i<10) { // condition loop
//			i++;  // Increment operator
//			System.out.println("Number "+i);
//		}
		int sum =0;
		while(i<10){ 
			
			sum+=i;
			i++;
			System.out.println(i +" "+sum);
		}
		System.out.println(sum);
		
//	    System.out.println(sum);
		while(true) {
			i++;
			System.out.println("the number is :"+i);
			if(i==5775350) {
				break;
			}
			
		}
	}

}
