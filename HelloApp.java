public class HelloApp {
    public static void main(String[] args) {
        // Check if length is greater than 0. If yes, use args[0]. If no, use "World".
        String name = (args.length > 0) ? args[0] : "World";
        
        System.out.println("Hello, " + name + "!");
    }
}