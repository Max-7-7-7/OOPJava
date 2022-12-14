import java.util.Scanner;

public class Square extends Figure {
    Color squareColor = Color.valueOf("YELLOW");

    public void printSquare() {
        printToConsole();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareColor.getColor() + star + Color.valueOf("DEFAULT").getColor());
            }
            System.out.println();
        }
    }


    Color rectangleColor = Color.valueOf("GREEN");

    public void printRectangle() {
        printToConsole();
        printToConsole2();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(rectangleColor.getColor() + star + Color.valueOf("DEFAULT").getColor());
            }
            System.out.println();
        }
    }
}
