package com.BasicalObj;



/*
*  this
*   1） 构造器中： 代表创建实例对象
*   2） function 中： 代表使用这个方法的对象
*   用法：
*   1. this.attribution ： 成员变量(属性)或者局部变量重名时，成员变量(属性)加this
*   2. this.function: 调用对象的其他方法，也可以省略
*   3. this() or this(实参列表)
*
*  super ： 父类的
*   前提： 访问父类的非 private 类型
*
*  结论：
*
*       就近原则：
*       1. 没有 this, super : 局部变量 -> 本类 -> 父类可见属性
*       2. 有 this : 本类 -> 父类可见属性
*       3. 有 super : 父类
*
*  构造器： 子类一定会调用父类构造器，若父只有有参构造，没有无参构造，但是子类需要，需手动写
*
* */

public class SuperKey {
    public static void main(String[] args) {
        Animal a1 = new Animal("Animal");
        Dog d1 = new Dog("wangwang");
        System.out.println(a1.getName());
        System.out.println(d1.getName());
    }
}


class Animal{

    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("this type is :" + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Dog(String name) {
        super(name);
    }
}