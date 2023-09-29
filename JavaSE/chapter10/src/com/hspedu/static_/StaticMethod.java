package com.hspedu.static_;

public class StaticMethod {
	public static void main(String[] args) {
//		Stu tom = new Stu("tom");
//		tom.payFee(100);
		Stu.payFee(100);

//		Stu marry = new Stu("marry");
//		marry.payFee(200);
		Stu.payFee(200);

//		marry.showFee();
		Stu.showFee();

		System.out.println("9 开平方的结果是 = " + Math.sqrt(9));

		System.out.println(MyTools.calSum(10, 2.5));
	}
}

//开发自己的工具类，可以将方法做成静态的，方便调用
class MyTools {
	public static double calSum(double n1, double n2) {
		return n1 + n2;
	}
}

class Person {
	private String weight;

	public Person(String weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
}

class Stu extends Person {
	private String name;
	// 定义一个静态变量，来累积学生的学费
	private static double fee = 0;

	public Stu(String weight, String name) {
		super(weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getFee() {
		return fee;
	}

	public static void setFee(double fee) {
		Stu.fee = fee;
	}

	public static void payFee(double fee) {
		Stu.fee += fee;
	}

	public static void showFee() {
		System.out.println("总学费 = " + Stu.fee);
	}
}