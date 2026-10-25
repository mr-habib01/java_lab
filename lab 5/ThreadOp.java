//5. Write a Java program to illustrate suspend, resume and stop operation of thread.
class ThreadDemo extends Thread {
    boolean suspended = false;
    boolean stopped = false;

    synchronized void suspendThread() {
        suspended = true;
    }

    synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify();
    }

    public void run() {
        try {
            while (!stopped) {
                synchronized (this) {
                    while (suspended && !stopped) {
                        wait();
                    }
                }

                if (!stopped) {
                    System.out.println("Thread is running...");
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Thread stopped.");
    }

    public static void main(String[] args)
            throws InterruptedException {
        ThreadDemo t = new ThreadDemo();
        t.start();

        Thread.sleep(1500);
        t.suspendThread();
        System.out.println("Thread suspended.");

        Thread.sleep(1500);
        t.resumeThread();
        System.out.println("Thread resumed.");

        Thread.sleep(1500);
        t.stopThread();
    }
}
