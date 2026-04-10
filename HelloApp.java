public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Take the first argument and print the greeting
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // Fallback if no name is provided
            System.out.println("Hello, Guest!");
        }
    }
}