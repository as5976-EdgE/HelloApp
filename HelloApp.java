public class HelloApp {
    public static void main(String[] args) {
        String names;

        if (args.length > 0) {
            // Join all arguments into a single string separated by ", "
            names = String.join(", ", args);
        } else {
            // Fallback to default
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}