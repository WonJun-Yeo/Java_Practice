package chap06_07.EX06;

import chap06_07.EX05.A;

public class EX_A {
	// �ٸ� ��Ű���� �����ϴ� class�� �����ϴ� ���

	public static void main(String[] args) {
		// 1. Ŭ������ Full name(��Ű����.Ŭ������) ���
		chap06_07.EX05.A a = new chap06_07.EX05.A();
		
		// a.m�� a.print() �� ���������ڰ� default�� ������ �ٸ� ��Ű������ ������ �� ����.
		
		a.k = 50;
		a.print2();				// public ���� �����ڴ� �ٸ� ��Ű���� Ŭ���������� ������ �� �ִ�.
		
		
		// 2. import�� ���
		A aa = new A();			// import �� ���
		
		aa.k = 50;
		aa.print2();
		
	}

}
