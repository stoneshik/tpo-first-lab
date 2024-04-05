package lab.first;

public class Arctg {
    private static final double HALF_PI = Math.PI / 2.0;

    public static double calc(double x, int n) {
        if (x < -1.0) {
            return -HALF_PI - approximate(1 / x, n);
        }
        if (x > 1.0) {
            return HALF_PI - approximate(1 / x, n);
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
