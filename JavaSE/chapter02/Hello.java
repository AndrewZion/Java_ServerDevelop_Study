
//第一个Java程序

// public class Hello {
// 	public static void main(String[] args) {
// 		System.out.println("Hello,World~\n");
// 	}
// }

import java.util.LinkedList;

public class Hello {
	public static void main(String[] args) {
		LinkedList<Character> path = new LinkedList<>();
		path.add('a');
		path.add('e');
		String temp = path.toString();
		System.out.println(temp);
	}
}