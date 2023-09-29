package com.hspedu.static_.staticExercise;

public class Test {
	static int count = 9;

	public void count() {
		System.out.println("count = " + (count++));
	}

	public static void main(String[] args) {
		new Test().count();// count = 9
		new Test().count();// count = 10
		System.out.println(Test.count);// 11
	}
}