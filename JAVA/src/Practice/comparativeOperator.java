package Practice;

public class comparativeOperator {

	public static void main(String[] args) {
		// ũ��� ������
		System.out.println(5 < 2);		// false
		System.out.println(5 > 2);		// true
		System.out.println(5 < 5);		// false
		System.out.println(5 > 5);		// false
		System.out.println(5 <= 5);		// true
		System.out.println(5 >= 5);		// true
		
		// ��� ������
		int a = 4;
		int b = 2;
		int c = 4;
		String str1 = new String("�ȳ�");
		String str2 = new String("�ȳ�");
		
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
		System.out.println(a == c);		// true
		System.out.println(a != c);		// false
		
		System.out.println(str1 == str2);		// false
		
	}

}
