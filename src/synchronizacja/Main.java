package synchronizacja;

/**
 * Created by Piotr on 16.08.2016.
 */
public class Main {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyClass());
        Thread t2 = new Thread(new MyClass());
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println("Wartosc counter: " + counter);
    }
}
