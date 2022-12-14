public class Triangel2 extends Figure {

    Color triangleColor = Color.valueOf("YELLOW");

    public void printTriangle2() {
        printToConsole();
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int star = i; star > 0; star--) {
                System.out.print(triangleColor.getColor() + "* " + Color.valueOf("DEFAULT").getColor());
            }
            System.out.println();
        }

    }

}
