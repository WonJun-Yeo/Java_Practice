package chap10.EX04;

/*	�޼ҵ� �������̵��� ���� �����ڿ��� ����
 * �ڽ��� Ŭ�������� �θ��� �޼ҵ带 ������ �� ���, ���������ڴ� �θ��� ���������ں��� ������ ���ų� �о�� �Ѵ�.
 * public > protected > default > private
 */

class Aaa {
	protected void abc() {
		
	}
}

class B1 extends Aaa {
	@Override
	public void abc() {}
}

class B2 extends Aaa {
	@Override
	protected void abc() {}
}

class B3 extends Aaa {
	//@Override
	//void abc() {}										// �����߻� : �θ� Ŭ������ �޼ҵ� ���������ڰ� �ڽ� Ŭ������ �������̵��� �޼ҵ��� ���������ں��� ������ ������ ������ �߻��Ѵ�.
}

class B4 extends Aaa {
	//@Override
	//private void abc() {}								// �����߻� : �θ� Ŭ������ �޼ҵ� ���������ڰ� �ڽ� Ŭ������ �������̵��� �޼ҵ��� ���������ں��� ������ ������ ������ �߻��Ѵ�.
}


public class MethodOverriding_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
