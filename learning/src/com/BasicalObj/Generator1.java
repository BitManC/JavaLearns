package com.BasicalObj;

/*
*
* 泛型：
*
* 形参：
*   public int getMax(int a. int b){}    -->   a, b 称为数据形参
*              getMax(5,6)               -->   5，6  称为数据实参
*   MyArrayList<E>                       -->   <E> 成为类型形参
            MyArrayList<String> list     -->   <String> 称为类型实参
*
*
* 泛型形参列表：
*   1. 泛型形参可能有多个，例如 ： Map<K,V>
*   2. 泛型形参一般都是大写 ：
*       T: type; K: key; V: value; E: Element元素类型； R: return type ;U : 类型
*   3. 泛型实参必须是引用数据类型，不能是基本数据类型,如果是基本数据类型，要使用包装类
*
        不支持基本数据类型的问题：
            1. 集合
            2. 泛型
*   4. 泛型类或者泛型接口上的泛型形参，可以在该类或该接口当做属性的类型、方法的形参类型、方法的返回值类型，局部变量的类型都可以。
*       但是不能用作"静态"成员的相关类型
*   5. 什么时候形参具体化，即什么时候指定泛型形参？
*       第一种：创建对象，实例化
*           ArrayList<String> list = new ArrayList<String> ();
*       第二种： 在实现接口，或者继承类的时候，可以把泛型实际化
*
*           class Student implements Comparable<Student> {

*           }
*   6. 泛型形参还可以设置上限
*
* 一、 泛型类，泛型接口
*   语法格式：
*       【修饰符】 class / interface 类型名<泛型形参列表>{}
*
*
* 二、 泛型方法
*   1.为什么要生命泛型方法？
*       1）当该方法是一个静态方法，而该方法的形参类型或返回值类型不确定，那么可以单独为这个方法设计一个泛型形参
*       2）当某个类不是泛型类，而它的某个非静态方法想要用泛型，单独为这个方法设计泛型形参
*       3）当某个类是泛型类，但某个非静态方法不想用类上的泛型形参，也可以单独设计一个自己的泛型类
*   2. 泛型方法语法
*       【修饰符】<泛型形参类型列表> 返回值 方法名 （【形参列表】）【throws 异常列表】{}
*
*        1）泛型方法的<泛型形参类型列表>什么时候确定？调用这个方法时，传了对应的实参，就可以确定类型
*        2）泛型方法的<泛型形参类型列表>也可以指定上限
*   3.实例：
*       public static <T extends 上限> List <T> asList(T...a)
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generator1 {
    public static void main(String[] args) {
//        test2();
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("abc", "adf"); // 都是传入了参数之后才确定了变量类型
        System.out.println(list.getClass()); //

    }
    public static void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        for (Integer inter : list) {
            System.out.println(inter);
        }
    }
}
// T若表示成绩，只可以用数字类型，如果使用这个类，只可以指定数字类型   XueYuan<Int> xueyuan = new XueYuan<Int>();
class XueYuan<T extends Number>{
    private T score;
}



