package linked_list.CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL obj = new CLL();
        obj.createCLL(34);
        System.out.println(obj.head.data);

        obj.createCLL(1);
        obj.insert(2, 2);
        obj.insert(3, 3);
        obj.traverse();
    }
}
