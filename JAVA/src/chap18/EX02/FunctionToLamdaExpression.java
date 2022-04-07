package chap18.EX02;

// ���ٽ� ����
// ������ �� �ִ� �� �ִ�� �����Ͽ� ���

// �Ʒ� 4���� �������̽��� ���ٽ����� ó���� �����ϴ�. �Լ��� �������̽��̱� ����

@FunctionalInterface
interface A {								// �Է�X, ����X, 
	void method1();
}

@FunctionalInterface
interface B {								// �Է� 1��, ����X,
	void method2(int a);
}

@FunctionalInterface
interface C {								// �Է�X, ���� int
	int method3();
}

@FunctionalInterface
interface D {								// �Է� 2��, ���� double
	double method4(int a, int b);
}



public class FunctionToLamdaExpression {

	public static void main(String[] args) {
		// �������̽��� �Լ��� ����
		
		// 1. �Է�x, ����x
			// �͸� �̳�Ŭ������ ó��
			A a1 = new A() {
				@Override
				public void method1() {
					System.out.println("�޼ҵ�1 �͸��̳�Ŭ����");
				};
			};
			// ���ٽ����� ó��
			A a2 = () -> {System.out.println("�޼ҵ�1 ���ٽ� ��ü");};			// ���ٽ� ��ü
			A a3 = () -> System.out.println("�޼ҵ�1 ���ٽ� �߰�ȣ ����");			// ������ �ڵ尡 �� �� �϶�, ������ �߰�ȣ ���� ����
			
			
			a1.method1();
			a2.method1();
			a3.method1();
			
			System.out.println("===============================================");
			
		// 2. �Է� 1��, ����X
			// �͸� �̳�Ŭ������ ó��
			B b1 = new B() {
				@Override
				public void method2(int a) {
					System.out.println("�޼ҵ�2 �͸��̳�Ŭ����");
				}
			};
			
			// ���ٽ����� ó��
			B b2 = (int a) -> {System.out.println("�޼ҵ�2 ���ٽ���ü");};					// ���ٽ� ��ü
			B b3 = (int a) -> System.out.println("�޼ҵ�2 ���ٽ� �߰�ȣ ����");				// ������ �ڵ尡 �� �� �϶�, ������ �߰�ȣ ���� ����
			B b4 = (a) -> System.out.println("�޼ҵ�2 ���ٽ� �Է¸Ű����� Ÿ�� ����");			// �Է¸Ű������� Ÿ���� ��������, �������̽����� �����س��� ����
			B b5 = a -> System.out.println("�޼ҵ�2 ���ٽ� �Է¸Ű����� �Ұ�ȣ ����");			// �Է¸Ű������� �ϳ��϶� �Ұ�ȣ ��������
			
			
			b1.method2(1);
			b2.method2(1);
			b3.method2(1);
			b4.method2(1);
			b5.method2(1);
			
			System.out.println("===============================================");
			
		// 3. �Է�X, ���� int
			// �͸� �̳�Ŭ������ ó��
			C c1 = new C() {
				public int method3() {
					return 4;
				};
			};
			
			// ���ٽ����� ó��
			C c2 = () -> {return 5;};					// ���ٽ� ��ü
			C c3 = () -> 6;								// return�� �� �������� ����� ���, return ���� ����, �ݵ�� �߰�ȣ�� �Բ� ����
			
			
			
			System.out.println("�޼ҵ�3 �͸��̳�Ŭ����" + c1.method3());
			System.out.println("�޼ҵ�3 ���ٽ���ü" + c2.method3());
			System.out.println("�޼ҵ�3 ���ٽ� ����, �߰�ȣ ����" + c3.method3());
			
			System.out.println("===============================================");
		
		// 4. �Է� 2��, ���� double
			// �͸� �̳�Ŭ������ ó��
			D d1 = new D() {
				public double method4(int a, int b) {
					return a + b;
				};
			};
			
			// ���ٽ����� ó��
			D d2 = (int a, int b) -> {return a + b;};	// ���ٽ� ��ü
			D d3 = (a, b) -> {return a + b;};			// �Է¸Ű������� Ÿ���� ��������, �������̽����� �����س��� ����
			D d4 = (a, b) -> a + b;						// return�� �� �������� ����� ���, return ���� ����, �ݵ�� �߰�ȣ�� �Բ� ����
			
			
			System.out.println("�޼ҵ�4 �͸��̳�Ŭ����" + d1.method4(1,2));
			System.out.println("�޼ҵ�4 ���ٽ���ü" + d2.method4(3,4));
			System.out.println("�޼ҵ�4 ���ٽ� �Է¸Ű����� Ÿ�� ����" + d3.method4(5,6));
			System.out.println("�޼ҵ�4 ���ٽ� ����, �߰�ȣ ����" + d4.method4(7,8));
			
			
			
			
	}

}
