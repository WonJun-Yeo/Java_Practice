package chap12.EX04;

/*	�������̽� ��ӽ� �ڽ� Ŭ���� ���� ������ ���� <�߿�>
 * �������̽��� �޼ҵ带 ������ ���� �ݵ�� public ���������ڸ� �ٿ�����Ѵ�.
 * 		�ڽ��� ���������ڴ� ��ӹ��� ��, �� ������ �θ𺸴� �аų� ���ƾ��Ѵ�.
 * 		�������̽��� �޼ҵ�� ��� public�̱� ������ ������ �аų� ���� ���� public ���̴�.
 */

interface A {
	public abstract void abc();
}

interface B {
	void abc();					// public abstract�� ������ ����
}


class C implements A {
	@Override					// A �������̽��� abc() �޼ҵ带 �������̵��ؼ� ����
	public void abc() {			// �ڽ��� ���������ڴ� ��ӹ��� ��, �� ������ �θ𺸴� �аų� ���ƾ��Ѵ�.
		
	}
}

class D implements B {
	@Override
	public void abc() {
		
	}
}

class E implements B {
	@Override
	public void abc() {
		
	}
}
/* implements �� �ϸ� �̿ϼ��� �޼ҵ带 ������ �ϼ������־���Ѵ�. �ƴҰ�� �����߻�
class F implements A {

}
*/



public class Interface_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
