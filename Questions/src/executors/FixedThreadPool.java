package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(() -> {
            System.out.println("this is my task "+ Thread.currentThread().getName());
        });
        executorService.shutdown();
    }
}
