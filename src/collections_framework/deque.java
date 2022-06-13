package collections_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static Deque<Integer> calculate(Deque<Integer> inStack) {
        Deque<Integer> outStack = new ArrayDeque<Integer>();
        Deque<Integer> tempStack = new ArrayDeque<Integer>();

        while (inStack.peek() != null) {

            Integer value1 = inStack.pop();
            Integer value2 = inStack.pop();
            System.out.println(value1 + " " + value2);

            if (value1 != null && value2 != null) {
                if (value1 - value2 > 0) {
                    outStack.push(value2);
                } else if (inStack.peek() > value1) {
                    tempStack.push(value1);
                }
            }
            float temp = 1.0f;
            while (tempStack.peek() != null) {
                temp += tempStack.pop();
                outStack.push((int) temp);
            }

        }

        return outStack;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(23);
        dq.add(50);
        dq.add(45);
        dq.add(11);
        dq.add(1);
        dq.add(0);
        System.out.println(calculate(dq));


    }
}
