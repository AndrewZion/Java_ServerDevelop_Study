package com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Jack", 38, "driver");
        people[1] = new Person("Marry", 28, "teacher");
        people[2] = new Person("Linda", 37, "doctor");
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = people.length - 1; j > i; j--) {
                if (people[j - 1].getAge() < people[j].getAge()) {
                    Person temp = people[j];
                    people[j] = people[j - 1];
                    people[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}