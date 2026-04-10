public class HelloApp {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use String.join to combine all args with a comma-space delimiter
            // This automatically handles the "no trailing delimiter" logic for you!
            String names = String.join(", ", args);
            
            System.out.println("Hello, " + names + "!");
        }
    }
}