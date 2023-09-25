
// public class Continue {
// 	public static void main(String[] args) {
// 		for(int i = 0; i < 10; i++) {
// 			if(i == 2) {
// 				continue;
// 			}
// 			System.out.println("i = " + i);
// 		}
// 	}
// }


public class Continue {
	public static void main(String[] args) {
		lable1:
		for(int j = 0; j < 2; j++) {
			lable2:
			for(int i = 0; i < 10; i++) {
				if(i == 2) {
					// continue;//等价continue lable2
					// continue lable2;
					continue lable1;
				}
				System.out.println("i = " + i);
			}
		}
	}
}
