package com.BasicalObj;

/*
*  abstruct 也是修饰符，可以修饰： 类， 方法
*   为什么需要抽象？ 子类都有，但是无法统一，就用抽象类
*   需求：
*       1.设计一个图形类 GraphiC
*       2.这个图形类有很多子类：3，4，5，6边形，这些有图形通用的属性，应在父类GraphiC中，此时应有抽象类
*
*
*   抽象类特点：
*   1. 抽象类不能直接 new 对象
*   2. 抽象类是用来被继承，子类继承后必须实现所有抽象方法，不然子类也是抽象类
*   3. 抽象类的变量可以与子类的对象构成多态引用，执行子类重写的方法
*   4. 抽象类可以和普通类一样，拥有属性，构造器，代码块，非抽象的方法等成员
*   用法：只可以被继承，继承之后重写
*
* */

public class Abstructor {
}
abstract class Graph
{
    private String name;
    public abstract double getArea();
}
class Circle extends Graph{
    private int r;
    public Circle(int r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI * this.r * this.r;
    }

}