package recursion;

public class Print_N_Nos {
    public static void main(String[] args) {
        print(1, 6);
    }

    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        i++;
        print(i, n);
    }
}
