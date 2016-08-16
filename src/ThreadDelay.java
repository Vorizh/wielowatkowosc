/**
 * Created by Piotr on 16.08.2016.
 */
public class ThreadDelay extends Thread {

    private int delay;

    public ThreadDelay(String name, int delay) {
        super(name);
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append("Watek: ").append(this.getName()).append(" | ").append("Iteracja: ").append(i).toString();
            System.out.println(builder);
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ThreadDelay("Pierwszy", 300).start();
        new ThreadDelay("Drugi", 100).start();
    }
}
