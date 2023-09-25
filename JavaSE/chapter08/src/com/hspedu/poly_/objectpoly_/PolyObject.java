package com.hspedu.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();//小狗汪汪叫
        animal = new Cat();
        animal.cry();//小猫喵喵叫
    }
}
