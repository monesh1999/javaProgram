package DailyTaskOops;

public class Overloading {
	static void display(int a) {
		System.out.println("hello welcome");
	}
	static void display(String a) {
		System.out.println("hello welcome 2");
	}

	public static void main(String[] args) {
		display(1);
		display("hello");

	}

}
