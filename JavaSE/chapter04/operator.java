//算术运算符===============================================================

// public class operator {
// 	public static void main(String[] args) {
// 		System.out.println(10 / 4);//2
// 		System.out.println(10.0 / 4);//2.5
// 		double d = 10 / 4;
// 		System.out.println(d);//2.0
// 	}
// }

//% 取模，取余
//本质公式：a % b = a - a / b * b;

// public class operator {
// 	public static void main(String[] args) {
// 		System.out.println(10 % 3);//1
// 		System.out.println(-10 % 3);//-1
// 		System.out.println(10 % -3);//1
// 		System.out.println(-10 % -3);//-1
// 	}
// }

//面试题

// public class operator {
// 	public static void main(String[] args) {
// 		int i1 = 1;
// 		i1 = i1++;
// 		System.out.println(i1);//1
// 		int i2 = 1;
// 		i2 = ++i2;
// 		System.out.println(i2);//2
// 		int i = 1;
//         i = i++;
//         int j = i++;
//         int k = i + ++i * i++;
//         System.out.println("i="+i);//4
//         System.out.println("j="+j);//1
//         System.out.println("k="+k);//11
// 	}
// }

// public class operator {
// 	public static void main(String[] args) {
// 		int i1 = 10;
// 		int i2 = 20;
// 		int i = i1++;
// 		System.out.print("i=" + i);
// 		System.out.println("i2=" + i2);
// 		i = --i2;
// 		System.out.print("i=" + i);
// 		System.out.println("i2=" + i2);
// 	}
// }


//定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为:5/9*(华氏温度-100),
//请求出华氏温度对应的摄氏温度。[234.5]

// public class operator {
// 	public static void main(String[] args) {
// 		double huaShi = 234.5;
// 		// double sheShi = 5 / 9 * (huaShi - 100);//有Bug
// 		double sheShi = 5.0 / 9 * (huaShi - 100);
// 		System.out.println("华氏度：" + huaShi + "对应摄氏度：" + sheShi);
// 	}
// }
//总是输出0.0，因为5 / 9 = 0，0 * 任何数都是0，所以修改5->5.0

//关系运算符===============================================================

//逻辑运算符===============================================================

// public class operator {
// 	public static void main(String[] args) {
// 		int a = 4;
// 		int b = 9;
// 		if(a < 1 & ++b < 50) {
// 			System.out.println("条件符合");
// 		}
// 		System.out.println("b=" + b);//b=10
// 	}
// }

//练习题
// public class operator {
// 	public static void main(String[] args) {
// 		int x = 5;
// 		int y = 5;
// 		if(x++ == 6 & ++y == 6) {
// 			x = 11;
// 		}
// 		System.out.println("x=" + x + ",y=" + y);
// 	}
// }

// public class operator {
// 	public static void main(String[] args) {
// 		boolean b1 = false;
// 		boolean b2 = true;
// 		if(b1 = true) {
// 			System.out.println("真");
// 		}
// 		if(b2 = false) {
// 			System.out.println("真");
// 		} else {
// 			System.out.println("假");
// 		}
// 		//输出
// 		/*
// 		真
// 		假
// 		*/
// 	}
// }

//赋值运算符===============================================================

public class operator {
	public static void main(String[] args) {
		byte b = 3;
		//b = b + 2;//报错 int->byte有损失
		b += 2;//等价于 b = (byte)(b + 2) 编译可以通过
		System.out.println("通过无错误");
	}
}