//¼üÅÌÊäÈëÓï¾ä
import java.util.*;
public class input {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b, c;
		// System.out.println("a¹ş¹ş");
		a = myScanner.nextInt();//ÊäÈëintĞÍ
		b = myScanner.nextInt();
		c = a + b;
		System.out.println("ºÙºÙ");
		System.out.println(c);
		String str1;
		//str1 = myScanner.next();//Óöµ½¿Õ¸ñÍ£Ö¹
		str1 = myScanner.next();//ÕûĞĞ×Ö·û´®ÊäÈë°üÀ¨¿Õ¸ñ
		System.out.println("==================");
		System.out.println(str1);
	}
}