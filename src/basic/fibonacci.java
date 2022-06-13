package basic;

import java.util.Scanner;

//print fibonacci numbers upto n terms....
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(a + "\n" + b);
        } else {
            System.out.println(a + "\n" + b);
            for (int i = 1; i <= n - 2; i++) {
                int c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }
}