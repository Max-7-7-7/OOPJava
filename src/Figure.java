import java.util.Scanner;

public abstract class Figure {

    static int size;
    static int size2;
    static String star = "* ";

    public Figure() {
    }

    public void printToConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Negative number or zero is not allowed. Please enter a positive number");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Only positive number is allowed");
                size = scanner.nextInt();
                if (size <= 0) {
                    throw new NumericFormatException();
                }
            }
        }
    }

    static class NumericFormatException extends RuntimeException {

    }

    public void printToConsole2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter second number: ");
        size2 = scanner.nextInt();

    }

}
