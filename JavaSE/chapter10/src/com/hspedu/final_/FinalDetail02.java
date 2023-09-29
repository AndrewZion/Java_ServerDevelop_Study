package com.hspedu.final_;

public class FinalDetail02 {
	public static void main(String[] args) {
		//只输出BBB.num(10000),不会输出静态代码块的内容
		//final 和 static 搭配使用，不会导致类加载，底层编译器做了优化处理
		System.out.println(BBB.num);
	}
}

class BBB {
	public final static int num = 10000;
	static {
		System.out.println("BBB 静态代码块被执行...");
	}
}

final class AAA {
	//一般来说，如果一个类已经是 final 类了，就没有必要再将方法修饰成 final 方法
	//public final void cry() {}
}