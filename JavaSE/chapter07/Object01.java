public class Object01 {
    public static void main(String[] args) {
        Person a = new Person();
        a.age = 10;
        a.name = "小明";
        Person b;
        b = a;
        System.out.println(b.name); //小明
        b.age = 200;
        b = null;
        System.out.println(a.age);//200
        System.out.println(b.age);//异常
    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
}