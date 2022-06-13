package linked_list.DoublyLL;

public class Main {
    Node head;
    int size;

    Main() {
        head = null;
        size = 0;
    }

    public Node create(int val) {
        head.data = val;
        head.next = null;
        head.prev = null;

        size = 1;
        return head;
    }

    public void insert(int pos, int val) {
        if (head == null) {
            create(val);
            return;
        }
    }
}
