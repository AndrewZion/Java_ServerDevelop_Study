package com.hspedu.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        //外部其他类，使用成员内部类的两种方式
        //第一种方式，outer08.new Inner08()；相当于把new Inner08()当做是outer08成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        //第二种方式，在外部类中，编写一个方法，可以返回Inner08对象
        Outer08.Inner08 inner081 = outer08.getInner08Instance();
        inner081.say();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";
    private void hi() {
        System.out.println("hi()方法...");
    }
    public class Inner08 {
        private double sal = 99.8;
        private int n1 = 66;
        public void say() {
            System.out.println("n1 = " + n1 + " name = " + name + " 外部类的 n1 = " + Outer08.this.n1);
            hi();
        }
    }

    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    //外部类访问成员内部类
    public void t1() {
        //创建成员内部类的对象，再使用相关的方法
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}