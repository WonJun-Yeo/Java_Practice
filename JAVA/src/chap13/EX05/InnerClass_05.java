package chap13.EX05;

/*	�����̳�Ŭ���� : �޼ҵ� ���ο� ����� Ŭ����
 * �����̳�Ŭ������ ������ ���� ���� Ŭ���� ����
 * 
 * 
 */

class A {														// A.class
	void abc () {
		class B{}												// A$1B.class
		class C{}												// A$1C.class
	}
	
	void bcd() {
		class C{}												// A$2C.class, ������ �̸��� Ŭ������ ������ ���, �޼ҵ� ���ڷ� ������ �ο��ȴ�.
		class D{}												// A$1D.class
	}
	
	void cde() {
		class B{}												// A$2B.class
		class C{}												// A$3C.class
	}
	
	
}





public class InnerClass_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
