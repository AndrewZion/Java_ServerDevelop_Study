package com.hspedu.override_;

public class Dog extends Animal {
    public void cry() {
        System.out.println("小狗汪汪叫...");
    }
    public String m1() {
        return null;
    }
    //报错了,因为父类Animal的m2()方法返回的是String,而Object并不是String的子类
//    public Object m2() {
//        return null;
//    }
    public BBB m3() {
        return null;
    }
    //子类重写方法不能缩小父类方法的访问权限
    //eat()父类为protected,因此子类只能是public或者protected
    public void eat() {

    }
}

class AAA {

}

class BBB extends AAA {

}