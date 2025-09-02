package DailyTaskOops;



class mobilePhone{
	private String brand;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price > 1000) {
		this.price = price;
		}else {
			System.out.println("price must be greater than 1000 ");
		}
	}
	
	
	
}
public class mobile {

	public static void main(String[] args) {
		mobilePhone phone = new mobilePhone() ;
		phone.setBrand("Samsung");
		phone.setPrice(800);
		System.out.println(phone.getBrand());
		System.out.println(phone.getPrice());
		phone.setPrice(1200);
		System.out.println(phone.getPrice());



	}

}
