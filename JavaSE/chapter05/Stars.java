/*
	������ϰ
	����
		�ڿ���̨��ӡ������Ľ�����
*/
import java.util.Scanner;
/*
	����˼·��
	�ȴ�ӡб������
	*				1��*
	**				2��*
	***				3��*
	****			4��*
	*****			5��*

	�ٴ�ӡʵ�Ľ�����
		*				1��* 2 x ���� - 1 	4���ո�
	   ***				3��*					3���ո�
	  *****				5��*					2���ո�
	 *******			7��*					1���ո�
	*********			9��*					0���ո�

	����ӡ���Ľ�����
		*				1��*	 ��һ��λ�ú����һ��λ��	4���ո�
	   * *				2��*							3���ո�
	  *   *				2��*							2���ո�
	 *     *			2��*							1���ո�
	*********			9��* ���һ��ȫ��				0���ո�

	������������5��ֵΪ����(��������)
*/
// public class Stars {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		int i, j, k, layer;
// 		layer = cin.nextInt();
// 		for(i = 1; i <= layer; i++) {
// 			for(k = 1; k <= layer - i; k++)
// 				System.out.print(" ");
// 			for(j = 1; j <= 2 * i - 1; j++) {
// 				if(j == 1 || j == 2 * i - 1 || i == layer)
// 					System.out.print("*");
// 				else
// 					System.out.print(" ");
// 			}
// 			System.out.println("");
// 		}
// 	}
// }

//��һ��������ӡ��������
/*
	��ӡʵ������
		*				1��* 2 x ���� - 1 	4���ո�
	   ***				3��*					3���ո�
	  *****				5��*					2���ո�
	 *******			7��*					1���ո�
	*********			9��*					0���ո�
	 *******			7��*					1���ո�
	  *****				5��*					2���ո�
	   ***				3��*					3���ո�
	    *				1��*					4���ո�
*/

public class Stars {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, k, layer, i_1;
		System.out.println("��������������:");
		layer = cin.nextInt();
		for(i = 1; i <= layer; i++) {
			//�������εĹؼ��������ǶԳƽṹ
			//�����°벿��ִ�й������ϰ벿��һ��
			if(i > layer / 2 + 1)
				i_1 = layer - i + 1;
			else
				i_1 = i;
			for(k = 1; k <= layer - i_1; k++)
				System.out.print(" ");
			for(j = 1; j <= 2 * i_1 - 1; j++) {
				if(j == 1 || j == 2 * i_1 - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
