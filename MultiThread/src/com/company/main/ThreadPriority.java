package com.company.main;

class myThreadPriority extends Thread {
    private String name;

    public myThreadPriority(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在运行第" + (i + 1) + "次");
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("主线程优先级："+Thread.currentThread().getPriority());
        myThreadPriority myThread = new myThreadPriority("线程1");
        myThread.setPriority(Thread.MAX_PRIORITY); // Thread.MAX_PRIORITY=10
        myThread.start();
        System.out.println("线程1的优先级："+ myThread.getPriority());

        myThreadPriority myThread2 = new myThreadPriority("线程2");
        myThread2.setPriority(Thread.MIN_PRIORITY); // Thread.MIN_PRIORITY=1
        myThread2.start();
        System.out.println("线程2的优先级："+ myThread2.getPriority());
    }

    /*
    多线程运行问题：
    1. 各个线程通过竞争CPU时间而获得运行机会
    2. 线程在何时取得CPU时间，占用多久，都是不可预测的
    3. 一个正在运行的线程在什么地方暂停是不知道的
     */
}
