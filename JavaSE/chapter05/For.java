import java.util.Scanner;

// public class For {
// 	public static void main(String[] args) {
// 		for (int i = 1; i < Integer.MAX_VALUE; ++i) {
// 			System.out.println("л����ţƤ" + i);
// 		}
// 	}
// }

//do whileѭ��

// public class For {
// 	public static void main(String[] args) {
// 		int i = 1;
// 		do {
// 			System.out.println("Hello����˳ƽ����" + i);
// 			i++;
// 		} while (i <= 10);
// 	}
// }

//������ϰ

/*
	ͳ��1--200֮���ܱ�5�������ܱ�3�����ĸ���
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
