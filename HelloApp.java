public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // StringBuilder is more efficient for joining many strings
            StringBuilder names = new StringBuilder();
            
            // Enhanced For Loop: iterates through every String in the args array
            for (String name : args) {
                // Add a comma and space before adding the next name (except for the first one)
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}