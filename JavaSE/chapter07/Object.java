public class Object {
    public static void main(String[] args) {
        /* Cat cat01 = new Cat();
        // cat01 就是Cat的一个实例化对象
        cat01.name = "小白";
        cat01.age = 3;
        cat01.color = "白色";
        Cat cat02 = new Cat();
        // cat01 就是Cat的一个实例化对象
        cat02.name = "小花";
        cat02.age = 8;
        cat02.color = "花色";
        System.out.println("第一只猫：名字 = " + cat01.name + " 年龄 = " 
        + cat01.age + " 颜色 = " + cat01.color);
        System.out.println("第二只猫：名字 = " + cat02.name + " 年龄 = " 
        + cat02.age + " 颜色 = " + cat02.color); */

        Person person01 = new Person();
        System.out.println("age = " + person01.age + " name = " + person01.name 
        + " sal = " + person01.sal + " isPass = " + person01.isPass);
    }
}

class Cat {
    String name;
    int age;
    String color;
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
}