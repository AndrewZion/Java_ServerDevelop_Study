package com.hspedu.poly_;

import java.util.HashSet;
import java.util.Set;

public class polyTest {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("骨头");
        Cat cat = new Cat("tom");
        Fish fish = new Fish("罐头鱼");
        Pig pig = new Pig("乌克兰小乳猪");
        Rice rice = new Rice("猪食");
        Master master = new Master("Mike");
        master.feed(dog, bone);
        master.feed(cat, fish);
        master.feed(pig, rice);
    }
}
