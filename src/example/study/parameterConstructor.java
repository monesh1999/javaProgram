package example.study;

public class parameterConstructor {
	int id;
	String name;//attributes
	
	public parameterConstructor(int id,String name){ //parameterized constructor
		this.id = id;
		this.name=name;
		
	}
	
	void Display() {
		System.out.println(id+"  "+name);
	}
	public static void main(String[] args) {
		parameterConstructor s1 = new parameterConstructor(1,"monesh");
		parameterConstructor s2 = new parameterConstructor(2,"jagu");
		parameterConstructor s3 = new parameterConstructor(3,"kamesh");
		
		s1.Display();
		s2.Display();
		s3.Display();
		

	}

}
