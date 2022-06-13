package recursion;

public class n_nums {
    public static void main(String[] args) {
        int n = 5;
        f(1, n);
    }

    static void f(int i, int x) {
        if (i > x)
            return;

        System.out.println(i);
        i++;

        f(i, x);
    }
}
