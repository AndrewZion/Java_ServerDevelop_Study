package com.hspedu.static_;

public class VisitStatic {
	public static void main(String[] args) {
		//类变量是随着类的加载而创建，即使没有创建对象实例也可以访问
		System.out.println(A.name);
		A a = new A();
		//通过对象名.类变量名
		System.out.println("a.name = " + a.name);
	}
}

class A {
	public static String name = "韩顺平教育";
	private int num = 10;
}