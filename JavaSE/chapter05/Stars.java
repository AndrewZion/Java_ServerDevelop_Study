/*
	课堂练习
	需求：
		在控制台打印输出空心金字塔
*/
import java.util.Scanner;
/*
	分析思路：
	先打印斜三角形
	*				1个*
	**				2个*
	***				3个*
	****			4个*
	*****			5个*

	再打印实心金字塔
		*				1个* 2 x 层数 - 1 	4个空格
	   ***				3个*					3个空格
	  *****				5个*					2个空格
	 *******			7个*					1个空格
	*********			9个*					0个空格

	最后打印空心金字塔
		*				1个*	 第一个位置和最后一个位置	4个空格
	   * *				2个*							3个空格
	  *   *				2个*							2个空格
	 *     *			2个*							1个空格
	*********			9个* 最后一行全有				0个空格

	先死后活：将层数5赋值为变量(键盘输入)
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

//举一反三：打印空心菱形
/*
	打印实心菱形
		*				1个* 2 x 层数 - 1 	4个空格
	   ***				3个*					3个空格
	  *****				5个*					2个空格
	 *******			7个*					1个空格
	*********			9个*					0个空格
	 *******			7个*					1个空格
	  *****				5个*					2个空格
	   ***				3个*					3个空格
	    *				1个*					4个空格
*/

public class Stars {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i, j, k, layer, i_1;
		System.out.println("请输入奇数层数:");
		layer = cin.nextInt();
		for(i = 1; i <= layer; i++) {
			//空心菱形的关键在于它是对称结构
			//所以下半部分执行过程与上半部分一致
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
