import java.util.Scanner;

// public class Array {
// 	public static void main(String[] args) {
// 		int[] arr = {4, -1, 9, 10, 23};
// 		int i, max, max_index;
// 		max = arr[0];
// 		max_index = 0;
// 		for(i = 1; i < arr.length; i++) {
// 			if(arr[i] > max) {
// 				max = arr[i];
// 				max_index = i;
// 			}
// 		}
// 		System.out.println("���ֵ = " + max + "�±� = " + max_index);
// 	}
// }


// public class Array {
// 	public static void main(String[] args) {
// 		int n1 = 10;
// 		int n2 = n1;
// 		n2 = 20;
// 		System.out.println(n1 + " " + n2);//�����10 20
// 		System.out.println("========");
// 		int[] arr1 = {1, 2, 3};
// 		int[] arr2 = arr1;
// 		// arr2[0] = 10;
// 		arr1[1] = 10;
// 		for(int i = 0; i < arr1.length; i++)
// 			System.out.print(arr1[i] + " ");
// 		System.out.println();
// 		for(int i = 0; i < arr2.length; i++)
// 			System.out.print(arr2[i] + " ");
// 	}
// }

// ��ת����arr {11, 22, 33, 44, 55, 66}

// public class Array {
// 	public static void main(String[] args) {
// 		int[] arr = {11, 22, 33, 44, 55, 66};
// 		//����һ���ҹ��ɷ�ת
// 		/*for(int i = 0; i < arr.length / 2; i++) {
// 			int temp = arr[i];
// 			arr[i] = arr[arr.length - i - 1];
// 			arr[arr.length - i - 1] = temp;
// 		}
// 		for(int i = 0; i < arr.length; i++) {
// 			System.out.print(arr[i] + " ");
// 		}*/
// 		//������������ֵ
// 		int len = arr.length, i;
// 		int[] arr1 = new int[len];
// 		for(i = 0; i < len; i++) {
// 			arr1[i] = arr[len - i - 1];
// 		}
// 		//��arrָ��arr1���ݿռ䣬
// 		//��ʱarrԭ�������ݿռ��û�б������ûᱻ��������,����
// 		arr = arr1;
// 		for(i = 0; i < len; i++) {
// 			System.out.print(arr[i] + " ");
// 		}
// 	}
// }

// /*
// 	���󣺸����û�����y/n�������Ƿ������������
// */
// public class Array {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		int[] arr = {1, 2, 3};
// 		do {
// 			System.out.println("������������ӵ�ֵ��");
// 			int addNum = cin.nextInt();
// 			int[] arrNew = new int[arr.length + 1];
// 			for(int i = 0; i < arr.length; i++)
// 				arrNew[i] = arr[i];
// 			arrNew[arrNew.length - 1] = addNum;
// 			System.out.println("���ݺ������Ԫ�����£�");
// 			for(int i = 0; i < arrNew.length; i++)
// 				System.out.print(arrNew[i] + " ");
// 			System.out.println();
// 			arr = arrNew;
// 			System.out.println("�Ƿ������y/n");
// 			char c = cin.next().charAt(0);
// 			if(c == 'n')
// 				break;
// 		} while(true);
// 	}
// }

// �����û�����y/n�������Ƿ������������

// public class Array {
// 	public static void main(String[] args) {
// 		int[] arr = {1, 2, 3, 4, 5};
// 		Scanner cin = new Scanner(System.in);
// 		while(true) {
// 			System.out.println("�Ƿ��������飺y/n");
// 			char c = cin.next().charAt(0);
// 			if(c == 'n')
// 				break;
// 			int[] arrNew = new int[arr.length - 1];
// 			for(int i = 0; i < arrNew.length; i++)
// 				arrNew[i] = arr[i];
// 			System.out.println("�����������Ԫ�����£�");
// 			for(int i = 0; i < arrNew.length; i++)
// 				System.out.print(arrNew[i] + " ");
// 			System.out.println();
// 			arr = arrNew;
// 			if(arr.length == 1) {
// 				System.out.println("�����СΪ1���޷���������");
// 				break;
// 			}
// 		}
// 	}
// }

// // �䳤�ȶ�ά����arr

// /*
// arr[0]:	1
// arr[1]:	2 	3
// arr[2]:	4 	5 	6
// arr[4]:	7	8	9	10
// */

// public class Array {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		System.out.println("�������ά�����С��");
// 		int n, i, j, k;
// 		n = cin.nextInt();
// 		int[][] arr = new int[n][];
// 		k = 1;
// 		for(i = 0; i < n; i++) {
// 			arr[i] = new int[i + 1];
// 			for(j = 0; j < arr[i].length; j++) {
// 				arr[i][j] = k++;
// 				System.out.print(arr[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }


// �������arr

/*
arr[0]:	1
arr[1]:	1 	1
arr[2]:	1 	2 	1
arr[4]:	1	3	3	1
*/

// public class Array {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		System.out.println("���������������");
// 		int n, i, j;
// 		n = cin.nextInt();
// 		int[][] arr = new int[n][];
// 		for(i = 0; i < n; i++) {
// 			arr[i] = new int[i + 1];
// 			for(j = 0; j < arr[i].length; j++) {
// 				if(j == 0 || j == arr[i].length - 1) {
// 					arr[i][j] = 1;
// 				} else {
// 					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
// 				}
// 				System.out.print(arr[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }