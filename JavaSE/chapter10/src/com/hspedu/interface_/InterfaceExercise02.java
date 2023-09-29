package com.hspedu.interface_;

public class InterfaceExercise02 {
	public static void main(String[] args) {
		new C().pX();
	}
}
interface AE {
	int x = 0;
}

class BE {
	int x = 1;
}

class C extends BE implements AE {
	public void pX() {
//		System.out.println(x);//报错，x不明确
		System.out.println(AE.x + " " + super.x);
	}
}