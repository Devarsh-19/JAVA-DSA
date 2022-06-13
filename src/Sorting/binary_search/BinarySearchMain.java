//Print the smallest element in the array greater or equal to target element.
package Sorting.binary_search;

import java.util.Scanner;

public class BinarySearchMain {

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return end + 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int result = search(arr, target);
        System.out.println(arr[result]);
    }
}


