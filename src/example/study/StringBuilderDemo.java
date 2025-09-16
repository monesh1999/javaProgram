package example.study;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create with default capacity
        StringBuilder sb = new StringBuilder();  
        
        // Append different types
        sb.append("Hello");
        sb.append(' ');
        sb.append("World");
        sb.append('!');
        sb.append(123);
        System.out.println("After appends: " + sb.toString());
        // e.g. "Hello World!123"
        
        // Insert somewhere
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb.toString());
        // e.g. "Hello Java World!123"
        
        // Replace a portion
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb.toString());
        // e.g. "Hello C++ World!123"
        
        // Delete part
        sb.delete(6, 10);
        System.out.println("After delete: " + sb.toString());
        // e.g. "Hello  World!123"
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
        // e.g. "321!dlroW  olleH"
        
        // Convert to String
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}