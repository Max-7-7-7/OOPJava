import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Trianngle extends Figure {


    Color triangleColor = Color.valueOf("YELLOW");

    public void printTriangle() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("figure.txt");
        StringBuffer result = new StringBuffer();

        printToConsole();
        for (int i = 0; i < size; i++) {

            System.out.print(triangleColor.getColor() + star + Color.valueOf("DEFAULT").getColor());
            Objects.requireNonNull(result).append(star).append("\n");
            star = star + "* ";
            System.out.println();
        }
        printWriter.print(result);
        printWriter.close();
    }



}
