package chap14.EX08;

/*	����� ���� ����
 * 1. Checked Exception : Exception�� ����ϴ� ����, ������ �� ���� �߻�
 * 2. Runtime Exception : RuntimeException�� ����ϴ� ����, ���� �� ���� �߻�
 */ 

class MyException extends Exception {										// Checked Exception
	public MyException () {													// �⺻������
		super();
	}
	
	public MyException (String message) {									// ���� �޼��� ��½� ���
		super(message);
	}										
		
}

class MyRTException extends RuntimeException {								// Runtime Exception
	public  MyRTException () {												// �⺻������
		super();
	}
	
	public  MyRTException (String message) {								// ���� �޼��� ��½� ���
		super(message);
	}
}


class A {
	// 1. ����� ���� ���� ��ü ���� : Checked Exception
	MyException me1 = new MyException();									// �⺻������ ȣ��
	MyException me2 = new MyException("���� �޼���");							// ���ܸ޼����� ����ϴ� ������ ȣ��
	
	
	// 2. ����� ���� ���� ��ü ���� : Runtime Exception
	
	MyRTException mre1 = new MyRTException();								// �⺻������ ȣ��
	MyRTException mre2 = new MyRTException("���� �޼���");						// ���ܸ޼����� ����ϴ� ������ ȣ��
	
	
	// 3. ���ܸ� ������ �߻���Ű�� (throw)
	
	void abc_1(int num ) {
		try {
			if (num > 70) {
				System.out.println("�����۵�");
			} else {
				throw me2;														// throw�� ����ؼ� ���ܸ� ������ �߻�
			}
		} catch (MyException e) {
			System.out.println("�Է°� : " + e.getMessage());
			System.out.println("70������ ���� �־����ϴ�. 70 �̻��� ��������.");
		}
		
	}
	
	void bcd_1 () {
		abc_1(65);																// ���ܰ� ������ �߻��ȴ�.
	}
	
	
	// 4. ���ܸ� ������ �߻�(throw) ��, ���� ���� (throws)
	void abc_2 (int num) throws MyException {
		if (num > 70) {
			System.out.println("�����۵�");
		} else {
			throw me2;														// throw�� ����ؼ� ���ܸ� ������ �߻�
		}
	};
	
	void bcd_2 () {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("�Է°� : " + e.getMessage());
			System.out.println("70������ ���� �־����ϴ�. 70 �̻��� ��������.");
		}																// ���ܰ� ������ �߻��ȴ�.
	}
	
}




public class CreateUserException_01 {

	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();
		
		System.out.println();
		
		a.bcd_2();
		

	}

}
