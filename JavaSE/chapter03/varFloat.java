
/* 	Java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����
	float�ͳ���������'f'��'F'

	*/

// public class varFloat {
// 	public static void main(String[] args) {
// 		float num1 = 1.1; //����
// 		float num2 = 1.1f; //��
// 		double num3 = 1.1; //��
// 		double num4 = 1.1f; //��
// 		/*���ͣ�
// 			ĩβ����f����float�ͣ�float��תdouble�Ͱ�ȫ��
// 			���long a = 100;
// 			û��lĬ��int�ͣ�int��תlong�Ͱ�ȫ
// 		*/
// 		System.out.println(num1);
// 	}
// }

//������С���Ƚ�����
public class varFloat {
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1/3;
		System.out.println(num1);
		System.out.println(num2);
		/*
		��������
		2.7
		2.6999999999999997
		�����ж϶�����ֵ�Ƿ���ȣ���Ӧ���� ==
		Ӧ�ð����·�ʽ��д
		*/
		if(Math.abs(num2 - num1) < 0.00001){
			System.out.println("num1��num2���");
		}
	}
}