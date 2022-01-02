package com.company.main;

// 必须继承自Thread类才能实现一个线程
class myThread extends Thread{
    public void run() {
        System.out.println(getName() + "线程正在运行...");
    }
}

// 线程运行的顺序是随机的
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1 正在运行...");
        // 当前有两个线程：main主线程和myThread线程
        myThread thread = new myThread();
        // 启动线程，只能调用一次start()
        thread.start();
        System.out.println("主线程2 正在运行...");
    }
}
