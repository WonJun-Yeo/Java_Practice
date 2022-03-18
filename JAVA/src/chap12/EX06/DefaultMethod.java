package chap12.EX06;

/* interface�� default �޼ҵ�
 * interface ������ �����ΰ� �ִ� �޼ҵ�
 * ���⼭ ����ϴ� default�� ���������ڰ� �ƴϴ�.
 * java 1.8 (8 version) �̻󿡼� ���Ӱ� �߰��� ���
 * 
 * ����, ���ο� ����� �߰� ��Ű������ interface�� �߻�޼ҵ带 �߰����� ���
 * implement �ϰ� �ִ� ��� �ڽĿ��� ������ ���Եȴ�. (�߰��� �߻�޼ҵ带 �������̵����� �ʾұ⶧��)
 * �̶�, �߰��Ǵ� �޼ҵ带 default �޼ҵ�� �ְԵǸ� ���� ���� �߰��� �� �ִ�.
 */


interface A {
	void abc();												// 2005�⵵�� ������ �޼ҵ�� ����, public abstract�� �����Ǿ� �ִ�. �����ΰ� ���� �߻�޼ҵ�
	
	default void bcd() {									// 2020�⵵�� ������ �޼ҵ�� ����, public�� �����Ǿ� �ִ�.
		System.out.println("A �������̽��� bcd() �޼ҵ�");
	}
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("B Ŭ������ abc() �޼ҵ�");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C Ŭ������ abc() �޼ҵ�");
	}
	
	@Override
	public void bcd() {										// default �޼ҵ嵵 �������̵� �� �� �ִ�.
		System.out.println("C Ŭ������ bcd() �޼ҵ�");
	}
}



public class DefaultMethod {

	public static void main(String[] args) {
		// 1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		// 2. �޼ҵ� ȣ��
		a1.abc();
		a1.bcd();
		
		System.out.println();
		
		a2.abc();
		a2.bcd();
		

	}

}
