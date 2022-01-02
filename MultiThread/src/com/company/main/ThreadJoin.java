package com.company.main;

class join extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "正在运行...");
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        join joinThread = new join();
        joinThread.start();
        // 当这里加入join()之后，主线程一定会等joinThread线程运行完之后再运行
        joinThread.join(); // 使joinThread抢占资源
        // joinThread.join(1) -> 每次只抢占1毫秒，一毫秒之后就会让出主动权，直到下一次再抢占
        System.out.println("主线程结束运行！");
    }
}
