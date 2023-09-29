package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
	public static void main(String[] args) {
		Outer05 outer05 = new Outer05();
		outer05.f1();
	}
}

class Outer05 {
	private int n1 = 99;
	public void f1() {
		Person p = new Person() {
			private int n1 = 88;
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了 hi 方法 n1 = " + n1 + " 外部类的 n1 = " + Outer05.this.n1);
				System.out.println("Outer05.this hashCode = " + Outer05.this);
			}
		};
		p.hi();
		new Person() {
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了 hi 方法，哈哈...");
			}
			@Override
			public void ok(String str) {
				System.out.println("匿名内部类重写了 ok 方法...");
				super.ok(str);
			}
		}.ok("jack");
	}
}

class Person {
	public void hi() {
		System.out.println("Person hi()");
	}
	public void ok(String str) {
		System.out.println("Person ok() " + str);
	}
}