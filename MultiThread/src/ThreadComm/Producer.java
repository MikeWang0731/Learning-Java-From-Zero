package ThreadComm;

public class Producer implements Runnable {

    messageQueue queue;

    Producer(messageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                queue.setN(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
