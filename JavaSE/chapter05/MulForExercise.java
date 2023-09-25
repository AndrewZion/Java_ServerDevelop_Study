import java.util.Scanner;
/*
	课堂练习
	需求：
		编写一个main方法
		统计3个班成绩情况，每个班有5名同学，
		求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
		统计三个班及格人数，每个班有5名同学
*/

public class MulForExercise {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, count;
		double sum_1, sum_2, sum_3, sum;
		double[][] score = new double[3][5];
		count = 0;
		sum_1 = sum_2 = sum_3 = sum = 0;
		System.out.println("请依此输入3个班同学的成绩：");
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
		System.out.println("各班平均分如下：");
		System.out.println("" + (sum_1 / 5) + " " + (sum_2 / 5) + " " + (sum_3 / 5));
		System.out.println("总平均分为：" + sum / 15);
		System.out.println("及格人数为：" + count);
	}
}