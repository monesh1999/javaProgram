package example.study;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<10;i++) {       // traditional for loop
			                           // for(intialization,condition,inc/dec)
			System.out.print(i);
			
			
		}
		System.out.println();
		//multiple variable
		for(int i =0,j=10;i<j;i++,j--) {
			System.out.println(i+" "+j);
		}
		
		// inner loop
		int n= 5;
		
		for(int i = 0;i<=n;i++) {
			for(int j = 1;j<=i;j++) {  // (jagged array) j
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
		//formatted output  C++      printF is formatted output
		int i = 6;
		String name = "monesh";
		System.out.printf("name :%s , I: %d%n",name,i);
	//ystem.out.printf("name :%c, I: %d%n",name,i);
		
		
		for(int k =1;k<=10;k++) {
			if(k==5) continue;
			if(k==8) break;
			System.out.println(k);
		}
		 int[] number = {1,2,3,4,5};
		 for(int num:number) {
			 System.out.println(num);
		 }
		
		
	}

}
