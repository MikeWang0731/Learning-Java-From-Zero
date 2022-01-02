package ThreadComm;

public class messageQueue {
    private int n;
    private boolean flag = false;

    public synchronized int getN() throws InterruptedException {
        // 当容器中没有元素时(flag is false)，消费动作进入等待状态
        if (!flag) {
            wait();
        }
        System.out.println("消费：" + n);
        flag = false;
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) throws InterruptedException {
        // 当容器中有元素时(flag is true)，生产动作进行等待
        if (flag) {
            wait();
        }
        System.out.println("生产： " + n);
        this.n = n;
        flag = true; // 生产完毕，有数据，flag set to true
        notifyAll();
    }
}
