package com.hspedu.innerclass;

public class InnerClassExercise01 {
	public static void main(String[] args) {
		//传统方法
		f1(new Picture());
		//直接把匿名内部类当实参传递
		f1(new IL() {
			@Override
			public void show() {
				System.out.println("这是一幅名画 XX...");
			}
		});
	}
	public static void f1(IL il) {
		il.show();
	}
}

interface IL {
	void show();
}
//传统方法
class Picture implements IL {
	@Override
	public void show() {
		System.out.println("这是一幅名画 XX...");
	}
}