package basic;

public class MInNoJumps {
    static int minJumps(int[] arr) {
        int count = 0, pos = 0;
        while (pos < arr.length) {
            if (arr[pos] == 0)
                return -1;
        }


        return count;
    }
}
