package thread;

public class Thread2 extends Thread{
    public void run(){
        System.out.println("code run by thread : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Main is running " + Thread.currentThread().getName());
        Thread2 obj = new Thread2();
        obj.start();
        System.out.println("Obj thread over" + Thread.currentThread().getName());
    }
}
