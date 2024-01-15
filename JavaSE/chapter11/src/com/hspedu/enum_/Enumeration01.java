package com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "寒冷");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        //因为对于季节而言，它的对象(具体值)，是固定的四个，不会有更多
        //这个设计类的思路，不能体现季节是固定的四个对象
        //因此，这样的设计不好 => 枚举类[枚: 一个一个 举： 例举 , 即把具体的对象一个一个例举出来的类就称为枚举类]
    }
}

class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}