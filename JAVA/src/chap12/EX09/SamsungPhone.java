package chap12.EX09;

public class SamsungPhone implements PhoneInterface {
	
	// �������̽����� ������ �޼ҵ带 �������̵�(����)
	@Override
	public void sendCall() {
		System.out.println("�¸�� ���������� ��������");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ ��������");
		
	}
	
	// SamsungPhone ���� �޼ҵ�(���) �߰�
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
	
}
