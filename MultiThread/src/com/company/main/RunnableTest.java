package com.company.main;

class printRunnable implements Runnable {

    @Override
    // Thread.currentThread().getName() -> 使用这个静态方法来获取当前线程的名字
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行第" + (i + 1) + "次");
        }
    }
}

/**
 * Thread(Runnable target) -> 创建一个基于Runnable接口的线程对象
 * Thread(Runnable target, String name) -> 和上面一样，多个名字
 */

public class RunnableTest {
    public static void main(String[] args) {
        // Step 1
        printRunnable runnable = new printRunnable();
        printRunnable runnable2 = new printRunnable();
        // Step 2
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        // Step 3
        thread1.start();
        thread2.start();
    }
}
