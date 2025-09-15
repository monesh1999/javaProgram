package DailyTaskOops;


class bird{
	void fly() {
		System.out.println("Birds can fly");
	}
}
class Penguin extends bird{
	
	@Override
	void fly() {
		System.out.println("Penguins can't fly");
	}
	
}

public class overrideImpl {

	public static void main(String[] args) {
		Penguin obj = new Penguin();
		obj.fly();

	}

}
