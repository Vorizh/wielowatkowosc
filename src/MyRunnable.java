import java.util.Random;

/**
 * Created by Piotr on 16.08.2016.
 */
public class MyRunnable implements Runnable {

    private Random rnd = new Random();
    private String name;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            name = Thread.currentThread().getName();
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Watek (" + name + ") zostal przerwany.");
                return;
            }

            System.out.println(name + " - budze sie");
            System.out.println(name + " - Iteracja: " + i);
            try {
                int s = rnd.nextInt(2500) + 500;
                System.out.println(name + " - Ide spac na " + s + " ms");
                Thread.sleep(s);
            } catch (InterruptedException e) {
                System.out.println("Watek (" + name + ") zostal przerwany.");
                return;
            }
        }
        System.out.println("Watek (" + name + ") zostal zakonczony.");
    }
}
