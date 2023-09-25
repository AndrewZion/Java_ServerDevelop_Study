
// import java.util.Scanner;

// /* 
//     编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
//  */
// public class Method {
//     public static void main(String[] args) {
//         Scanner cin = new Scanner(System.in);
//         AA a = new AA();
//         System.out.println("请输入整数：");
//         int n = cin.nextInt();
//         if(a.isOdd(n))
//             System.out.println(n + "是奇数");
//         else
//             System.out.println(n + "是偶数");
//     }
// }

// class AA {
//     boolean isOdd(int n) {
//         return n % 2 != 0;
//     }
// }

/* 
    编写一个方法 copyPerson，可以复制一个 Person 对象，
    返回复制的对象。克隆对象， 注意要求得到新对象
    和原来的对象是两个独立的对象，只是他们的属性相同
 */

public class Method {
    public static void main(String[] args) {
        Person p = new Person();
        Copy c = new Copy();
        p.name = "Jack_Ma";
        p.age = 50;
        Person p2 = c.copyPerson(p);
        System.out.println("p的名字 = " + p.name + "，p的年龄 = " + p.age);
        System.out.println("p的名字 = " + p2.name + "，p的年龄 = " + p2.age);
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