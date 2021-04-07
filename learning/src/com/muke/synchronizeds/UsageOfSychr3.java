package com.muke.synchronizeds;
/*
* 类锁：Java 类可能有很多个对象，但只有一个 Class 对象
*
* 形式1： synchronized 加在 static 方法上
*
* 形式2： synchronized( *.class ) 代码块
*
* 只有一个Class对象：JAVA 类可以有很多对象，但是只有1个Class对象
*
* 本质：所谓类锁，不过是Class对象的锁而已，这样可以保证同一时刻一个类只有一个对象
*
* 用法和效果：类锁只能在同一时刻被一个对象拥有
* */
public class UsageOfSychr3 implements Runnable{
    // 形式1， static
    static UsageOfSychr3 instance1 = new UsageOfSychr3();
    static UsageOfSychr3 instance2 = new UsageOfSychr3();


    @Override
    public void run() {
        method();
    }
    public static synchronized void method(){
        // 全局类同步保护
        System.out.println("类锁的第一类形式：static 形式。 我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " 运行结束");
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
