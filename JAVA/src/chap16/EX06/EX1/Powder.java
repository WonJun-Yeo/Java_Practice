package chap16.EX06.EX1;

//GenericPrinter �� ���� ��ü

public class Powder extends Material {								// �߻�Ŭ������ ���
	@Override
	public void doPrinting() {
		System.out.println("�Ŀ�� ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		return "���� �Ŀ�� �Դϴ�.";
	}
}
