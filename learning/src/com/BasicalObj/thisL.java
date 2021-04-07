package com.BasicalObj;


/**
 * this 主要解决指代不清晰问题， 形参与属性名发生冲突时，会使用
 */

public class thisL {
    public static void main(String[] args) {
        Person p1 = new Man();
        p1.setName("Tom");
        p1.walk();

    }


}
class Person{
    private String name;
    private int age;

    public Person(){
        System.out.println("父类无参构造！");
    };

    public Person(int age) {
        this();  // 这里会调用 构造器中的方法
//        this("yif");
        this.age = age;
    }
    public Person(String name) {
        this(2);
        this.name = name;
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;  // 设置的时候，name 就近原则表示的是传入的参数， 而 this.name 表示 class 中的属性
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk(){
        System.out.println(this.getName() + " Walk");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}


class Man extends Person{
    /**
     * 1.子类不会继承父类构造器，但是子类的构造器会调用
     * 2.子类可以继承父类方法，但是属性或者方法是私有，不可以直接使用
     */

    public Man() {
        System.out.println("子类无参构造！");
    }

    public Man(int age) {
        super(age);
    }

    public Man(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " free walk ");;
    }
}