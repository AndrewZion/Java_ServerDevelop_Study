package com.hspedu.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        bmw = null;
        System.gc();
        System.out.println("程序退出了...");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
//    public void finalize() throws Throwable {
//        System.out.println("我们销毁 汽车" + name);
//        System.out.println("释放了某些资源...");
//    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁 汽车" + name);
        System.out.println("释放了某些资源...");
    }
}