package chap12.EX02;

/*	interface ������ Ŭ����
 * Overriding : ������ �޼ҵ带 ���� �����ϴ� ��
 * Implements : �̿ϼ� �޼ҵ带 �ϼ���Ű�� �� (�������̽� ����)
 * extents : �θ�Ŭ������ ����� ��ӹ޾� �ڽ��� ����� Ȯ���ϴ� ��
 */

interface AA {
	void cry();					// �߻�޼ҵ� (�̿ϼ� �޼ҵ�), interface�� �߻�޼ҵ�� public abstract�� �����Ǿ� �ִ�.
	void run();
}


class BB implements AA {		// implements : �̿ϼ� �޼ҵ带 �����Ѵ�.
	@Override
	public void cry() {
		System.out.println("�߿�");
	}
	
	@Override
	public void run() {
		System.out.println("��½");
	}
}


public class Interface_02 {

	public static void main(String[] args) {
		
		// implement �� Ŭ������ ��ü ����
		AA aa = new BB();
		aa.cry();
		aa.run();

	}

}
