package com.BasicalObj;

/*
*
*   内部类类型：
*   1. 根据位置：
*       1）成员内部类
*           和成员变量一样，在类中，方法外
*               1. 静态成员内部类：简称静态内部类
*               2. 非静态成员内部类：简称成员内部类
*       2）局部内部类：
*           方法内
*               1.有名字的局部内部类：局部内部类（几乎不用）
*               2.没名字的局部内部类：匿名内部类
*
*   可以调用外部类的方法，属性
*   2. 声明：
*       [修饰符] class 外部类 [extends 父类] [implements 接口们]{
*
*                [修饰符] class 外部类 [extends 父类] [implements 接口们]{
*                                                       }
*                   }
*
*   3. 使用：
*       1）在静态内部类中不允许使用外部类的非静态成员
*       2）在外部类中，使用静态内部类和使用其他类一样
*       3）在外部类的外面使用静态内部类，不需要外部类对象
*       4）在外部类的外面调用静态内部类的非静态方法，需要静态内部类对象
*       5）在外部类的外面调用静态内部类的静态方法，不需要静态内部类对象
*
* */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.printOuter();
        oi.printStatic();
        Outer.Inner.printStatic();
    }
}
class Outer{
    private int a;
    private static int b;
    static class Inner{
        public void printOuter(){
            System.out.println("Outer private int : " + b );  // 调用 a 会报错
        }
        public static void printStatic(){
            System.out.println(b);
        }

    }
}