public class Triangel1 extends Figure {
    Color triangleColor = Color.valueOf("RED");

    public void printTriangle1() {
        printToConsole();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(triangleColor.getColor() + star + Color.valueOf("DEFAULT").getColor());
            }
            System.out.println();
        }
    }
}
