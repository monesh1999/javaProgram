package example.study;

public class ConstrutorOverloading {
	int id;
	String name;
	int age;
	
	public ConstrutorOverloading(int id1, String name1){
		id = id1;
		name = name1;
	}
	public ConstrutorOverloading(int id1, String name1,int age1){
		id = id1;
		name = name1;
		age =age1;
	}
	void Display() {
		System.out.println(id+"  "+name);
	}
	void Display1() {
		System.out.println(id+"  "+name+" "+age);
	}
	void methodwithNoParameter() {
		System.out.println("hello " +id+"  "+name);
	}
	void methodwithparamete(int a) {
		System.out.println(a+"  "+name+" "+age);
	}

	public static void main(String[] args) {
		ConstrutorOverloading con = new  ConstrutorOverloading(2,"monesh");
		ConstrutorOverloading con2 = new  ConstrutorOverloading(2,"monesh",24);
		
		con.Display();
		con2.Display1();
		con2.Display();
		con2.methodwithNoParameter();
		con2.methodwithparamete(22);;
		
		

	}

}
