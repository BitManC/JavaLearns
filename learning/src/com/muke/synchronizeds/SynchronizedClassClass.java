package com.muke.synchronizeds;

public class SynchronizedClassClass implements Runnable{
    static SynchronizedClassClass instance2 = new SynchronizedClassClass();
    static SynchronizedClassClass instance1 = new SynchronizedClassClass();

    @Override
    public void run() {
        method();
    }

    private void method() {
        synchronized (SynchronizedClassClass.class){ // 若其中为 this 就不可以
            System.out.println("类锁的第二种形式：synchronized(*.class). 我叫 " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 执行完毕");
        }
    }

    public static void main(String[] args){
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()){}
        System.out.println("Finished");
    }

}
