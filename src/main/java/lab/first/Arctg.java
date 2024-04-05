package lab.first;

public class Arctg {
    public static double calc(double x, int n) {
        if (Math.abs(x) > 1.0) {
            return Math.PI / 2.0 - approximate(1 / x, n);
        }
        return approximate(x, n);
    }

    /*
     * arctg(x) = (-1)^(n-1) * (x^(2n - 1))/(2*n - 1)
     */
    private static double approximate(double x, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / (2 * i + 1)));
        }
        return sum;
    }
}
