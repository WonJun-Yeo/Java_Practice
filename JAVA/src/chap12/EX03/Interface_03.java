package chap12.EX03;

/* interface �� ���� ��� (����)�� �����ϴ�.
 * class �� ���� ����� �Ұ����ϴ�.
 * class�� interface�� �ѹ��� ����� �� �ִ�.
 */

interface A {
	
}

interface B {
	
}


// 1. ���� interface ���
class C implements A {
	
}

// 2. ���� interface ���
class D implements A, B {
	
}

// 3. Ŭ������ �������̽��� �ѹ��� ���
class E extends C implements A, B {
	
}

public class Interface_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
