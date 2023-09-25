package com.hspedu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        Person person3 = new Person("jack", 10, '女');
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Person) {
            Person p = (Person) obj;
//            if (this.name.equals(p.getName()) && this.age == p.getAge() && this.gender == p.getGender())
//                return true;
            if (this.name.equals(p.name) && this.age == p.age && this.gender == p.gender)
                return true;
        }
        return false;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

