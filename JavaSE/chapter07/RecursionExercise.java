/* 
    请使用递归的方式求出斐波那契数1,1,2,3,5,8,13..给你一个整数n，求出它的值是多
 */

import java.util.Scanner;

class RecursionExercise {
    public static void main(String[] args) {
        Scanner javain = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        int n;
        System.out.println("请输入一个正整数：");
        n = javain.nextInt();
        System.out.println("对应斐波那契数 = " + f.fibonacci(n));
    }
}

class Fibonacci {
    int fibonacci(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
