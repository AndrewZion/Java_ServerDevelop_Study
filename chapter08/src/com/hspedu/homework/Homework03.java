package com.hspedu.homework;

public class Homework03 {
    public static void main(String[] args) {
        Teacher professor = new Professor("smith", 56, "教授", 30000);
        Teacher vice_professor = new Associate_Professor("marry", 38, "副教授", 20000);
        Teacher lecturer = new Lecturer("linda", 26, "讲师", 18000);
        System.out.println(professor.introduce());
        System.out.println(vice_professor.introduce());
        System.out.println(lecturer.introduce());
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce() {
        return "name = " + name + "\tage = " + age + "\tpost = " + post + "\tsalary = " + salary;
    }
}

class Professor extends Teacher {
    private final double level = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getLevel() {
        return level;
    }
    @Override
    public String introduce() {
        return super.introduce() + "\tlevel = " + level;
    }
}

class Associate_Professor extends Teacher {
    private final double level = 1.2;

    public Associate_Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getLevel() {
        return level;
    }
    @Override
    public String introduce() {
        return super.introduce() + "\tlevel = " + level;
    }
}

class Lecturer extends Teacher {
    private final double level = 1.1;

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getLevel() {
        return level;
    }

    @Override
    public String introduce() {
        return super.introduce() + "\tlevel = " + level;
    }
}