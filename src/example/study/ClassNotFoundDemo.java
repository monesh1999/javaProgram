package example.study;

public class ClassNotFoundDemo {
    public static void main(String[] args) {
        try {
           
            Class<?> name=Class.forName("example.study.car");
            System.out.println("Class load successfully! "+name.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        }
    }
}
