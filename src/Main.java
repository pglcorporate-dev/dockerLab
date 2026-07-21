public class Main {

    public static void main(String[] args) {

        System.out.println("Application started.");
        int iterations = 0; 
        int counter = 0;

        // Check if an argument was passed
        if (args != null && args.length > 0 && args[0] != null) {
            try {
                // Parse the string argument into an integer
                iterations = Integer.parseInt(args[0]);
                System.out.println("Custom iterations set to: " + iterations);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Using default: 5000ms");
            }
        } else {
            System.out.println("No arguments provided. Using default: 5000ms");
            iterations = 3;
        }

        while (counter <iterations) {

            System.out.println("Hello from Docker!");
            counter ++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }

        }

    }

}