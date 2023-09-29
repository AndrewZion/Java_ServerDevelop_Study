package com.hspedu.main_;

public class Main01 {
	private static String name = "韩顺平教育";
	private int n1 = 10000;

	public static void hi() {
		System.out.println("Main01 的 hi 方法");
	}

	public void cry() {
		System.out.println("Main01 的 cry 方法");
	}

	public static void main(String[] args) {
		System.out.println("name = " + name);
		hi();
		Main01 main01 = new Main01();
		System.out.println(main01.n1);
		main01.cry();
	}
}
