package DailyTaskOops;

public class Polymor {
        // polymorphism  many forms its allow an object to take many form through  1,complile time 2. runtime polymorphism
	//1. Compile time or method overloading is also known as compile time poly
	// it allow to define multiple method in same name same class but the different parameter
	// key rules:
	// method must have same name
	//method must have parameter ,number of parameter or order of parameter
	//return type is different but does not count for overloading
	
	
	
	//2.
	//Method Overriding in Java means defining a method in a subclass that already exists in its superclass with the same name, return type, and parameters. The purpose is to provide a specific implementation in the subclass.
	//	It is a feature of runtime polymorphism.
			//✅ Key Rules of Overriding:
			//Method name must be exactly the same.
	         //Parameters must be exactly the same.
	         //Return type must be the same (or a covariant type).
	          //The method in the superclass must be inherited by the subclass.
	          //Access level cannot be more restrictive than the overridden method.
	//The method cannot be static, final, or private (these methods cannot be overridden).
	//You can use @Override annotation to tell the compiler you intend to override.
	
	int mul(int a,int b) {
		return a*b;
	}
	int mul(int a ,int b, int c) {
		return a*b*c;
	}
	float mul(float a ,float b, float c) {
		
		float prod =a*b*c;
		return prod;
	}
	public static void main(String[] args) {
		Polymor obj = new Polymor();
		int mul1 =obj.mul(5,5);
		int mul2 =obj.mul(5, 5,5);
		System.out.println(mul1);
		System.out.println(mul2);
		float mul3 = obj.mul(2555,3550,45550);
		System.out.println(mul3);
		
	}

}
