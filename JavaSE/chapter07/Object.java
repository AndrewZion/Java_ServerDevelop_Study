public class Object {
    public static void main(String[] args) {
        /* Cat cat01 = new Cat();
        // cat01 ����Cat��һ��ʵ��������
        cat01.name = "С��";
        cat01.age = 3;
        cat01.color = "��ɫ";
        Cat cat02 = new Cat();
        // cat01 ����Cat��һ��ʵ��������
        cat02.name = "С��";
        cat02.age = 8;
        cat02.color = "��ɫ";
        System.out.println("��һֻè������ = " + cat01.name + " ���� = " 
        + cat01.age + " ��ɫ = " + cat01.color);
        System.out.println("�ڶ�ֻè������ = " + cat02.name + " ���� = " 
        + cat02.age + " ��ɫ = " + cat02.color); */

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