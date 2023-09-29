package com.hspedu.abstract_;

public class AbstractDetail01 {
	public static void main(String[] args) {
		
	}
}
//抽象类不一定要包含 abstract 方法，抽象类可以没有 abstract 方法
abstract class A {
	public void hi() {
		System.out.println("hi...");
	}
}
//一旦类包含了 abstract 方法,则这个类必须声明为 abstract
abstract class B {
	public abstract void hi();
}

class C {
	//abstract 只能修饰类和方法，不能修饰属性和其他的
//	public abstract int n1 = 1;
}