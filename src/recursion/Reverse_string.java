package recursion;

public class Reverse_string {
    public static void main(String[] args) {
        String s = "ABCDE";
        System.out.println(s.substring(1, 4));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1) + str.charAt(0));
    }
}
