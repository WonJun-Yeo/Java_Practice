package chap10.EX05;

/*	����ƽ �޼ҵ�� �������̵����� �ʴ´�.
 * static Ű���尡 ������ �޸� Ŭ���� �������� static method������ �ڵ尡 ����Ǳ� ������, Ŭ���������� ȣ���� �� �ִ�.
 */

class AAAA {
	static void print() {
		System.out.println("A Ŭ����");
	}
}

class BBBB extends AAAA {
	static void print() {
		System.out.println("B Ŭ����");
	}
}

class CCCC extends AAAA {
	static void print() {
		System.out.println("C Ŭ����");
	}
}


public class OverlapStaticMethod {

	public static void main(String[] args) {
		// ��ü �������� �޼ҵ� ȣ��
		
		AAAA.print();
		BBBB.print();
		CCCC.print();
		
		System.out.println("==================");
		
		// ��ü ���� ��, �޼ҵ� ȣ��
		
		AAAA aaaa = new AAAA();
		BBBB bbbb = new BBBB();
		CCCC cccc = new CCCC();
		
		AAAA aaab = new BBBB();
		AAAA aaac = new CCCC();
		
		aaaa.print();
		bbbb.print();
		cccc.print();
		
		System.out.println();
		
		aaab.print();
		aaac.print();
		
		
	}

}
