package chap06_07.EX04;

/* 1. this�� Ű����� ���Ǵ� ��� : this.�ʵ��(or �޼ҵ��)
 * 2. this�� �޼ҵ�� ���Ǵ� ��� : this();
 * 		������ ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. (�޼ҵ� �������� ����� �� ����.)
 * 		�ݵ�� ������ ������ ù �ٿ� �;��Ѵ�.
 */

class Abc {
	Abc(){									// �⺻ ������
		System.out.println("ù ��° ������ �Դϴ�.");
	}
	
	Abc(int a) {
		this();								// �Ű������� ���� �⺻ �����ڸ� ȣ��, this(); : �������� ù �ٿ� �;��Ѵ�.
		System.out.println("�� ��° ������ �Դϴ�.");
	}
	
	Abc(int a, String b) {
		this(1);							// �Ű������� �ִ� �����ڸ� ȣ��, this(); : �������� ù �ٿ� �;��Ѵ�.
		System.out.println("�� ��° ������ �Դϴ�.");
	}
	
	
	void abc() {
		// this();							// �޼ҵ� �������� this(); �� ����� �� ����.
	}
}

public class ThisMethod_01 {
	public static void main(String[] args) {
		// ��ü ����
		
		Abc abc = new Abc();
		System.out.println("=================");
		
		Abc abc1 = new Abc(1);
		System.out.println("=================");
		
		Abc abc2 = new Abc(1, "a");
	}
}
