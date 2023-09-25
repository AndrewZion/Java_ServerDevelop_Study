

// public class Break {
// 	public static void main(String[] args) {
// 		for(int i = 0; i < 10; ++i) {
// 			//大于等于1，小于100的随机数
// 			System.out.println((int)(Math.random() * 100) + 1);
// 		}
// 	}
// }


// public class Break {
// 	public static void main(String[] args) {
// 		abc1:
// 		for(int i = 0; i < 4; i++) {
// 		abc2:
// 			for(int j = 0; j < 10; j++) {
// 				if(j == 2) {
// 					//比较下述两种写法的输出
// 					//break abc2;// 等价break abc2
// 					break abc1;
// 				}
// 				System.out.println("j = " + j);
// 			}
// 		}
// 	}
// }


public class Break {
	public static void main(String[] args) {
		String name = "林黛玉";
		//两种写法：推荐第二种（避免空指针[待阐述]）
		// System.out.println(name.equals("贾宝玉"));
		System.out.println("贾宝玉".equals(name));
	}
}