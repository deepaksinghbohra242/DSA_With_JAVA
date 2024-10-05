package thread;

public class Thread1 implements Runnable{
    @Override
    public void run() {

        System.out.println("Thread is running" + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        System.out.println("thread " +  Thread.currentThread().getName());
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("thread1 " + Thread.currentThread().getName());
    }


}
