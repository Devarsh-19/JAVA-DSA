package basic;

public class MaxSubArraySum {
    public static void main(String[] args) {

        int[] arr = {-5, 4, 6, -4, 3, -1};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum > max)
                    max = sum;
            }


        }

        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        int max = 0, curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr = curr + arr[i];
            if (curr > max)
                max = curr;
            if (curr < 0)
                curr = 0;
        }

        return max;
    }
}
