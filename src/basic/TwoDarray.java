package basic;

import java.util.Arrays;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = j + i;
            }
        }

        System.out.println(Arrays.deepToString(arr));
        traverse(arr);
    }

    static void traverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
