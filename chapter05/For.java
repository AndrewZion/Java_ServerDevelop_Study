import java.util.Scanner;

// public class For {
// 	public static void main(String[] args) {
// 		for (int i = 1; i < Integer.MAX_VALUE; ++i) {
// 			System.out.println("谢利博牛皮" + i);
// 		}
// 	}
// }

//do while循环

// public class For {
// 	public static void main(String[] args) {
// 		int i = 1;
// 		do {
// 			System.out.println("Hello，韩顺平教育" + i);
// 			i++;
// 		} while (i <= 10);
// 	}
// }

//课堂练习

/*
	统计1--200之间能被5整除不能被3整除的个数
*/

public class For {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int low, high, i, count;
		low = cin.nextInt();
		high =cin.nextInt();
		i = low;
		count = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				++count;
			}
			++i;
		} while (i <= high);
		System.out.println(count);
		
	}
}
