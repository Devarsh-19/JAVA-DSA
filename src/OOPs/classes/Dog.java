package OOPs.classes;

public class Dog extends Animal {
    private static int dogCount = 1;
    private String dogBreedName;

    @Override
    public void display() {
        super.display();
        System.out.println("value of dog count " + ++Dog.dogCount);
    }
}
