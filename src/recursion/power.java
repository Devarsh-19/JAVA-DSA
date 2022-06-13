package recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(exponent(4, 3));
    }

    public static int exponent(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * exponent(base, exp - 1);
    }
}
