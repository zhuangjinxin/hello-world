package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCallable  implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        return null;
    }

    public static void main(String[] args) {
        TestCallable callable = new TestCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(callable);
        executorService.submit(callable);
        executorService.submit(callable);
        executorService.shutdown();
    }
}
