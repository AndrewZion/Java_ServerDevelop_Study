package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
	public static void main(String[] args) {
		/* 
		 * BB 的静态代码块 1 被执行...
		 * AA 的静态代码块 1 被执行... 
		 * */
		AA aa = new AA();
		AA aa2 = new AA();
		/*
		 * Animal 的静态代码块 1 被执行...
		 * Cat 的静态代码块 1 被执行...
		 * 999
		 * */
		System.out.println(Cat.n1);
		/*
		 * DD 的静态代码块 1 被执行...
		 * DD 的普通代码块...
		 * DD 的普通代码块...
		 * 8888
		 * */
		DD dd = new DD();
		DD dd1 = new DD();
		System.out.println(DD.n1);
	}
}

class DD {
	public static int n1 = 8888;
	static {
		System.out.println("DD 的静态代码块 1 被执行...");
	}
	{
		System.out.println("DD 的普通代码块...");
	}
}
class Animal {
	static {
		System.out.println("Animal 的静态代码块 1 被执行...");
	}
}

class Cat extends Animal {
	public static int n1 = 999;
	static {
		System.out.println("Cat 的静态代码块 1 被执行...");
	}
}

class BB {
	static {
		System.out.println("BB 的静态代码块 1 被执行...");
	}
}

class AA extends BB {
	static {
		System.out.println("AA 的静态代码块 1 被执行...");
	}
}