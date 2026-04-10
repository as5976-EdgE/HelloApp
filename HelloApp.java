public class HelloApp {
    public static void main(String[] args) {
        // UC3: Use Ternary operator to check if an argument exists.
        // If args.length > 0, use args[0]; otherwise, default to "World".
        String name = (args.length > 0) ? args[0] : "World";
        
        System.out.println("Hello, " + name + "!");
    }
}