// ����ð������
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("����������������С��");
		int n, i, j;
		n = cin.nextInt();
		int[] arr = new int[n];
		System.out.println("���������������ֵ��");
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
		System.out.println("�������������£�");
		for(i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}