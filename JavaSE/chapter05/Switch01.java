import java.util.Scanner;

// public class Switch01 {
// 	public static void main(String[] args) {
// 		/*
// 		编写程序，接收字符：a,b,c,d...
// 		a表示星期一，b表示星期二...
// 		*/
// 		Scanner cin = new Scanner(System.in);
// 		char ch = cin.next().charAt(0);
// 		switch(ch) {
// 			case 'a':
// 				System.out.println("星期一");
// 				break;
// 			case 'b':
// 				System.out.println("星期二");
// 				break;
// 			case 'c':
// 				System.out.println("星期三");
// 				break;
// 			case 'd':
// 				System.out.println("星期四");
// 				break;
// 			case 'e':
// 				System.out.println("星期五");
// 				break;
// 			case 'f':
// 				System.out.println("星期六");
// 				break;
// 			case 'g':
// 				System.out.println("星期日");
// 				break;
// 			default:
// 				System.out.println("输入有误");
// 		}
// 	}
// }

//switch分支细节

// public class Switch01 {
// 	public static void main(String[] args) {
// 		int ch = 99;
// 		switch(ch) {
// 			case 'a':
// 				System.out.println("ok1");
// 				System.out.println("ok2");
// 				break;
// 			case 'c':
// 				System.out.println("ok3");
// 				System.out.println("ok4");
// 		}
// 	}
// }

//switch课堂练习

/*
	题目：
	对学生成绩大于60分的,输出"合格"。低于60分的，输出"不合格"。
	(注︰输入的成绩不能大于100，须用到switch分支)

	思路分析：
	switch分支判断匹配的是常量，不是范围，所以可以用到(数值/60)，
	并且强制转换成(int)，结果为0，不合格，结果为1，合格
*/

// public class Switch01 {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		double d;
// 		int i;
// 		d = cin.nextDouble();
// 		if (d >= 0 && d <= 100) {
// 			i = (int)(d / 60);
// 			switch (i) {
// 				case 0:
// 					System.out.println("成绩不合格，需要继续加油哦");
// 					break;
// 				case 1:
// 					System.out.println("成绩合格，太棒了");
// 					break;
// 			}
// 		} else 
// 			System.out.println("成绩输入有误");
// 	}
// }

//switch课堂练习

/*
	打印该月份所属的季节
	3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12,1,2 冬季
*/

public class Switch01 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i;
		i = cin.nextInt();
		switch (i) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("输入月份有误");
		}
	}
}