package example.study;



interface StudentDetails {
 int getId();
 String getName();
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
     StudentDetails student1 = new Student(101, "Monesh", "Computer Science");
     StudentDetails student2 = new Student(102, "Rahul", "Information Technology");

     
     System.out.println("Student 1 -> ID: " + student1.getId() + ", Name: " + student1.getName() + ", Course: " + student1.getCourse());
     System.out.println("Student 2 -> " + + student2.getId() + ", Name: " + student2.getName() + ", Course: " + student2.getCourse()); 
 }
}

