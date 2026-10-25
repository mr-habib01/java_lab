class MyThread extends Thread{
    public void run(){
        System.out.println(getName() + " Priority: " + getPriority());
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }
}
