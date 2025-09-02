package DailyTaskOops;

class Car{
	private String brand;
	private int year;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year <= 2025) {
		  this.year = year;
		}
		else {
			System.out.println("invalid year or future year");
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void displayCarDetails() {
		System.out.println("brand :"+brand);
		System.out.println("year :"+year);
		System.out.println("color :"+color);
	}
	
	
}



public class cars {

	public static void main(String[] args) {
		

		Car car = new Car();
		car.setBrand("TATA");
		car.setYear(2025);
		car.setColor("white");
		car.displayCarDetails();
		

	}

}
