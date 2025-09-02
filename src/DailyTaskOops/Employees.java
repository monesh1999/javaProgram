package DailyTaskOops;

class Employee{
	String name;
	double salary;
	public void DisplayDetails() {
		System.out.println("name : "+name);
		System.out.println("salary : "+salary);
	}
}


public class Employees {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name="monesh";
		emp.salary=50000;
		emp.DisplayDetails();
		
	}

}
