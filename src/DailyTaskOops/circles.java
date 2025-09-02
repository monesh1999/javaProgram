package DailyTaskOops;



class Circle{
	double radius;
	double calculatrArea() {
		return Math.PI * radius * radius;
		
	}
	double calclateCircumference() {
		return 2* Math.PI*radius;
	}
}

public class circles {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 5.0;
		System.out.println("Radius "+circle.radius);
		System.out.println("Area "+circle.calculatrArea());
		System.out.println("Circumference "+circle.calclateCircumference());
		
		

	}

}
