
// import java.util.Scanner;

// /* 
//     ��д�� AA ����һ���������ж�һ���������� odd ����ż��, ���� boolean
//  */
// public class Method {
//     public static void main(String[] args) {
//         Scanner cin = new Scanner(System.in);
//         AA a = new AA();
//         System.out.println("������������");
//         int n = cin.nextInt();
//         if(a.isOdd(n))
//             System.out.println(n + "������");
//         else
//             System.out.println(n + "��ż��");
//     }
// }

// class AA {
//     boolean isOdd(int n) {
//         return n % 2 != 0;
//     }
// }

/* 
    ��дһ������ copyPerson�����Ը���һ�� Person ����
    ���ظ��ƵĶ��󡣿�¡���� ע��Ҫ��õ��¶���
    ��ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
 */

public class Method {
    public static void main(String[] args) {
        Person p = new Person();
        Copy c = new Copy();
        p.name = "Jack_Ma";
        p.age = 50;
        Person p2 = c.copyPerson(p);
        System.out.println("p������ = " + p.name + "��p������ = " + p.age);
        System.out.println("p������ = " + p2.name + "��p������ = " + p2.age);
        System.out.println(p == p2);
    }
}

class Person {
    String name;
    int age;
}

class Copy {
    Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}