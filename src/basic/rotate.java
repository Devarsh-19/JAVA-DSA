package basic;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0, tmp = n;

        while (tmp > 0) {
            int d = tmp % 10;
            count++;
            tmp = tmp / 10;
        }

        int rem = (int) (n % (Math.pow(10, k)));
        int quo = (int) (n / (Math.pow(10, k)));

        int result = (int) (rem * Math.pow(10, count - k)) + quo;

        System.out.println(result);
    }
}
