package com.hspedu.homework;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint black = new LabeledPoint("Black", 1929, 230.07);
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point {
    private String name;

    public LabeledPoint(String name, double x, double y) {
        super(x, y);
        this.name = name;
    }
}