package com.hspedu.extend_;

public class Sub extends Base {
    public Sub(String name, int age) {
        super("king", 20);
        System.out.println("子类 Sub(String name, int age)构造器被调用....");
    }
    public Sub() {
        System.out.println("Sub()...");
    }
    public Sub(String name) {
        super("tom", 20);
        //do nothing...
        System.out.println("子类 Sub(String name)构造器被调用....");
    }
    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
//        test400();
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
