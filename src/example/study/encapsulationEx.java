package example.study;

public class encapsulationEx {
	
	public static void main(String[] arg) {
		person obj = new person();
	   obj.setAge(24);
		obj.setName("monesh");
		
		System.out.println("YOUR AGE Is "+obj.getAge());
		System.out.println("YOUR Name Is "+obj.getName());
	}

}

class person{
	private String name; // private attributes
	private int age;
	public String getName() { // public method to access and update the data
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
