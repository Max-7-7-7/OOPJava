import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rhombus extends Figure {

    Color rhombusColor = Color.valueOf("GREEN");


    public void printRhombus() {
        printToConsole();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int star = i; star > 0; star--) {
                System.out.print(rhombusColor.getColor() + "* " + Color.valueOf("DEFAULT").getColor());
            }
            System.out.println();
        }
        for (int j = size; j > 0; j--) {
            for (int k = 0; k < size - j; k++) {
                System.out.print(" ");
            }
            for (int f = 0; f < j; f++) {
                System.out.print(rhombusColor.getColor() + "* " + Color.valueOf("DEFAULT").getColor());
            }
            System.out.println();
        }
    }


}
