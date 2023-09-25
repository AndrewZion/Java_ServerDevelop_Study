/**
 * Homework06
 * 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
 * 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)
 * 并创建两个对象，分别测试 Homework06.java
 */
public class Homework06 {

    public static void main(String[] args) {
        Cale cale1 = new Cale(98, 2);
        Cale cale2 = new Cale(98, 0);
        System.out.println(cale1.add() + " " + cale1.subtract() + " " + cale1.mult() + " " + cale1.div());
        System.out.println(cale2.add() + " " + cale2.subtract() + " " + cale2.mult() + " " + cale2.div());
    }
}

class Cale {
    private double num1;
    private double num2;
    public Cale() {}
    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return this.num1 + this.num2;
    }
    public double subtract() {
        return this.num1 - this.num2;
    }
    public double mult() {
        return this.num1 * this.num2;
    }
    public double div() {
        if (this.num2 == 0) {
            System.out.println("异常：除数为0");
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }
}