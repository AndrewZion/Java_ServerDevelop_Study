package com.hspedu.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);//10
        Sub base_sub = (Sub) base;
        System.out.println(base_sub.count);//20
        Sub sub = new Sub();
        System.out.println(sub.count);//20
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}