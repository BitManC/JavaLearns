package com.BasicalObj;

/**
 *
 * static 是一个关键字，同时是一个修饰符（与类的关系是什么？）
 *
 * static 可以修饰什么？属性， 方法，代码块， 内部类
 *
 * static 修饰属性：静态变量，类变量
 *
 *  静态变量和非静态变量的属性：
 *      1. 值的存储位置不同，
 *           静态变量：方法区
 *           非静态属性：堆
 *      2. 值的初始化的时机不同
 *           非静态属性：创建实例对象时，在<init>() 实例初始化中完成初始化
 *           静态变量：类初始化时， 在<clinit>() 类初始化方法中完成初始化
 *          静态变量的初始化比非静态的属性要早
 *      3. 共享型不同
 *          非静态的属性：每个对象是独立的，格子存了一份
 *          静态变量：所有该类对象共享一份
 *      4. 生命周期
 *          非静态的属性:随着对象的创建而存在，当对象被垃圾回收后就消失
 *          静态属性：随着类的初始化而初始化，类消失，才会消失
 *
 *          静态变量的生命周期 = 类的生命周期
 *          非静态的属性的生命周期 = 对象的生命周期， 每个对象的生命周期是独立的
 *
 * static 修饰方法
 *
 *  static 修饰方法，成为静态方法，类方法
 *      1.可以通过类名调用
 *      2.静态方法中是不允许有 this， super 这些关键字
 *      3.静态方法中不能直接使用本类的非静态的成员（属性，方法），但是非静态可以调用静态。因为周期，静态区比非静态区要存活更久
 *      4.静态方法不可以被重写，因为不管是哪个类，静态方法都属于当前类
 *
 *static 修饰代码块
 *
 *  1.作用： 非静态代码块的作用： 为非静态的属性初始化
 *          静态代码块作用：为静态的属性，静态变量初始化
 *  2.语法 ： static {}
 *  3. 执行特点： A:无论创建几个对象，静态代码块都执行一次，多个按顺序执行
 *              B:静态代码块优于非静态代码块执行
 *              因为静态代码块的执行是类初始化时执行，类初始化执行的是一个叫<clinit>的类初始化方法，类初始化的<clinit>()方法
 *              如下两个部分组成：
 *                  1. 静态变量的显式赋值
 *                  2.静态代码块
 *              C：子类初始化时，若发现父类没有初始化，会优先执行父类初始化
 *  4. 生命周期
 *      非静态的属性：随着对象的创建而存在，被垃圾回收就消失
 *      静态变量：随着类的初始化而初始化
 *
 *   5. set/get 不同
 *      非静态属性：重名用 "this."
 *      静态属性：重名用 "类名."
 *
 *
 * */

public class KeyWordsStatic {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        p1.id = 12;
        p2.id = 10;

        p1.name = "apple";
        p2.name = "HuaWei";

        System.out.println("p1.id is "+p1.id);
        System.out.println("p1.name is "+p1.name);
        System.out.println("p2.id is "+p2.id);
        System.out.println("p2.name is "+p2.name);
        p1.noway();
    }
}
class Phone{
    static String name;
    int id;
    public static void say(){
        System.out.println("hahaha");
    }
    public void noway(){
        Phone.say();
    }
}
