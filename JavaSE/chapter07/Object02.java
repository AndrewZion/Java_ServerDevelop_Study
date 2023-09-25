public class Object02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        int returnRes = p1.getSum(10, 20);
        System.out.println("getSum方法返回的值 = " + returnRes);
    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}