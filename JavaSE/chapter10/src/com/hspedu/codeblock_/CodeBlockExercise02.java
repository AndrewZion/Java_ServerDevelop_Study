package com.hspedu.codeblock_;

class Sample {
	Sample(String s) {
		System.out.println(s);
	}

	Sample() {
		System.out.println("Sample 默认构造函数被调用");
	}
}

class Test {
	Sample sam1 = new Sample("sam1 成员初始化");
	static Sample sam = new Sample("静态成员 sam 初始化 ");
	static {
		System.out.println("static 块执行");
		if (sam == null)
			System.out.println("sam is null");
	}

	Test() {
		System.out.println("Test 默认构造函数被调用");
	}

}

public class CodeBlockExercise02 {
	public static void main(String str[]) {
		//静态成员 sam 初始化 
		//static 块执行
		//sam1 成员初始化
		//Test 默认构造函数被调用
		Test a = new Test();
	}
}