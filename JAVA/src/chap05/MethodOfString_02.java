package chap05;

import java.util.Arrays;

public class MethodOfString_02 {
	public static void main(String[] args) {
		// 1. ���ڿ� ���� : toLowerCase() : �ҹ��ڷ� ��ȯ, toUpperCase() : �빮�ڷ� ��ȯ
		
		String str1 = "Java Study";
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("=================");
		
		
		// 2. ���ڿ� ���� : replace(old, new) : old �� new�� ����
		System.out.println(str1.replace("Study", "����"));
		
		System.out.println("=================");
		
		// 3. ���ڿ��� Ư���κ��� ���� substring(���� index, ������ index)
		
		System.out.println(str1.substring(0, 6));
		System.out.println(str1.substring(6, 8));
		
		System.out.println("=================");
		
		// 4. Ư�� ���ڸ� �������� �����Ͽ� String[] �迭�� ���� : split(����1|����2|����3|)
		
		String str11 ="abc/def-ghi jkl";
		String[] strArray = str11.split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "������ ������ �帳�ϴ�. ";
		String[] strArray2 = str111.split(" ");
		System.out.println(Arrays.toString(strArray2));		// ������ ����ڿ� �ƹ��͵� ���� ������ null������ ����� �� ������, �迭�� ������� �ʴ´�.
		
		String str1111 = "�̸�, ����, ����, ��ȭ��ȣ, �����ּ�";
		String[] strArray3 = str1111.split(",");
		System.out.println(Arrays.toString(strArray3));
		for(int i = 0; i < strArray3.length; i++) {
			System.out.print(strArray3[i] + " ");
		}
		
		System.out.println();
		System.out.println("=================");
		
		// 5. �յ��� ������ ������ ��ȯ : trim()
		
		System.out.println("      abc        ");
		System.out.println("      abc        ".trim());
		System.out.println("    abc    abc    ".trim());
		System.out.println("    abc    abc    abc    ".trim());
		
		System.out.println("=================");
		
		// 6. ���ڿ��� �� �� : equals() : ��ҹ��� ����, equalsIgnoreCase : ��ҹ��� ����X
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		/* �޸� �ּ� �� ��
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str2==str4);
		*/
		
	}
}
