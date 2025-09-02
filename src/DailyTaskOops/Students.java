package DailyTaskOops;

public class Students {
    
    private int rollNumber;
    private String name;
    private double marks;

    
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

   
    public int getRollNumber() {
        return rollNumber;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getName() {
        return name;
    }

   
    public void setMarks(double marks) {
        if (marks >= 0) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks cannot be negative.");
        }
    }

  
    public double getMarks() {
        return marks;
    }

    
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

   
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.setRollNumber(101);
        s1.setName("Riya");
        s1.setMarks(-50);  
        s1.setMarks(85.5); 

        s1.displayDetails();
    }
}
