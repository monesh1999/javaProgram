package example.demo;

public class nestedSwitch {

	public static void main(String[] args) {
		
		String dregee = "BE";
		String course = "cse";
		switch(dregee) {
		case "BTech":
			System.out.printf("Dregree is Technplogy ");
			switch(course){
				case "IT":
					System.out.println("course is IT");
					break;
			}
		}
		
	}

}
