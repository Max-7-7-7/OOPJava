public enum Color {
    DEFAULT("\033[0m"),
    RED("\033[91m"),
    YELLOW("\033[93m"),
    GREEN("\033[92m");
    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
