package chap06_07.EX05;

/*	���� ������ : public, protected, default, private
 * ���������ڴ� ��ü�������� Ư¡�� ĸ��ȭ�� ���Ѵ�.
 * ĸ��ȭ : �����͸� �ܺηκ��� ��ȣ�ϴ� ����
 * Ŭ������, �ʵ��, �޼ҵ��, �����ڸ� �տ� ���� �����ڰ� �Ҵ�Ǿ� �־�� �Ѵ�.
 * Ŭ������ �տ��� public �� default �� �Ҵ��� �� �ִ�.
 * 
 */

public class A {
	int m = 3;						// �ʵ��� �⺻ ���� �����ڴ� default : �����Ǿ� �ִ�. ���� ��Ű�� �������� ���ٰ���
	private int n = 4;				// private ���� �����ڴ� �ܺ� Ŭ���������� ������ ���´�.
	public int k = 5;				// public ���������ڴ� �ٸ� ��Ű���� Ŭ���������� ������ �����ϴ�.
	
	void print() {					// ���������� default ���� : ���� ��Ű������ Ŭ���������� ��밡��
		System.out.println("import success");
	}
	
	public void print2() {
		System.out.println("�ܺ� ��Ű���� �ٸ� Ŭ�������� ���ٰ���");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
