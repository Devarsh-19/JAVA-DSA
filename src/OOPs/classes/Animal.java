package OOPs.classes;

public class Animal {
    public static int counter = 100;
    public String taxonomyId;
    private String breedName;

    public Animal() {
        this.breedName = "BloodHound";
        Animal.counter++;
        this.taxonomyId = "A " + ++Animal.counter;
    }

    public void display() {
        System.out.println("taxonomyId : " + this.taxonomyId);
    }
}
