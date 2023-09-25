package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Employee worker = new Worker("hsp", 200, 30);
        Employee manager = new Manager("xlb", 1000, 26, 20000);
        System.out.println(worker.getName() + "薪水 = " + worker.printSalary());
        System.out.println(manager.getName() + "薪水 = " + manager.printSalary());
    }
}

class Employee {
    private String name;
    private double salary;
    private int days;

    public Employee(String name, double salary, int days) {
        this.name = name;
        this.salary = salary;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double printSalary() {
        return salary * days;
    }
}

class Manager extends Employee {
    private final double level = 1.2;
    private double bonus;

    public Manager(String name, double salary, int days, double bonus) {
        super(name, salary, days);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getLevel() {
        return level;
    }

    @Override
    public double printSalary() {
        return super.printSalary() * level + bonus;
    }
}

class Worker extends Employee {
    private final double level = 1.0;

    public Worker(String name, double salary, int days) {
        super(name, salary, days);
    }

    public double getLevel() {
        return level;
    }

    @Override
    public double printSalary() {
        return super.printSalary() * level;
    }
}