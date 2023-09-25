package com.hspedu.object_;

public class HashCode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa2 = aa;
        System.out.println("aa 的 hashCode = " + aa.hashCode());
        System.out.println(aa.toString());
        System.out.println(aa);
        System.out.println("aa1 的 hashCode = " + aa1.hashCode());
        System.out.println(aa1.toString());
        System.out.println("aa2 的 hashCode = " + aa2.hashCode());
        System.out.println(aa2.toString());
    }
}

class AA {}
