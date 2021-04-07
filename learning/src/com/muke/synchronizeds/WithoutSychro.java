package com.muke.synchronizeds;
/*
* Synchronized: 保证同一时刻最多只有一个线程执行该代码，以保证并发安全的效果
* */
public class WithoutSychro implements Runnable{
    static WithoutSychro instance = new WithoutSychro();
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

        t1.join();// 等待执行完毕，再进行下一行
        t2.join();
        System.out.println(i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000; j ++){
            i++;
        }
    }
//    @Override
//    public synchronized void run() {
//        for (int j = 0; j < 10000; j ++){
//            i++;
//        }
//    }
//    @Override
//    public void run() {
//        synchronized (this){
//        for (int j = 0; j < 10000; j ++){
//            i++;
//            }
//        }
//    }
//    @Override
//    public void run() {
//        synchronized (WithoutSychro.class) {
//            for (int j = 0; j < 10000; j++) {
//                i++;
//            }
//        }
//    }

}
