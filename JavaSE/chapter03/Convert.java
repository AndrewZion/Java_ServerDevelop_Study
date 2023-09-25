//自动类型转换
// public class Convert {
// 	public static void main(String[] args) {
// 		byte a1 = 10;
// 		byte a2 = 12;
// 		byte a3;
// 		a3 = a1 + a2;//报错：int->byte会有损失
// 	}
// }

//强制类型转换
// public class Convert {
// 	public static void main(String[] args) {
// 		int i = (int)1.9;
// 		System.out.println(i);//输出1
// 		int j = 100;
// 		byte b1 = (byte)j;
// 		System.out.println(b1);//输出100
// 		/*
// 		注意下面情况会运行错误(输出结果与预期不符)
// 		*/
// 		int k = 1000;
// 		byte b2 = (byte)k;
// 		System.out.println(b2);
// 	}
// }

public class Convert {
	public static void main(String[] args) {
		//int x = (int)10 * 3.5 + 6 * 1.5;//报错:double->int 损失
		int x = (int)(10 * 3.5 + 6 * 1.5);//输出44
		System.out.println(x);
	}
}