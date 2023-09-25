package com.hspedu.homework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("smith", 24, "护士", '男', 20000);
        Doctor doctor1 = new Doctor("smith", 24, "护士", '男', 20000);
        Doctor doctor2 = new Doctor("smith", 23, "护士", '男', 20000);
        Doctor doctor3 = doctor;
        System.out.println(doctor.equals(doctor1));
        System.out.println(doctor2.equals(doctor1));
        System.out.println(doctor.equals(doctor3));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Doctor))
            return false;
        else {
            Doctor d1 = (Doctor) obj;
            if (d1.name.equals(this.name) && d1.age == this.age && d1.job.equals(this.job)
                    && d1.gender == this.gender && d1.sal == this.sal)
                return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}