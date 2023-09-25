package com.hspedu.super_;

public class B extends A {
    public int n1 = 888;
    public void test() {
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    public void cal() {
        System.out.println("B 类的 cal() 方法...");
    }
    public void sum() {
        System.out.println("B 类的 sum() 方法...");
        this.cal();
        super.cal();
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
//        super.test400();//不能访问父类 private 方法
    }
    public B() {
        super("jack", 10);
    }
}
