package com.BasicalObj;

/**
 * 构造器
 * 1. 创建类对象, 初始化一个类，也就是构造一个类
 * 2.
 * 3.
 * Notes:
 * 1.若没有显式提供的构造器的话，会提供一个默认的构造器，无参构造器
 * 2.若显示声明，则使用带参数的构造器
 * 3.若构建了显示的构造器，则系统不再提供默认的空参构造器
 *
 *
 * */

public class constructor {
    public static void main(String[] args) {
        PersonConstruct p1 = new PersonConstruct("yif");
        p1.setAge(13);
        System.out.println(p1.toString());
    }
}

class PersonConstruct{
    private String name;
    private int age;

    public PersonConstruct(){
        age = 12;  // 写死方法, 若有需要修改， setAge 会覆盖
        System.out.println("I am constructor!");
    }
    public PersonConstruct(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonConstruct{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
