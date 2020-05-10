package thread;

// 生产者 消费者
public class ProducerAndConsumer {

    public static void main(String[] args) {
        Product product = new Product();
        new Producer(product).start();
        new Consumer(product).start();
    }
}

class Producer extends Thread {
    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            this.product.produce();
            System.out.println("produce ... ");
        }
    }

}

class Consumer extends Thread {
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            this.product.consume();
            System.out.println("consume ...");
        }

    }
}


class Product {
    public boolean flag = false;

    public synchronized void produce() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.flag = true;
        this.notifyAll();
    }

    public synchronized void consume() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.flag = false;
        this.notifyAll();

    }
}

