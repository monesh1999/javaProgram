package DSA.array;
class Stu {
	int id;
	String name;
	Stu(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class ArrayOfObjectBasics {
	
	
//array of objects
	public static void main(String[] args) {
		Stu[] arr = new Stu[3];  //array of objects
		arr[0]=new Stu(100,"monesh");
		arr[1]=new Stu(101,"monesh R");
		arr[2]=new Stu(102,"rahul");
		System.out.println("Student data arr0");
		arr[0].display();
		System.out.println("Student data arr0");
		arr[1].display();
		System.out.println("Student data arr");
		arr[2].display();
		

	}

}
