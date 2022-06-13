package linked_list.SinglyLL;

import linked_list.Node;

public class SLL {
    Node head;
    int size;

    SLL() {
        head = null;
        size = 0;
    }

    public void createSLL(int val) {
        head = new Node();
        head.data = val;
        head.next = null;
        size = 1;
    }

    public void insert(int val, int pos) {
        Node node = new Node();
        node.data = val;
        if (head == null) {
            createSLL(val);
            return;
        }

        if (pos == 0) {
            node.next = head;
            head = node;

        } else if (pos >= size) {
            Node tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;

            tmp.next = node;
            node.next = null;
        } else {
            Node tmp = head;
            int index = 0;
            while (index < pos - 1) {
                tmp = tmp.next;
                index++;
            }
            Node nxt = tmp.next;
            tmp.next = node;
            nxt.next = nxt;

        }

        size++;

    }


    public void traverse() {
        if (head == null) return;
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tmp.data);
            if (i != size - 1)
                System.out.print(" -> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void searchList(int val) {
        if (head == null) return;
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data == val) {
                System.out.println("Node found at " + (i + 1));
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("Node not found.");
    }


    public void deletion(int pos) {
        if (head == null) return;
        if (pos == 0) {
            head = head.next;
            size--;
            return;
        } else if (pos >= size) {
            Node tmp = head;
            for (int i = 0; i < size - 1; i++) {
                tmp = tmp.next;
            }
            if (tmp == head) {
                head = null;
                size--;
                return;
            }
        }
        Node tmp = head;
        for (int i = 0; i < pos - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        size--;
    }
}
