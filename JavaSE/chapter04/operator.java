//���������===============================================================

// public class operator {
// 	public static void main(String[] args) {
// 		System.out.println(10 / 4);//2
// 		System.out.println(10.0 / 4);//2.5
// 		double d = 10 / 4;
// 		System.out.println(d);//2.0
// 	}
// }

//% ȡģ��ȡ��
//���ʹ�ʽ��a % b = a - a / b * b;

// public class operator {
// 	public static void main(String[] args) {
// 		System.out.println(10 % 3);//1
// 		System.out.println(-10 % 3);//-1
// 		System.out.println(10 % -3);//1
// 		System.out.println(-10 % -3);//-1
// 	}
// }

//������

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


//����һ���������滪���¶�,�����¶�ת�������¶ȵĹ�ʽΪ:5/9*(�����¶�-100),
//����������¶ȶ�Ӧ�������¶ȡ�[234.5]

// public class operator {
// 	public static void main(String[] args) {
// 		double huaShi = 234.5;
// 		// double sheShi = 5 / 9 * (huaShi - 100);//��Bug
// 		double sheShi = 5.0 / 9 * (huaShi - 100);
// 		System.out.println("���϶ȣ�" + huaShi + "��Ӧ���϶ȣ�" + sheShi);
// 	}
// }
//�������0.0����Ϊ5 / 9 = 0��0 * �κ�������0�������޸�5->5.0

//��ϵ�����===============================================================

//�߼������===============================================================

// public class operator {
// 	public static void main(String[] args) {
// 		int a = 4;
// 		int b = 9;
// 		if(a < 1 & ++b < 50) {
// 			System.out.println("��������");
// 		}
// 		System.out.println("b=" + b);//b=10
// 	}
// }

//��ϰ��
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
// 			System.out.println("��");
// 		}
// 		if(b2 = false) {
// 			System.out.println("��");
// 		} else {
// 			System.out.println("��");
// 		}
// 		//���
// 		/*
// 		��
// 		��
// 		*/
// 	}
// }

//��ֵ�����===============================================================

public class operator {
	public static void main(String[] args) {
		byte b = 3;
		//b = b + 2;//���� int->byte����ʧ
		b += 2;//�ȼ��� b = (byte)(b + 2) �������ͨ��
		System.out.println("ͨ���޴���");
	}
}