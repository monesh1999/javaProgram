package example.study;


class cars{//class starts
	protected String brand = "TATA";//properties
	public void horn() {//methods
		System.out.println("the car is horing the road");
	}
	
}//class ends
public class SingleInheritance  extends cars{ //implement single inheritance
	
	public String model ="INDICA";//properties

	public static void main(String[] args) {
		
		//create an object for class car
		SingleInheritance mycar =new SingleInheritance();
		mycar.horn(); // call the method horn() from single inheritance
		System.out.println(mycar.brand+" and "+mycar.model);

	}

}
