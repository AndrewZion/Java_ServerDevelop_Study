

// public class Break {
// 	public static void main(String[] args) {
// 		for(int i = 0; i < 10; ++i) {
// 			//���ڵ���1��С��100�������
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
// 					//�Ƚ���������д�������
// 					//break abc2;// �ȼ�break abc2
// 					break abc1;
// 				}
// 				System.out.println("j = " + j);
// 			}
// 		}
// 	}
// }


public class Break {
	public static void main(String[] args) {
		String name = "������";
		//����д�����Ƽ��ڶ��֣������ָ��[������]��
		// System.out.println(name.equals("�ֱ���"));
		System.out.println("�ֱ���".equals(name));
	}
}