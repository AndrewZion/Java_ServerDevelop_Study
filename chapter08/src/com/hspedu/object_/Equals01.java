package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == c);//true;
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//true
        /*
        * Object 的 equals 方法默认比较对象地址是否相等，可以重写
        * String 重写了equals方法，用于判断字符串值是否相等
        *
        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if (anObject instanceof String) {
                String anotherString = (String)anObject;
                int n = value.length;
                if (n == anotherString.value.length) {
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

         */
        System.out.println("hello".equals("abc"));
        System.out.println("hello".equals("hello"));
        /*
        * Object的默认equals方法，比较对象地址
            public boolean equals(Object obj) {
                return (this == obj);
            }
        * */
        /*Integer重写equals方法
            public boolean equals(Object obj) {
                if (obj instanceof Integer) {
                    return value == ((Integer)obj).intValue();
                }
                return false;
            }
        * */
        Integer i1 = new Integer(1000);
        Integer i2 = new Integer(1000);
        System.out.println(i1 == i2);//false
        System.out.println(i1.equals(i2));//true
        String str1 = new String("xlbedu");
        String str2 = new String("xlbedu");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
    }
}

class B {}
class A extends B {}