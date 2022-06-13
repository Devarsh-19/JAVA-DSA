package recursion;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sum(45412));
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));

    }
}
