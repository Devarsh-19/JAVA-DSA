package basic;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(40, 3));
    }

    static double root(int n, int p) {
        int s = 0, e = n;
        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 10;

            if (m * m == n)
                return m;

            if (m * m > n)
                e = m - 1;
            else
                s = m + 1;
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
