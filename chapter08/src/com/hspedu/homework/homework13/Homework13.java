package com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("smith", '男', 28, 5);
        Student student = new Student("Mike", '男', 16, "00023102");
        teacher.printInfo();
        System.out.println("-------------------------------");
        student.printInfo();
        Person[] people = new Person[4];
        people[0] = new Teacher("刘德华", '男', 59, 10);
        people[1] = new Student("邱淑贞", '女', 25, "00023105");
        people[2] = new Teacher("邓紫棋", '女', 30, 16);
        people[3] = new Student("陈冠希", '男', 38, "00032108");
        sort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            show(people[i]);
        }
    }
    public static void sort(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = people.length - 1; j > i; j--) {
                if (people[j - 1].getAge() < people[j].getAge()) {
                    Person temp = people[j - 1];
                    people[j - 1] = people[j];
                    people[j] = temp;
                }
            }
        }
    }
    public static void show(Person person) {
        if (person instanceof Teacher)
            System.out.println(((Teacher) person).teach());
        else if (person instanceof Student) {
            System.out.println(((Student) person).study());
        }
    }
}

class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "爱玩";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public String basicInfo() {
        return "姓名： " + name + "\n年龄： " + age + "\n性别： " + sex;
    }
}

class Student extends Person {
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public String study() {
        return "我承诺, " + getName() + "会认真学习Java...";
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void printInfo() {
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("学号： " + stu_id);
        System.out.println(study());
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}';
    }
}

class Teacher extends Person {
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public String teach() {
        return "我承诺, " + getName() + "会认真教Java...";
    }

    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄： " + work_age);
        System.out.println(teach());
        System.out.println(play());
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "work_age=" + work_age +
                '}';
    }
}