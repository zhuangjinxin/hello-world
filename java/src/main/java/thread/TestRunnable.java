package thread;

public class TestRunnable implements Runnable {


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " run " + i);
        }
    }

    public static void main(String[] args) {
        TestRunnable runnable = new TestRunnable();
        new Thread(runnable).start();
        // 主线程
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " run " + i);
        }
    }
}
