// LEETCODE QUETSION NO. 88 MERGE TWO SORTED ARRAYS
package basic;

import java.util.Arrays;

public class Merger_Sort_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {3, 4, 5};
        merge(arr1, arr1.length, arr2, arr2.length);
        for (int x : arr1) {
            System.out.println(x);
        }
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int p = 0;
        for (int i = m - n; i < arr1.length; i++) {
            arr1[i] = arr2[p++];
        }
        Arrays.sort(arr1);
    }

}
