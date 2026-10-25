class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(getName()+ ": " + i);
            if (i==2) {
                Thread.yield();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        Thread.sleep(1000);
        t2.interrupt();
    }
}
