import java.util.Scanner;
/*
1.编程实现如下功能先自己做，
某人有100,000元,每经过一次路口，需要交费,规则如下:
1)当现金>50000时,每次交5%
2)当现金<=50000时,每次交1000
编程计算该人可以经过多少次路口,要求:使用while break方式完成
*/

// public class HomeWork {
// 	public static void main(String[] args) {
// 		int count;
// 		double cash;
// 		count = 0;
// 		cash = 100000;
// 		/*while(cash > 0) {
// 			if(cash > 50000)
// 				cash -= cash * 0.05;
// 			else
// 				cash -= 1000;
// 			if(cash < 0)
// 				break;
// 			count++;
// 		}*/
// 		// 老师代码
// 		while(true) {
// 			if(cash > 50000)
// 				cash *= 0.95;
// 			else if(cash >= 1000)
// 				cash -= 1000;
// 			else
// 				break;
// 			count++;
// 		}
// 		System.out.println("可以经过" + count + "个路口，剩余现金" + cash + "元");
// 	}
// }

/*
4.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
其各个位上数字立方和等于其本身。例如:153 =1*1*1 +3*3*3+ 5*5*5
*/

/*public class HomeWork {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int number, sum, temp, num;
		number = cin.nextInt();
		num = number;
		sum = 0;
		while(num > 0) {
			temp = num % 10;
			num /= 10;
			sum += Math.pow(temp, 3);
		}
		if(number == sum)
			System.out.println("是水仙花数");
		else
			System.out.println("不是水仙花数");
	}
}*/

//输出1-100不能被5整除的数，每5个一行

// public class HomeWork {
// 	public static void main(String[] args) {
// 		int i, count = 0;
// 		for(i = 1; i <= 100; i++) {
// 			if(i % 5 != 0) {
// 				System.out.print(i + " ");
// 				count++;
// 				if(count == 5) {
// 					count = 0;
// 					System.out.println();
// 				}
// 			}
// 		}
// 	}
// }

//输出小写的a-z以及大写的Z-A

// public class HomeWork {
// 	public static void main(String[] args) {
// 		/*char c1 = 'a', c2 = 'Z';
// 		int i;
// 		for(i = 0; i < 26; i++)
// 			System.out.print((char)(c1 + i) + " ");
// 		System.out.println();
// 		for(i = 0; i < 26; i++)
// 			System.out.print((char)(c2 - i) + " ");*/
// 		//老师的代码
// 		for(char c = 'a'; c <= 'z'; c++)
// 			System.out.print(c + " ");
// 		System.out.println();
// 		for(char c = 'Z'; c >= 'A'; c--)
// 			System.out.print(c + " ");
// 		// char c1 = 'a';
// 		// System.out.println(++c1);
// 		// System.out.println(c1 + 1);
// 	}
// }

//求出1-1/2+1/3-1/4.....1/100的和

// public class HomeWork {
// 	public static void main(String[] args) {
// 		double sum = 0;
// 		for(int i = 1; i <= 100; ++i) {
// 			if(i % 2 == 1)
// 				sum += 1.0 / i;
// 			else
// 				sum -= 1.0 / i; 
// 		}
// 		System.out.println(sum);
// 	}
// }

//求1+(1+2)+(1+2+3)+(1+2+3+4)+..+(1+2+3+..+100)的结果

public class HomeWork {
	public static void main(String[] args) {
		int i, j, sum = 0;
		for(i = 1; i <= 100; i++)
			for(j = 1; j <= i; j++)
				sum += j;
		System.out.println("sum = " + sum);
	}
}