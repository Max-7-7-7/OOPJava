import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Square square = new Square();
        square.printSquare();

        Triangel1 triangle1 = new Triangel1();
        triangle1.printTriangle1();

        Triangel2 triangle2 = new Triangel2();
        triangle2.printTriangle2();

        Rhombus rhombus = new Rhombus();
        rhombus.printRhombus();

    }
}