package example.study;

public class exceptionImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int mynum[]= {1,2,3,4,5,6,7};
			System.out.println(mynum[11]);
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}

	}

}
