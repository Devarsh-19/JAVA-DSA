package linked_list.SinglyLL;

public class Main {
    public static void main(String[] args) {
        SLL obj = new SLL();
        obj.createSLL(1);
        obj.insert(4, 2);
        obj.insert(6, 3);

        obj.traverse();

        obj.createSLL(5);
        obj.insert(45, 2);
        obj.insert(66, 3);

        obj.traverse();

        obj.searchList(66);
        obj.searchList(1);

        obj.traverse();

        obj.insert(1, 34);

        obj.traverse();

        obj.deletion(2);
        obj.traverse();

    }
}
