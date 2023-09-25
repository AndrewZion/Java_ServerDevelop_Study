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
// 		System.out.println("最大值 = " + max + "下标 = " + max_index);
// 	}
// }


// public class Array {
// 	public static void main(String[] args) {
// 		int n1 = 10;
// 		int n2 = n1;
// 		n2 = 20;
// 		System.out.println(n1 + " " + n2);//输出：10 20
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

// 反转数组arr {11, 22, 33, 44, 55, 66}

// public class Array {
// 	public static void main(String[] args) {
// 		int[] arr = {11, 22, 33, 44, 55, 66};
// 		//方法一：找规律反转
// 		/*for(int i = 0; i < arr.length / 2; i++) {
// 			int temp = arr[i];
// 			arr[i] = arr[arr.length - i - 1];
// 			arr[arr.length - i - 1] = temp;
// 		}
// 		for(int i = 0; i < arr.length; i++) {
// 			System.out.print(arr[i] + " ");
// 		}*/
// 		//方法二：逆序赋值
// 		int len = arr.length, i;
// 		int[] arr1 = new int[len];
// 		for(i = 0; i < len; i++) {
// 			arr1[i] = arr[len - i - 1];
// 		}
// 		//让arr指向arr1数据空间，
// 		//此时arr原来的数据空间就没有变量引用会被当做垃圾,销毁
// 		arr = arr1;
// 		for(i = 0; i < len; i++) {
// 			System.out.print(arr[i] + " ");
// 		}
// 	}
// }

// /*
// 	需求：根据用户输入y/n来决定是否继续数组扩容
// */
// public class Array {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		int[] arr = {1, 2, 3};
// 		do {
// 			System.out.println("请输入数组添加的值：");
// 			int addNum = cin.nextInt();
// 			int[] arrNew = new int[arr.length + 1];
// 			for(int i = 0; i < arr.length; i++)
// 				arrNew[i] = arr[i];
// 			arrNew[arrNew.length - 1] = addNum;
// 			System.out.println("扩容后的数组元素如下：");
// 			for(int i = 0; i < arrNew.length; i++)
// 				System.out.print(arrNew[i] + " ");
// 			System.out.println();
// 			arr = arrNew;
// 			System.out.println("是否继续：y/n");
// 			char c = cin.next().charAt(0);
// 			if(c == 'n')
// 				break;
// 		} while(true);
// 	}
// }

// 根据用户输入y/n来决定是否继续缩减数组

// public class Array {
// 	public static void main(String[] args) {
// 		int[] arr = {1, 2, 3, 4, 5};
// 		Scanner cin = new Scanner(System.in);
// 		while(true) {
// 			System.out.println("是否缩减数组：y/n");
// 			char c = cin.next().charAt(0);
// 			if(c == 'n')
// 				break;
// 			int[] arrNew = new int[arr.length - 1];
// 			for(int i = 0; i < arrNew.length; i++)
// 				arrNew[i] = arr[i];
// 			System.out.println("缩减后的数组元素如下：");
// 			for(int i = 0; i < arrNew.length; i++)
// 				System.out.print(arrNew[i] + " ");
// 			System.out.println();
// 			arr = arrNew;
// 			if(arr.length == 1) {
// 				System.out.println("数组大小为1，无法继续缩减");
// 				break;
// 			}
// 		}
// 	}
// }

// // 变长度二维数组arr

// /*
// arr[0]:	1
// arr[1]:	2 	3
// arr[2]:	4 	5 	6
// arr[4]:	7	8	9	10
// */

// public class Array {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		System.out.println("请输入二维数组大小：");
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


// 杨辉三角arr

/*
arr[0]:	1
arr[1]:	1 	1
arr[2]:	1 	2 	1
arr[4]:	1	3	3	1
*/

// public class Array {
// 	public static void main(String[] args) {
// 		Scanner cin = new Scanner(System.in);
// 		System.out.println("输入杨辉三角行数");
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