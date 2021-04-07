package com.BasicalObj;



/*
*   接口：代表一种标准
*
*   Java 具有通用性，Java 就需要有一套标准
*
*    *
 *  [修饰符] interface 接口名 {}
 *
 *  接口成员有哪些？
 *  JDK1.8 之前
 *  1、全局的静态常量： public  static final
 *  2、公共的抽象的方法： public abstract
 *
 *  JDK1.8 之后
 *  1、增加了两类成员
 *      1）静态方法： public static, 被实现后依然只属于接口，只可以接口来调用
 *      2）默认方法: public defalut， 被实现后，可以被实现的类所调用，可以被重写
 *
 *  说明：接口是没有构造器，代码块，除了全局的静态的常量以外的普通的属性等
 *
 *
 *  3、接口用来实现
 *  [修饰符]  class 实现类 implements 接口们 {}
 *
 *  4. 接口的特点
 *      1） 现实类在实现接口时，必须实现接口的所有的抽象方法，否则这个类必须是抽象类
 *      2） 一个类可以实现多个接口
 *      3） 先继承再实现接口
 *      4）接口可以与实现类的对象构成多态引用且不可以创建对象
 *
 *  5. 接口冲突，实现的两个接口有相同的签名方法，两个方式解决：
 *      1） 保留其中一个接口的默认实现
 *              接口名.super.run()  此处的接口名为保留的接口
 *      2） 完全重写
 *
 *      继承类与接口方法中重名怎么办？
 *          默认保留父类
 *
* */
public class InterfaceLearn {



    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i ++){
            for (int j = i; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
interface Fly{
    String INFO = "FFFF";
    abstract void fly();
}

interface Eating{
    abstract void eat();
}
class Bird implements Fly , Eating{
    @Override
    public void fly() {
        System.out.println("i can fly");
    }

    @Override
    public void eat() {
        System.out.println("i can eat");
    }
}