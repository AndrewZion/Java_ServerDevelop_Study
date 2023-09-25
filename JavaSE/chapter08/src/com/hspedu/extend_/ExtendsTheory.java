package com.hspedu.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 50;

}

class Father extends GrandPa {
    String name = "大头爸爸";
//    int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}