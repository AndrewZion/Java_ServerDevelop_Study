package com.hspedu.interface_;

public class InterfaceDetail02 {
	public static void main(String[] args) {
		System.out.println(IB.n1);//说明n1 是 static
//		IB.n1 = 30;//报错，说明n1是final
	}
}
interface IB {
	int n1 = 10;
	void hi();
}

interface IC {
	void say();
}

interface ID extends IB, IC {
	
}
interface IE {
	
}

class Pig implements IB, IC {
	@Override
	public void hi() {
		
	}
	
	@Override
	public void say() {
		
	}
}