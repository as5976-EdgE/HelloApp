public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Step 1: Append every name followed by the delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            
            // Step 2: Extract the final string
            String finalNames = nameBuilder.toString();
            
            // Step 3: Remove the trailing ", " (last 2 characters)
            if (finalNames.length() > 0) {
                finalNames = finalNames.substring(0, finalNames.length() - 2);
            }
            
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}