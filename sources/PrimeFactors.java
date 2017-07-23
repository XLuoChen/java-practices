import java.util.ArrayList;

public class PrimeFactors {
    void generate (int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2;i < n/i;i++) {
            if (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }

        for (Integer item : factors) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.generate(60);
    }
}