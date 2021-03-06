package com.muke.synchronizeds;
/*
* 对象锁示例2， 方发锁形式
* */
public class UsageOfSychr2 implements Runnable{
    static UsageOfSychr2 instance = new UsageOfSychr2();

    public static void main(String[] args){
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()){}
        System.out.println("Finished");
    }

    @Override
    public void run() {
        method();
    }

    public synchronized void method(){
        System.out.println("对象锁的方法修饰符形式， 我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " 运行结束");
    }
}
