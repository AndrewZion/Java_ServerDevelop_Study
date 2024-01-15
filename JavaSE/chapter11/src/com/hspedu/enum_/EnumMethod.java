package com.hspedu.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        Season2[] values = Season2.values();
        System.out.println("====遍历取出枚举对象====");
        for (Season2 s : values) {
            System.out.println(s);
        }
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
        System.out.println(autumn == autumn1);
        System.out.println(autumn.compareTo(autumn1));
        System.out.println(Season2.SPRING.compareTo(Season2.SUMMER));
    }
}