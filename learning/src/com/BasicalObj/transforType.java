package com.BasicalObj;

/*
* 基本类型转换：
*   1. 自动类型转换
*       byte, short, char -> int -> long -> float-> double
*   2. 强制类型转换
*       double -> float -> long -> int -> char, byte, short
*
* 引用数据类型，编译时类型：
*   1. 向上转型
*       当出现多态引用时，子类的对象就会向上转型为父类型
*       若发生向上转型，通过父类的变量，就无法d调用子类的"扩展方法"
*   2. 向下转型， 需要强制转换
*       当把存在父类的变量中的对象,重新赋给子类变量时，需要向下转型
*
* */

public class transforType {
    Person p = new Man(); //向上转型
    Man m = new Man();

    Man m2 = (Man) p;  // 向下转型
}
