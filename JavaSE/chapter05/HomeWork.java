import java.util.Scanner;
/*
1.���ʵ�����¹������Լ�����
ĳ����100,000Ԫ,ÿ����һ��·�ڣ���Ҫ����,��������:
1)���ֽ�>50000ʱ,ÿ�ν�5%
2)���ֽ�<=50000ʱ,ÿ�ν�1000
��̼�����˿��Ծ������ٴ�·��,Ҫ��:ʹ��while break��ʽ���
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
// 		// ��ʦ����
// 		while(true) {
// 			if(cash > 50000)
// 				cash *= 0.95;
// 			else if(cash >= 1000)
// 				cash -= 1000;
// 			else
// 				break;
// 			count++;
// 		}
// 		System.out.println("���Ծ���" + count + "��·�ڣ�ʣ���ֽ�" + cash + "Ԫ");
// 	}
// }

/*
4.�ж�һ�������Ƿ���ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ����
�����λ�����������͵����䱾������:153 =1*1*1 +3*3*3+ 5*5*5
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
			System.out.println("��ˮ�ɻ���");
		else
			System.out.println("����ˮ�ɻ���");
	}
}*/

//���1-100���ܱ�5����������ÿ5��һ��

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

//���Сд��a-z�Լ���д��Z-A

// public class HomeWork {
// 	public static void main(String[] args) {
// 		/*char c1 = 'a', c2 = 'Z';
// 		int i;
// 		for(i = 0; i < 26; i++)
// 			System.out.print((char)(c1 + i) + " ");
// 		System.out.println();
// 		for(i = 0; i < 26; i++)
// 			System.out.print((char)(c2 - i) + " ");*/
// 		//��ʦ�Ĵ���
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

//���1-1/2+1/3-1/4.....1/100�ĺ�

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

//��1+(1+2)+(1+2+3)+(1+2+3+4)+..+(1+2+3+..+100)�Ľ��

public class HomeWork {
	public static void main(String[] args) {
		int i, j, sum = 0;
		for(i = 1; i <= 100; i++)
			for(j = 1; j <= i; j++)
				sum += j;
		System.out.println("sum = " + sum);
	}
}