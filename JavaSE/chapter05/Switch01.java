import java.util.Scanner;

// public class Switch01 {
// 	public static void main(String[] args) {
// 		/*
// 		��д���򣬽����ַ���a,b,c,d...
// 		a��ʾ����һ��b��ʾ���ڶ�...
// 		*/
// 		Scanner cin = new Scanner(System.in);
// 		char ch = cin.next().charAt(0);
// 		switch(ch) {
// 			case 'a':
// 				System.out.println("����һ");
// 				break;
// 			case 'b':
// 				System.out.println("���ڶ�");
// 				break;
// 			case 'c':
// 				System.out.println("������");
// 				break;
// 			case 'd':
// 				System.out.println("������");
// 				break;
// 			case 'e':
// 				System.out.println("������");
// 				break;
// 			case 'f':
// 				System.out.println("������");
// 				break;
// 			case 'g':
// 				System.out.println("������");
// 				break;
// 			default:
// 				System.out.println("��������");
// 		}
// 	}
// }

//switch��֧ϸ��

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

//switch������ϰ

/*
	��Ŀ��
	��ѧ���ɼ�����60�ֵ�,���"�ϸ�"������60�ֵģ����"���ϸ�"��
	(ע�U����ĳɼ����ܴ���100�����õ�switch��֧)

	˼·������
	switch��֧�ж�ƥ����ǳ��������Ƿ�Χ�����Կ����õ�(��ֵ/60)��
	����ǿ��ת����(int)�����Ϊ0�����ϸ񣬽��Ϊ1���ϸ�
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
// 					System.out.println("�ɼ����ϸ���Ҫ��������Ŷ");
// 					break;
// 				case 1:
// 					System.out.println("�ɼ��ϸ�̫����");
// 					break;
// 			}
// 		} else 
// 			System.out.println("�ɼ���������");
// 	}
// }

//switch������ϰ

/*
	��ӡ���·������ļ���
	3,4,5 ���� 6,7,8 �ļ� 9,10,11 �＾ 12,1,2 ����
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
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("�����·�����");
		}
	}
}