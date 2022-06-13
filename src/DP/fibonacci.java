package DP;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n + 1];

        Arrays.fill(arr, -1);

        System.out.println(fib(n, arr));

    }

    public static int fib(int n, int[] arr) {
        if (arr[n] == -1) {
            if (n <= 1)
                arr[n] = n;
            else
                arr[n] = fib((n - 1), arr) + fib((n - 2), arr);
        }
        return arr[n];
    }
}
