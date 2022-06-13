package OOPs.classes;

public class Anonymous_demo1 {
    void display() {
        System.out.println("DISPLAY METHOD OF SUPER CLASS");
    }
}

class Demo2 {
    static Anonymous_demo1 d = new Anonymous_demo1() {
        @Override
        void display() {
            super.display();
            System.out.println("INSIDE DEMO 2.");
        }
    };

    public static void main(String[] args) {
        d.display();
    }
}