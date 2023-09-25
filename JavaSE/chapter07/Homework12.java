/**
 * Homework12
 * 创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)，提供3个构造方法，可以初始化
 * (1)(名字，性别，年龄，职位，薪水).(2)(名字，性别，年龄)(3)(职位，薪水).
 * 要求充分复用构造器Homework12.java
 */
public class Homework12 {

    public static void main(String[] args) {
        Employee employee = new Employee("tom", '男', 23, "工程师", 20000);
        employee.getInfo();
    }
}

class Employee {
    private String name;
    private char gender;
    private int age;
    private String job;
    private double salary;
    public Employee() {}
    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job, double salary) {
        this.job = job;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, String job, double salary) {
        this(name, gender, age);
        this.job = job;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.gender + " " + this.age + " " + this.job + " " + this.salary);
    }
}