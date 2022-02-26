import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter a command:");
            command = scanner.next();

            if (command.equals("add")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(calculator.add(a, b));
                System.out.println();
            }

            if (command.equals("subtract")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(calculator.subtract(a, b));
                System.out.println();
            }

            if (command.equals("multiply")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(calculator.multiply(a, b));
                System.out.println();
            }

            if (command.equals("divide")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(calculator.divide(a, b));
                System.out.println();
            }

            if (command.equals("fibonacci")) {
                int n = scanner.nextInt();
                System.out.println(calculator.fibonacciNumberFinder(n));
                System.out.println();
            }

            if (command.equals("binary")) {
                int n = scanner.nextInt();
                System.out.println(calculator.intToBinaryNumber(n));
                System.out.println();
            }

        } while (!command.equals("quit"));

        System.out.println("Goodbye!");
    }
}
