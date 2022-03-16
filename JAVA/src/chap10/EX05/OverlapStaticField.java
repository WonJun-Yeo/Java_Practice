package chap10.EX05;

/* �θ��� ����ƽ �ʵ�� �������̵����� �ʴ´�
 *  static Ű���尡 ������ �޸� Ŭ���� �������� ���� ����Ǳ� ������, Ŭ���������� ȣ���� �� �ִ�.
*/

class AAA {
	static int m = 3;
}

class BBB extends AAA {
	static int m = 4;
}

class CCC extends AAA {
	static int m = 5;
}







public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. ��ü �������� Ŭ���������� ȣ��			(�������)
		
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		System.out.println(CCC.m);
		
		System.out.println("===================");
		
		// 2. ��ü ���� �� ȣ��
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		CCC ccc = new CCC();
		
		AAA aab = new BBB();
		AAA aac = new CCC();
		
		System.out.println(aaa.m);
		System.out.println(bbb.m);
		System.out.println(ccc.m);
		
		System.out.println();
		
		System.out.println(aab.m);
		System.out.println(aac.m);
		
		
	}

}
