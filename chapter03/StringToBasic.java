//基本数据类型->String

// public class StringToBasic {
// 	public static void main(String[] args) {
// 		int n1 = 100;
// 		float n2 = 1.1f;
// 		double n3 = 3.4;
// 		boolean b1 = true;
// 		/*在同一行中输出上述变量值
// 		System.out.println(""+n1+n2+n3+b1);
// 		*/
// 		String str1 = n1 + "";
// 		String str2 = n2 + "";
// 		String str3 = n3 + "";
// 		String str4 = b1 + "";
// 		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
// 	}
// }

//String->基本数据类型

public class StringToBasic {
	public static void main(String[] args) {
		String s1 = "123h";
		int num1 = Integer.parseInt(s1);
		double num2 = Double.parseDouble(s1);
		float num3 = Float.parseFloat(s1);
		long num4 = Long.parseLong(s1);
		byte num5 = Byte.parseByte(s1);
		short num6 = Short.parseShort(s1);
		boolean b = Boolean.parseBoolean("false");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//123
		System.out.println(b);//false

		//字符串无法直接转成字符，但是可以获取字符串中的字符
		System.out.println(s1.charAt(1));//'2'
	}
}