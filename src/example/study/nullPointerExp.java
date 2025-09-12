package example.study;

public class nullPointerExp {

	public static void main(String[] args) {
		try {
			String a = null,b="hello";
			System.out.println(a.charAt(0));
			System.out.println(b.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer "+e);
		}
	}

}
