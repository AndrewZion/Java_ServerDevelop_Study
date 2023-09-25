package com.hspedu.object_;


public class EqualsExercise02 {
    public static void main(String[] args) {
        Person_ p1 = new Person_();
        p1.name = "xlbedu";
        Person_ p2 = new Person_();
        p2.name = "xlbedu";

        System.out.println(p1 == p2);//false
        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.equals(p2));//false

        String str1 = new String("xjtu");
        String str2 = new String("xjtu");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1 == str2);//false
    }
}

class Person_ {
    public String name;
}