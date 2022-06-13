package OOPs.classes;

public class Anonymous_demo2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("CHILD THREAD.");
            }
        });

        t.start();
        System.out.println("MAIN THREAD.");
    }
}
