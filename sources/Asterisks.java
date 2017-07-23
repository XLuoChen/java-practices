public class Asterisks {
    void printSingleAsterisks () {
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

    void drawRightTriangle (int n) {
        for (int i = 0;i < n; i++) {
            for (int j = 0;j <= i;j++) {
                this.printSingleAsterisks();
            }
            System.out.println("");
        }
    }

    void drawIsoscelesTriangle (int n) {
        for (int i = 0;i < n; i++) {
            for (int k = 1;k < n-i;k++) {
                System.out.print(" ");
            }
            for (int j = 0;j < (2*i+1);j++) {
                this.printSingleAsterisks();
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        Asterisks asterisks = new Asterisks();
        asterisks.drawIsoscelesTriangle(3);
    }
}