package synchronizacja;

/**
 * Created by Piotr on 16.08.2016.
 */
public class MyClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Main.counter++;
        }
    }
}
