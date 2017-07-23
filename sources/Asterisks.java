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

    void drawDiamond (int n) {
        for (int i = 0;i < n/2+1; i++) {
            for (int k = 1;k < n-i;k++) {
                System.out.print(" ");
            }
            for (int j = 0;j < (2*i+1);j++) {
                this.printSingleAsterisks();
            }
            System.out.println("");
        }
        for (int i = n/2;i > 0; i--) {
            for (int k = n-i;k > 0;k--) {
                System.out.print(" ");
            }
            for (int j = (2*i-1);j > 0 ;j--) {
                this.printSingleAsterisks();
            }
            System.out.println("");
        }
    }
    void drawDiamondWithName (int n) {
        for (int i = 0;i < n/2; i++) {
            for (int k = 1;k < n-i;k++) {
                System.out.print(" ");
            }
            for (int j = 0;j < (2*i+1);j++) {
                this.printSingleAsterisks();
            }
            System.out.println("");
        }
        System.out.println("Luo Chengxiu");
        for (int i = n/2;i > 0; i--) {
            for (int k = n-i;k > 0;k--) {
                System.out.print(" ");
            }
            for (int j = (2*i-1);j > 0 ;j--) {
                this.printSingleAsterisks();
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        Asterisks asterisks = new Asterisks();
        asterisks.drawDiamondWithName(7);
    }
}