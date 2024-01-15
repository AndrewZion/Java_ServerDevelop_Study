package com.hspedu.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        //外部其他类访问静态内部类
        //方式 1,通过类名创建静态内部类对象
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式 2,编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner10getInstance = outer10.getInner10();
        inner10getInstance.say();

        Outer10.getInner10_().say();
    }
}

class Outer10 {
    private int n1 = 10;
    private static String name = "张三";
    private static void cry() {
        System.out.println("cry() 方法...");
    }
    static class Inner10 {
        private String name = "韩顺平教育";
        public void say() {
            //访问内部类自身成员时，不要求为静态，但是只能访问外部类静态成员
            System.out.println("name = " + name + " 外部类 name = " + Outer10.name);
            cry();
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}