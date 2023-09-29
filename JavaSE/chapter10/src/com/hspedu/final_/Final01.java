package com.hspedu.final_;

public class Final01 {
	public static void main(String[] args) {
		E e = new E();
//		double i = e.TAX_RATE;//√
//		e.TAX_RATE = 0.1;//报错
	}
}

final class A {
}

//class B extends A {}//编译报错
class C {
	public final void hi() {

	}
}

class D extends C {
//	private void hi() {
//	}
}

class E {
	public final double TAX_RATE = 0.08;

	public double getTAX_RATE() {
		return TAX_RATE;
	}
}

class F {
	public void cry() {
		final double NUM = 0.01;
//		NUM = 0.9;//报错
		System.out.println("NUM = " + NUM);
	}
}