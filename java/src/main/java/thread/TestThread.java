package thread;

public class TestThread extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " run " + i);
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
        // 主线程
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " run " + i);
        }
    }

}
