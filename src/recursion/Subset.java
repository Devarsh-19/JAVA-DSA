package recursion;

import java.util.ArrayList;
import java.util.List;

// Iteratively calculating all subsets
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> l = sub(arr);
        System.out.println(l);
    }


    static List<List<Integer>> sub(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
