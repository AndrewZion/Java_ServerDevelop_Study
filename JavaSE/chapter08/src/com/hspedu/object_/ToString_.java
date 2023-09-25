package com.hspedu.object_;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("蛋蛋", "干饭的", 2000);
        System.out.println(monster.toString() + " hashCode= " + monster.hashCode());
        System.out.println("==当直接输出一个对象时，toString 方法会被默认的调用==");
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}