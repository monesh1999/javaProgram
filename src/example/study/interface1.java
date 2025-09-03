package example.study;


interface shape{ //Reusable or plugable
	double getArea();
	
}

class Reactangle implements shape{
	private double length;// h
	private double width;
	
	public Reactangle(double length,double width) {//cons
		this.length=length;
		this.width= width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
class Triangle implements shape {
    private double base; 
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}


class Circle implements shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class interface1 {

	public static void main(String[] args) {
		//with creating obj using class with interface
		//interfacename obj = new classname
		shape rectangle = new Reactangle(5.0,7.5);
		shape triangle = new Triangle(5.0, 7.8);
        shape circle = new Circle(3.0);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());

	}

}
