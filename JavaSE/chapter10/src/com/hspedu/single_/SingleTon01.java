package com.hspedu.single_;
/*
 * 饿汉式单例模式
 * 类加载时就创建了实例对象
 */
public class SingleTon01 {
	public static void main(String[] args) {
		GirlFriend instance = GirlFriend.getInstance();
		System.out.println(instance);
		GirlFriend instance2 = GirlFriend.getInstance();
		System.out.println(instance2);
		System.out.println(instance == instance2);
	}
}

class GirlFriend {
	private String name;
	private static GirlFriend gf = new GirlFriend("小红红");

	private GirlFriend(String name) {
		System.out.println("构造器被调用...");
		this.name = name;
	}

	public static GirlFriend getInstance() {
		return gf;
	}

	@Override
	public String toString() {
		return "GirlFriend [name=" + name + "]";
	}

}