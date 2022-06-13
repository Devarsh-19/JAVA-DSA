package hash_map;

public class Main {
    public static void main(String[] args) {
        DirectChaining obj = new DirectChaining(10);
        obj.insertTable("a");
        obj.insertTable("b");
        obj.insertTable("ab");

        obj.displayTable();
    }
}
