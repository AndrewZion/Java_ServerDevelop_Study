package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        Object object = new Cat();
        Animal animal = (Animal) object;
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        Cat cat = (Cat) animal;
        cat.catchMouse();
//        Dog dog = (Dog) animal;//抛出异常
    }
}
