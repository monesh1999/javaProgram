package DailyTaskOops;

public class Rectangle {
   
    private double length;
    private double width;

    
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length! Must be greater than zero.");
        }
    }

   
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width! Must be greater than zero.");
        }
    }

    
    public double getLength() {
        return length;
    }

    
    public double getWidth() {
        return width;
    }

   
    public double calculateArea() {
        return length * width;
    }

   
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setLength(12);
        rect.setWidth(-4);   
        rect.setWidth(6);    

        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.calculateArea());
    }
}
