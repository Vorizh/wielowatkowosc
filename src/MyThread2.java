/**
 * Created by Piotr on 16.08.2016.
 */
public class MyThread2 extends Thread {

    public MyThread2(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        new MyThread2("Pierwszy watek").start();
        new MyThread2("Drugi watek").start();
    }
}
