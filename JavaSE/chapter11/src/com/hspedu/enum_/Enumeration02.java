package com.hspedu.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season_.SPRING);
        System.out.println(Season_.SPRING.getName());
    }
}

class Season_ {
    private String name;
    private String desc;
    public static final Season_ SPRING = new Season_("春天", "温暖");
    public static final Season_ WINTER = new Season_("冬天", "寒冷");
    public static final Season_ SUMMER = new Season_("夏天", "炎热");
    public static final Season_ AUTUMN = new Season_("秋天", "凉爽");
    private Season_(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season_{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}