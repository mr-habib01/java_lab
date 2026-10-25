
public class ThreadDemo extends Thread {
    volatile boolean suspended = false;
    volatile boolean stopped = false;

    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println("Thread is running...");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("Thread stopped.");
    }

    public static void main(String[] args)
            throws InterruptedException {

        ThreadDemo t = new ThreadDemo();
        t.start();

        Thread.sleep(1500);
        t.suspended = true;
        System.out.println("Thread suspended.");

        Thread.sleep(1500);
        t.suspended = false;
        System.out.println("Thread resumed.");

        Thread.sleep(1500);
        t.stopped = true;
        System.out.println("Stop operation requested.");
    }
}
