package chap11.EX02;

/*	final method�� final class�� Ư¡
 *  - final method : �������̵��� �Ұ���, �߿��� �޼ҵ�� �ڽĿ��� ������ ���� ���ϵ��� �����Ѵ�.
 *  - final class : ����� �Ұ���
 */

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	void abc() {};							// �޼ҵ� �������̵�
	// final void bcd() {}					// �޼ҵ� �������̵��� �Ұ���
}

final class C {
	
}

/*
class D extends C{							// final class C �� ����� �� ����.
	
}
*/

public class FinalModifier_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
