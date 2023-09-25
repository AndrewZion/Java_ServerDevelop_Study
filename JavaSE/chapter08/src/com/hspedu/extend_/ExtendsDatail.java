package com.hspedu.extend_;

public class ExtendsDatail {
    public static void main(String[] args) {
        System.out.println("====第一个对象====");
        Sub sub = new Sub();
        System.out.println("====第二个对象====");
        Sub jack = new Sub("jack");
        System.out.println("====第三个对象====");
        Sub smith = new Sub("smith", 20);
//        sub.sayOk();
    }
}
