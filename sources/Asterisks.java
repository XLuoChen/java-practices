public class Asterisks {
    void printSingleAsterisks() {
        System.out.print("*");
    }
    void drawHorizontalLine (int n) {
        for (int i = 0;i < n; i++) {
            this.printSingleAsterisks();
        }
    }
    public static void main (String[] args) {
        Asterisks asterisks = new Asterisks();
        asterisks.drawHorizontalLine(8);
    }
}