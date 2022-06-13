package recursion;

import collections_framework.Arraylist;

public class SubSequence {
    public static void main(String[] args) {
        String nm = "ABC";

        sub("", nm);
    }

    static void sub(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub(p, up.substring(1));
        sub(p + ch, up.substring(1));
    }


    static Arraylist<String> sub1(String p, String up, Arraylist<String> s) {

        if (up.isEmpty()) {
            s.
                    System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        sub(p, up.substring(1));
        sub(p + ch, up.substring(1));
    }
}
