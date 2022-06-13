package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Permuatation {

    static char[] findSmallestPermutation(String s1) {

        char[] s = s1.toCharArray();
        Arrays.sort(s);

        int i = 0;
        while (s[i] == '0')
            i++;

        char temp = s[0];
        s[0] = s[i];
        s[i] = temp;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        char[] res = findSmallestPermutation(s);
        System.out.println(res);
    }
}

