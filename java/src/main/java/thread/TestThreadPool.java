package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    }
}
