package linked_list.CircularLL;

import linked_list.Node;

public class CLL {
    public Node head;
    public int size;

    CLL() {
        head = null;
        size = 0;
    }

    public void createCLL(int val) {
        head = new Node();
        head.data = val;
        head.next = head;
        size = 1;
    }

    public void insert(int val, int pos) {
        Node node = new Node();
        node.data = val;

        if (head == null) {
            createCLL(val);
            return;
        }
        if (pos == 0) {
            node.next = head;
            head = node;
        } else if (pos >= size) {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
            node.next = head;

        } else {
            Node tmp = head;
            int i = 0;
            while (i < pos - 1) {
                tmp = tmp.next;
                i++;
            }
            node.next = tmp.next;
            tmp.next = node;
        }
    }


    public void traverse() {
        if (head != null) {
            Node tmp = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tmp.data);
                if (i != size)
                    System.out.println(" -> ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("List does not exist.");
        }
    }

    public boolean search(int val) {
        if (head == null) return false;
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data == val) {
                System.out.println("Node found at position " + i);
                return true;
            }
            tmp = tmp.next;
        }
        System.out.println("Node not found.");
        return false;
    }

}
