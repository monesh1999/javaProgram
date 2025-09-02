package example.study;

class car2 {
	
	//properties also called attributes
	String colour ;
	int year;
	
	void startEngine() {
		System.out.println("Engine Started");
	}
}
	public class car{ // filename and class name as same under main
		public static void main(String[] arg) {
			car2 mycar = new car2();
			mycar.colour="Blue";
			
			mycar.year=2026;
			System.out.println("my color is "+mycar.colour);
			System.out.println("my year is "+mycar.year);
			mycar.startEngine();
		}
	}
	


