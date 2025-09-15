package DailyTaskOops;

//Method Overriding in Java means defining a method in a subclass that already exists in its superclass with the same name, return type, and parameters. The purpose is to provide a specific implementation in the subclass.

//It is a feature of runtime polymorphism

class kia{
	void safety() {
		System.out.println("drive carefully");
	}
} 
class Car3 extends kia{
	
	@Override  //
	void safety() {
		
		System.out.println("car is safe but even throught drive carefully");
	}
}

public class override {

	public static void main(String[] args) {
		Car3 obj = new Car3();
		obj.safety();

	}

}

