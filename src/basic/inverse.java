package basic;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, tmp = n, inv = 0;
        while (tmp > 0) {
            int d = tmp % 10;
            count++;

            inv = (int) (inv + ((Math.pow(10, d - 1)) * count));

            tmp = tmp / 10;
        }

        System.out.println(inv);
    }
}
