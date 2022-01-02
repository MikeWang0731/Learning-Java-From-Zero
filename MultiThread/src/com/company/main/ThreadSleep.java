package com.company.main;


// 必须继承自Thread类才能实现一个线程
class sleep extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在运行...");
            try {
                Thread.sleep(500); // 每运行一次休息500毫秒
            } catch (InterruptedException e) {
                System.out.println("线程被中断！");
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        // 当前有两个线程：main主线程和myThread线程
        sleep sleep = new sleep();
        // 启动线程，只能调用一次start()
        sleep.start();
    }
}
