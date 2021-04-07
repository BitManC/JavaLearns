package com.BasicalObj;

/*
类成员 ： 1. attribute 2. function 3. constructor 4. 代码块 block
作用： 为属性初始化
一、 非静态代码块
1.  语法格式：
【 修饰符】 class 类名 【 extend 父类】{
            {
                非静态代码块
            }
         }
2. 执行特点
    1）在创建对象时自动执行，每创建一个就执行一次
        若有多个非静态代码块，按顺序以此执行
    2）先于构造器执行
    3）非静态代码块与属性显示赋值按顺序执行
    4）如果创建子类对象，会先执行父类的"非静态代码块，显式赋值，父类的构造器"
3. 实例初始化
    .java 编译 .class 时，会把代码重新组装，如果类中有n个构造器，就会重新组装为n个实例初始化的方法
    无参构造-> <init>()
    有参构造-> <init>(形参列表）
 */


public class staticBlock {

    public static void main(String[] args) {
//        System.out.println("无参构造调用");
//        Wa n = new Wa();
//        System.out.println(n.getVal());
//        System.out.println("有参构造调用");
//        System.out.println("-----------------------");
//        Wa y = new Wa(4);
//        System.out.println(y.getVal());
        AnimalD an = new Cat();
        an.eat();
        an.sleep();
        Cat ca = new Cat();
        ca.eat();
        ca.sleep();
    }
}

class Wa {
    private int val = setVal();
    {
        System.out.println(" 第一个代码块");
        val = 2;
    }
    {
        System.out.println(" 第二个代码块");
        val = 3;
    }
    Wa(){
        System.out.println("无参构造器最后执行，是因为加载所有类之后，才可以会构建整体");
    }
    Wa(int val){
        System.out.println("有参出现就不会调用无参，但是都是最后执行");
    }
    public int setVal(){
        System.out.println("方法区 ");
        return 1;
    }
    public int getVal() {
        return val;
    }
}
class AnimalD{
    int num = 10;
    static int age = 20;
    public void eat(){
        System.out.println("Animal eating");
    }
    public static void sleep(){
        System.out.println("Animal sleep");
    }
}

class Cat extends AnimalD{
    int num = 30;
    static int age = 40;
    public void eat(){
        System.out.println("Cat eat fish");
    }
    public static void sleep(){
        System.out.println("Cat sleeping");
    }

}