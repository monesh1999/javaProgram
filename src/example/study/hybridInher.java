package example.study;

class owner{
	void Getowner() {
		System.out.println("I am the MD");
	}
}
class manager1 extends owner{
	void Getmanger1() {
		System.out.println("Iam the manager1");
	}
}
class employee extends manager1{
	void Getemployee() {
		System.out.println("iam the employee");
	}
}
class manager2 extends owner{
	void Getmanager2() {
		System.out.println("i am the manager2");
	}
}


public class hybridInher {

	public static void main(String[] args) {
		
		owner obj1 = new owner();
		obj1.Getowner();
		
		manager1 obj2 = new manager1();
		obj2.Getowner();
		obj2.Getmanger1();
		manager1 obj3 = new manager1();
		
		obj3.Getowner();
		obj3.Getmanger1();
		
		employee e1 = new employee();
		e1.Getmanger1();
		e1.Getowner();
		e1.Getemployee();
	}

}
