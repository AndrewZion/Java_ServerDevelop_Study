
/* 	Java的浮点型常量（具体值）默认为double型，声明
	float型常量，须后加'f'或'F'

	*/

// public class varFloat {
// 	public static void main(String[] args) {
// 		float num1 = 1.1; //报错
// 		float num2 = 1.1f; //对
// 		double num3 = 1.1; //对
// 		double num4 = 1.1f; //对
// 		/*解释：
// 			末尾加了f，是float型，float型转double型安全，
// 			类比long a = 100;
// 			没加l默认int型，int型转long型安全
// 		*/
// 		System.out.println(num1);
// 	}
// }

//浮点数小数比较陷阱
public class varFloat {
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1/3;
		System.out.println(num1);
		System.out.println(num2);
		/*
		输出结果：
		2.7
		2.6999999999999997
		所以判断二者数值是否相等，不应该用 ==
		应该按如下方式编写
		*/
		if(Math.abs(num2 - num1) < 0.00001){
			System.out.println("num1与num2相等");
		}
	}
}