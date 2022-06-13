package OOPs.classes;

public class Main {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.display();
    }
}
