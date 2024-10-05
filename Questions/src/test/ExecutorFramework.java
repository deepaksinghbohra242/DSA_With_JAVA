package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(5);
        for(int i=0;i<25;i++){
            exe.execute(new Task());
        }
        System.out.println("Thread name " + Thread.currentThread().getName());
    }
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("new thread " + Thread.currentThread().getName());
    }
}

