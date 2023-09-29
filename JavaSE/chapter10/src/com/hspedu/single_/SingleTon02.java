package com.hspedu.single_;

import java.util.Locale.Category;

public class SingleTon02 {
	public static void main(String[] args) {
//		Dog instance = Dog.getInstance();
//		System.out.println(instance);
//		Dog instance1 = Dog.getInstance();
//		System.out.println(instance1);
//		System.out.println(instance == instance1);
		System.out.println(Dog.age);
	}
}

class Dog {
	private String name;
	private static Dog dg;
	public static int age = 10;
	public static Dog getInstance() {
		if (dg == null) {
			dg = new Dog("大黄");
		}
		return dg;
	}
	private Dog(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
}