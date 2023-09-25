/**
 * Homework07
 * 7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。并创建对象，进行测试、
 * 【提示this.属性,自己做】HomeworkO7.java
 */
public class Homework07 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("大黄", "yellow", 8);
        Dog dog2 = new Dog("小黑", "black", 3);
        dog1.show();
        dog2.show();
    }
}

class Dog {
    private String name;
    private String color;
    private int age;
    public Dog() {}
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show() {
        System.out.println(this.name + " " + this.color + " " + this.age);
    }
}