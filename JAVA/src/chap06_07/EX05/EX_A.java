package chap06_07.EX05;

// ���� ��Ű�� ������ class A�� ����

public class EX_A {

	public static void main(String[] args) {
		// A Ŭ������ ���� ��Ű�� ���ο� �����ϹǷ� import ���� ����� �����ϴ�.
		
		A a = new A();					// import ���� ���
		
		a.m = 10;						// default ���������ڴ� ���� ��Ű�� ���� �ܺ�Ŭ�������� ������ �����ϴ�.
		// a.n = 20;					// private ���������ڴ� �ܺ�Ŭ���������� ������ ���´�.
		
		a.print();						// default ���������ڴ� ���� ��Ű�� ���� �ܺ�Ŭ�������� ������ �����ϴ�.
		
		System.out.println(a.m);
		
	}

}
