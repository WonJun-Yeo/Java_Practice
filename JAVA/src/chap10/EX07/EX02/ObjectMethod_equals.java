package chap10.EX07.EX02;

/*	== 
 * �⺻ Ÿ���� ���, ���� ���ؼ� ����(true, false)���� ��ȯ
 * ���� Ÿ���� ���, ��ü�� ������ ��
 */

/*	equals()
 * ��ü�� ������ ��
 */


class A {
	String name;
	
	A (String name) {
		this.name = name;
	}
}

class B {
	String name;
	
	B (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {							// �Űߺ����� ������ Object Ÿ������ �ڵ� ��ĳ����
		if (this.name == ((B) obj).name) {						// BŸ������ �ٿ� ĳ������, ��ü�� name �ʵ� ���� ��
			return true;
		}  else {
			return false;
		}
	}
}


public class ObjectMethod_equals {

	public static void main(String[] args) {
		A a1 = new A("�ȳ�");
		A a2 = new A("�ȳ�");
		
		// �ΰ�ü �� ( ==, equals() )
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println();
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));						// a1.equals(a2) : a2 ��ü�� Object Ÿ������ �ڵ� ��ĳ����
		
		System.out.println("====================");
		
		B b1 = new B("�ȳ�");
		B b2 = new B("�ȳ�");
		
		// �ΰ�ü �� ( ==, equals() )
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println();
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));						// b1.equals(b2) : b2 ��ü�� Object Ÿ������ �ڵ� ��ĳ���õǾ��ٰ� BŸ������ �ٽ� �ٿ�ĳ���� 
	}

}
