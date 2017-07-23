public class Asterisks {
    void printSingleAsterisks() {
        System.out.print("*");
    }
    void drawHorizontalLine (int n) {
        for (int i = 0;i < n; i++) {
            this.printSingleAsterisks();
        }
    }
    void drawVerticalLine (int n) {
        for (int i = 0;i < n; i++) {
            this.printSingleAsterisks();
            System.out.println("");
        }
    }
    public static void main (String[] args) {
        Asterisks asterisks = new Asterisks();
        asterisks.drawVerticalLine(3);
    }
}