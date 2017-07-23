public class FizzBuzz {
    void print () {
        for (int i = 1;i <= 100;i++) {
            boolean divisibledByThree = (i % 3 == 0) ? true : false;
            boolean divisibledByFive = (i % 5 == 0) ? true : false;

            if (divisibledByThree && divisibledByFive) {
                System.out.println("FIZZBUZZ");
            }
            else if (divisibledByThree) {
                System.out.println("FIZZ");
            }
            else if (divisibledByFive) {
                System.out.println("BUZZ");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print();
    }
}