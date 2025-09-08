package example.study;

interface uu{
	String getName();
}

interface StudentDetails extends uu {
 int getId();
 
 String getCourse();
}


class Student implements StudentDetails {
 private int id;
 private String name;
 private String course;

 // Constructor
 public Student(int id, String name, String course) {
     this.id = id;
     this.name = name;
     this.course = course;
 }

 
 @Override
 public int getId() {
     return id;
 }

 @Override
 public String getName() {
     return name;
 }

 @Override
 public String getCourse() {
     return course;
 }

 
}

public class StudentInterfaceDemo {
 public static void main(String[] args) {
     // Create Student object using interface reference
     StudentDetails student1 = new Student(101, "Monesh", "Java");
     StudentDetails student2 = new Student(102, "Rahul", "Python");
     StudentDetails student3 = new Student(103, "kamesh", "java");
     StudentDetails student4 = new Student(104, "jagu", "java");
     StudentDetails student5 = new Student(105, "harish", "Mern");


     
     System.out.println("Student Details -> ID: " + student1.getId() + " | Name: " + student1.getName() + " | Course: " + student1.getCourse());
     System.out.println("Student Details -> ID: " + + student2.getId() + " | Name: " + student2.getName() + "  | Course: " + student2.getCourse());
     System.out.println("Student Details -> ID: " + student3.getId() + " | Name: " + student3.getName() + " | Course: " + student3.getCourse());
     System.out.println("Student Details -> ID: " + + student4.getId() + " | Name: " + student4.getName() + "   | Course: " + student4.getCourse()); 
     System.out.println("Student Details -> ID: " + student5.getId() + " | Name: " + student5.getName() + " | Course: " + student5.getCourse());
     
 }
}

