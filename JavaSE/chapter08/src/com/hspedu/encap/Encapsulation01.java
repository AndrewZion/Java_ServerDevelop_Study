package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("TomJack");
        person.setAge(12);
        person.setSalary(15000);
        System.out.println(person.info());
        Person smith = new Person("smith", 2000, 50000);
        System.out.println(smith.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要（2-6）个字符，默认名字");
            this.name = "匿名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=1 && age<=120) {
            this.age = age;
        } else {
            System.out.println("你设置年龄不对，需要在（1-120），给默认年龄18");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name=" + name + " age=" + age + " 薪水=" + salary;
    }
}