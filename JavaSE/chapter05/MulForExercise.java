import java.util.Scanner;
/*
	������ϰ
	����
		��дһ��main����
		ͳ��3����ɼ������ÿ������5��ͬѧ��
		����������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]
		ͳ�������༰��������ÿ������5��ͬѧ
*/

public class MulForExercise {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, count;
		double sum_1, sum_2, sum_3, sum;
		double[][] score = new double[3][5];
		count = 0;
		sum_1 = sum_2 = sum_3 = sum = 0;
		System.out.println("����������3����ͬѧ�ĳɼ���");
		for(i = 0; i < 3; i++){
			for(j = 0; j < 5; j++) {
				score[i][j] = cin.nextDouble();
				switch(i) {
					case 0:
						sum_1 += score[i][j];
						break;
					case 1:
						sum_2 += score[i][j];
						break;
					case 2:
						sum_3 += score[i][j];
				}
				sum += score[i][j];
				if(score[i][j] >= 60)
					count++;
			}
		}
		System.out.println("����ƽ�������£�");
		System.out.println("" + (sum_1 / 5) + " " + (sum_2 / 5) + " " + (sum_3 / 5));
		System.out.println("��ƽ����Ϊ��" + sum / 15);
		System.out.println("��������Ϊ��" + count);
	}
}