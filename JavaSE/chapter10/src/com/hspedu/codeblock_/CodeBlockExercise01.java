package com.hspedu.codeblock_;


class Person {
	static {
		total = 100;
		System.out.println("in static block!");
	}
	public static int total = getVal01();
	public static int getVal01() {
		System.out.println("getval01");
		return 10;
	}
}

public class CodeBlockExercise01 {
	public static void main(String[] args) {
		System.out.println("total = " + Person.total);//in static block! total = 100
		System.out.println("total = " + Person.total);//total = 100
	}
}
