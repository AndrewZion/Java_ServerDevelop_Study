import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int year;
		year = cin.nextInt();
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			System.out.println("是闰年");
		else 
			System.out.println("不是闰年");
	}
}