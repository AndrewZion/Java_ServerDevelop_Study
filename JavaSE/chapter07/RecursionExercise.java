/* 
    ��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3,5,8,13..����һ������n���������ֵ�Ƕ�
 */

import java.util.Scanner;

class RecursionExercise {
    public static void main(String[] args) {
        Scanner javain = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        int n;
        System.out.println("������һ����������");
        n = javain.nextInt();
        System.out.println("��Ӧ쳲������� = " + f.fibonacci(n));
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
