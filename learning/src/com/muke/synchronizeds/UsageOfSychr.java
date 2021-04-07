package com.muke.synchronizeds;

/*
* 对象锁：包括方法锁（默认锁对象为this 当前实例对象）和同步代码块锁（自己指定锁对象）
*
* 类锁：指 synchronized修饰静态的方法或指定锁为 class对象
*
* 描述：对象锁示例1，代码块形式
* */

public class UsageOfSychr implements Runnable{

    static UsageOfSychr instance = new UsageOfSychr();
    Object o1 = new Object();
    Object o2 = new Object();
    @Override
    public void run() {
//        synchronized (this) {
//            System.out.println("对象锁代码块形式，我叫" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "运行结束");
//        }
        synchronized (o1) {
            System.out.println("lock1 " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " lock1 运行结束");
        }
        synchronized (o2) {
            System.out.println("lock2 " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " lock2 运行结束");
        }
    }

    public static void main(String[] args){
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()){}
        System.out.println("Finished");
    }



}
