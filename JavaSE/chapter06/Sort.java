// 需求：冒泡排序
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入待排序数组大小：");
		int n, i, j;
		n = cin.nextInt();
		int[] arr = new int[n];
		System.out.println("请依次输入数组的值：");
		for(i = 0; i < n; i++)
			arr[i] = cin.nextInt();
		for(i = 0; i < n - 1; i++)
			for(j = n - 1; j > i; j--) {
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		System.out.println("升序后的数组如下：");
		for(i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}