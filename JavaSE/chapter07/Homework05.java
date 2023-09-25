/**
 * Homework05
 * 定义一个圆类Circle,定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法 HomeworkO5.java
 */

import java.util.Scanner;
// import java.lang.Math;

public class Homework05 {

    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println("圆周长为：" + Circle.perimeter(radius));
        System.out.println("圆面积为：" + Circle.area(radius));
    }
}

class Circle {
    public static double perimeter(double radius) {
        return Math.PI * 2 * radius;
    }

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}