package chap16.EX06.EX1;

// GenericPrinter �� ���� ��ü

public class Plastic extends Material {								// �߻�Ŭ������ ���
	@Override
	public void doPrinting() {
		System.out.println("�ö�ƽ ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		return "���� �ö�ƽ �Դϴ�.";
	}
}
