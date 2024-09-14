public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <operation> <num1> <num2>");
            System.out.println("Operations: add, subtract, multiply, divide");
            return;
        }

        String operation = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "divide":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation. Please use add, subtract, multiply, or divide.");
        }
    }
}
 