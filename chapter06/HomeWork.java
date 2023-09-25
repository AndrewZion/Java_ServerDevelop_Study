import java.util.Scanner;

// public class HomeWork {
// 	public static void main(String[] args) {
// 		// 下面数组定义正确的有
// 		String strs[] = {'a', 'b', 'c'}; //char -> String错误
// 		String[] strs = {"a", "b", "c"}; //正确
// 		String[] strs = new String{"a", "b", "c"}; //错误
// 		String strs[] = new String[] {"a", "b", "c"}; //正确
// 		String[] strs = new String[3]{"a", "b", "c"}; //错误
// 		for(int i = 0; i < strs.length; i++)
// 			System.out.print(strs[i] + " ");
// 	}
// }

// 有个升序的数组，要求插入一个元素，该数组顺序依然是升序
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
// 		System.out.println("请输入原数组大小：");
// 		n = cin.nextInt();
// 		arr = new int[n];
// 		System.out.println("依次输入数组元素：");
// 		for(i = 0; i < n; i++)
// 			arr[i] = cin.nextInt();
// 		System.out.println("请输入插入元素：");
// 		insertNum = cin.nextInt();
// 		index = findIndex(arr, insertNum);
// 		arr = insert(arr, index, insertNum);
// 		for(i = 0; i < arr.length; i++) 
// 			System.out.print(arr[i] + " ");
// 	}
// }

/*
	随机生成10个整数(1_100的范围)保存到数组
	并倒序打印以及求平均值、
	求最大值和最大值的下标
	并查找里面是否有8 
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
		System.out.println("数组元素如下：");
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
		System.out.println("数组元素平均值为：" + (sum / (double)n));
		System.out.println("数组最大值为" + max + "，下标为" + max_index + "，最小值为" + min + "，下标为" + min_index);
		if(flag == 1)
			System.out.println("数组元素里面有8" + "下标为" + flag_index);
		else if(flag == 0)
			System.out.println("数组元素里面没有8");
	}
}