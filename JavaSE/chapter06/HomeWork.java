import java.util.Scanner;

// public class HomeWork {
// 	public static void main(String[] args) {
// 		// �������鶨����ȷ����
// 		String strs[] = {'a', 'b', 'c'}; //char -> String����
// 		String[] strs = {"a", "b", "c"}; //��ȷ
// 		String[] strs = new String{"a", "b", "c"}; //����
// 		String strs[] = new String[] {"a", "b", "c"}; //��ȷ
// 		String[] strs = new String[3]{"a", "b", "c"}; //����
// 		for(int i = 0; i < strs.length; i++)
// 			System.out.print(strs[i] + " ");
// 	}
// }

// �и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������
// public class HomeWork {
// 	public static int findIndex(int[] arr, int target) {
// 		int low, high;
// 		for(low = 0, high = arr.length - 1; low <= high;) {
// 			int mid = (low + high) / 2;
// 			if(arr[mid] == target) {
// 				return mid;
// 			} else if(arr[mid] > target) {
// 				high = mid - 1;
// 			} else {
// 				low = mid + 1;
// 			}
// 		}
// 		return low;
// 	}
// 	public static int[] insert(int[] arr, int index, int target) {
// 		int[] arrNew = new int[arr.length + 1];
// 		int i, j;
// 		for(i = 0, j = 0; i < arrNew.length; i++) {
// 			if(i == index) {
// 				arrNew[i] = target;
// 				continue;
// 			}
// 			arrNew[i] = arr[j++];
// 		}
// 		return arrNew;
// 	}
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		int[] arr;
// 		int n, i, insertNum, index;
// 		System.out.println("������ԭ�����С��");
// 		n = cin.nextInt();
// 		arr = new int[n];
// 		System.out.println("������������Ԫ�أ�");
// 		for(i = 0; i < n; i++)
// 			arr[i] = cin.nextInt();
// 		System.out.println("���������Ԫ�أ�");
// 		insertNum = cin.nextInt();
// 		index = findIndex(arr, insertNum);
// 		arr = insert(arr, index, insertNum);
// 		for(i = 0; i < arr.length; i++) 
// 			System.out.print(arr[i] + " ");
// 	}
// }

/*
	�������10������(1_100�ķ�Χ)���浽����
	�������ӡ�Լ���ƽ��ֵ��
	�����ֵ�����ֵ���±�
	�����������Ƿ���8 
*/
public class HomeWork {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, n, max, max_index, min, min_index, sum, flag, flag_index;
		n = cin.nextInt();
		int[] num = new int[n];
		for(i = 0; i < n; i++)
			num[i] = (int)(Math.random() * 100) + 1;
		max = min = num[n - 1];
		max_index = min_index = n - 1;
		sum = 0;
		flag = 0;
		flag_index = 0;
		System.out.println("����Ԫ�����£�");
		for(i = n - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
			if(num[i] > max) {
				max = num[i];
				max_index = i;
			}
			if(num[i] < min) {
				min = num[i];
				min_index = i;
			}
			sum += num[i];
			if(num[i] == 8) {
				flag = 1;
				flag_index = i;
			}
		}
		System.out.println();
		System.out.println("����Ԫ��ƽ��ֵΪ��" + (sum / (double)n));
		System.out.println("�������ֵΪ" + max + "���±�Ϊ" + max_index + "����СֵΪ" + min + "���±�Ϊ" + min_index);
		if(flag == 1)
			System.out.println("����Ԫ��������8" + "�±�Ϊ" + flag_index);
		else if(flag == 0)
			System.out.println("����Ԫ������û��8");
	}
}