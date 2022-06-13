package OOPs.classes;

public class Tester {
    public static void main(String[] args) {
        Animal obj = new Dog();
        Animal.counter++;
        obj.display();
    }
}
