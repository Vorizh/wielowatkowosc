import sun.awt.windows.ThemeReader;

import java.util.Random;

/**
 * Created by Piotr on 16.08.2016.
 */
public class Main {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Thread: Main");
//    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();
        MyRunnable mr3 = new MyRunnable();
        Thread thread1 = new Thread(mr1, "Pierwszy");
        Thread thread2 = new Thread(mr2, "Drugi");
        Thread thread3 = new Thread(mr3, "Trzeci");
        thread1.start();
        thread2.start();
        thread3.start();
        Random random = new Random();
        System.out.println("Usypiam watek: "+ Thread.currentThread().getName());
        Thread.sleep(random.nextInt(5000) + 1000);
        thread1.interrupt();
        System.out.println("+");
        Thread.sleep(random.nextInt(5000) + 1000);
        System.out.println("++");
        thread2.interrupt();
    }
}
