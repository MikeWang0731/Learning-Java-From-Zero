package ThreadComm;

public class Test {
    public static void main(String[] args) {
        messageQueue queue = new messageQueue();
        // 将新建线程和启动写在一起，参考runnableTest.java
        // 在不做任何操作时我们发现，并不是生产一个消费一个，所以我们要加上同步
        // 随后我们发现，依旧会存在”不是生产一个消费一个“的情况

        /*
        我们采用如下方案解决这个问题：
        设置一个flag，当容器中没有东西的时候，flag为false，consumer的get方法必须等待，直到有东西
        添加进容器才可以消费
        wait() -> 终端执行，使线程等待
        notify() -> 唤醒某个等待的线程
        notifyAll() -> 唤醒所有等待的线程

        注意：当线程互相等待对方时，会造成线程死锁，所以要将wait()和notifyAll()配合使用
        推荐notifyAll()是因为，如果使用notify()会随机唤醒一个线程，唤醒的不一定是我们需要的
         */

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
