package recursion;

//Elucidean method to find the gcd of two integers.
public class GCD {
    public static void main(String[] args) {
        System.out.println(f(2685, 375));
    }

    public static int f(int a, int b) {
        if (b == 0)
            return a;

        return f(b, a % b);

    }


}
