package example.study;



public class CustomExpection extends Exception{ 
	private static int accno[] = {1001,1002,1003,1004,1005};
	private static String name[] = {"ram","sam","hoon","van","gum"}; 
	private static double balance[]= {10000.00,2000.00,3000.00,999.00,5000.00};
	
	public CustomExpection() {
		
	}
	public CustomExpection(String str) {
		super(str);
	}

	public static void main(String[] args) {
		try {
			System.out.println("accno"+"\t"+"name"+"\t"+"balance");
			for(int i =0 ;i<accno.length;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"\t"+balance[i]);
				if(balance[i]<1000) {
					CustomExpection me =new CustomExpection("Balance is less than 1000");
					throw me;
				}
			}
		}catch(CustomExpection me) {
			System.out.println("Exception Caught: " + me.getMessage());
			me.printStackTrace();
		}

	}

}
