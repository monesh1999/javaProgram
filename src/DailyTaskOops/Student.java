package DailyTaskOops;

public class Student {
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void DisplayStudent() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
	
	public static void main(String[] arg) {
		Student st = new Student();
		st.setAge(24);
		st.setName("monesh");
		st.DisplayStudent();
	}

}
