package chap06_07.EX05;

import chap06_07.EX06.EX06_bcd;

// import chap06_07.EX06.Abc;				// Abc class�� ���������ڰ� default�̹Ƿ� �ܺ� ��Ű������ import�� �Ұ����ϴ�.


public class External_Abc extends EX06_bcd {			// EX06_bcd Ŭ������ �θ� �ǰ�, External_Abc Ŭ������ �ڽ��� �ȴ�.

	public static void main(String[] args) {
		
		// Abc abc2 = new Abc();
		
		
		/* �ٸ� ��Ű������ ȣ��
		 * 1. import
		 * 2. ��ü ����
		 * 3. ���������� Ȯ��(public, protected_��Ӱ���_
		 */
		EX06_bcd bcd1 = new EX06_bcd();
		External_Abc ext = new External_Abc();
		
		// �ʵ�
		
		bcd1.a = 1000;							// public : �ٸ� ��Ű������ ���ٰ���
		//bcd1.b = 2000;						// protected : ��Ӱ����� ��쿡�� �ٸ� ��Ű������ ���ٰ���
		//bcd.c = 3000;							// default
		//bcd1.d = 4000;						// private
		
		// �ڽ�Ŭ�������� �ٸ� ��Ű���� �θ�Ŭ������ protected �ʵ忡 ����
		
		ext.b = 2000;
		
		
		// �޼ҵ�
		
		bcd1.print1();							// public
		//bcd1.print2();						// protected
		//bcd1.print3();						// default
		//bcd1.print4();						// private
	}

}
