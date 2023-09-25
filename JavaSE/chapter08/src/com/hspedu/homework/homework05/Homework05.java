package com.hspedu.homework.homework05;

public class Homework05 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Worker("光头强", 8000);
        employees[1] = new Peasant("熊大", 6000);
        employees[2] = new Waiter("熊二", 7000);
        employees[3] = new Teacher("俞敏洪", 15000, 30, 400);
        employees[4] = new Scientist("屠呦呦", 20000, 50000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].print_sal());
        }
    }
}

class Employee {
    private String name;
    private double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public String print_sal() {
        return "name = " + name + "\t薪水 = " + getSal();
    }
}

class Worker extends Employee {
    public Worker(String name, double sal) {
        super(name, sal);
    }
}

class Peasant extends Employee {
    public Peasant(String name, double sal) {
        super(name, sal);
    }
}

class Teacher extends Employee {
    private int classDay;
    private double classSal;

    public Teacher(String name, double sal, int classDay, double classSal) {
        super(name, sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public double getSal() {
        return super.getSal() + classSal * classDay;
    }
}

class Scientist extends Employee {
    private double bonus;

    public Scientist(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    @Override
    public double getSal() {
        return super.getSal() + bonus;
    }
}

class Waiter extends Employee {
    public Waiter(String name, double sal) {
        super(name, sal);
    }
}