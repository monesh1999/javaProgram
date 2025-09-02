package DailyTaskOops;

public class Calculator {

   
    public int add(int a, int b) {
        return a + b;
    }

    
    public int subtract(int a, int b) {
        return a - b;
    }

    
    public int multiply(int a, int b) {
        return a * b;
    }

    
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error! Division by zero is not allowed.");
            return 0; 
        }
    }

    
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int x = 20, y = 5;

        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));
        System.out.println("Division by zero test: " + calc.divide(x, 0));
    }
}
