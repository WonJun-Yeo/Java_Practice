package chap06_07.EX02;

class B {
	static String name = "������";					// static Ű�� �Ҵ�Ǹ� ��ü �������� ȣ��
	
	static void print() {
		System.out.println("static�� ���� �޼ҵ��Դϴ�.");
	}
}

//�޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 �������ؼ� ���
//�޼ҵ� �����ε� : �ϳ��� �޼ҵ忡 �Ű�����Ÿ��, ������ ���� ȣ�� (Java)

public class MethodOverloading {

	public static void main(String[] args) {
		// static : ��ü ���� ���� �ٷ� ȣ���ؼ� ��밡���ϵ��� �ϴ� Ű����, ��ü�̸��� �ƴ϶� Ŭ���������� ȣ���ؼ� ��밡��
		
		System.out.println(B.name);		// ��ü���� �ƴ� Ŭ���������� ȣ�� 
		B.print();
		
		print1();						// static Ű���尡 �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ���� �����ϴ�.
		print1(1);						// �Ű������� 1���̰� ����Ÿ���� �޼ҵ带 ȣ��
		print1(1.1);					// �Ű������� 1���̰� �Ǽ�Ÿ���� �޼ҵ带 ȣ��
		print1(1, 2);					// �Ű������� 2���̰� ����Ÿ���� �޼ҵ带 ȣ��
		
		System.out.println();		
	}
	
	
	
	// �޼ҵ� �������̵� : �޽������ ����, �Ű�����Ÿ�� & �Ű����� �� & �Ű����� ������ ���� ȣ��
	// �Ű������� ������ Ÿ�԰� �Ű����� ������ ������ ����
	//JVM�� ������ �޼ҵ���� ������Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
	
	
	public static void print1() {		// ��ü���� �ƴ� Ŭ���������� ȣ��
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	
	public static void print1(int a) {
		System.out.println("���� : " + a);
	}

	public static void print1(double a) {
		System.out.println("double : " + a);
	}
	
	public static void print1(int a, int b) {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	
}
