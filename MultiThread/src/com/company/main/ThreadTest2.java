package com.company.main;

class myThreadTwo extends Thread {

    public myThreadTwo(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "线程正在运行第" + (i + 1) + "次");
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        // 线程之间随机交替运行
        myThreadTwo thread = new myThreadTwo("线程1");
        myThreadTwo thread2 = new myThreadTwo("线程2");
        thread.start();
        thread2.start();
    }
    /*
    线程的状态：
    New -> Runnable -> Running or Blocked -> Dead

     */
}
