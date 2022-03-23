package chap13.EX10.EX1;

class A {
	
	/* B : �������̽� Ÿ��, b : ��������, b �� null�� �Ҵ�Ǿ� ����
	 * 	b�� �Ҵ��ϴ� ���
	 * 1. ��ü ���� ��, ���� �Ҵ�
	 * 2. �����ڸ� ���ؼ� ���� �Ҵ�
	 * 3. setter�� ���ؼ� ���� �Ҵ�
	 */
	
	
	B b;
	
	A() {}												// �⺻������
	
	A(B b) {
		this.b = b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	interface B {
		void play();
		void stop();
	}
	
	// play(), stop() �޼ҵ� ������
	void abc() {
		b.play();
		b.stop();
	}
}


public class InnerInterface_01_1 {

	public static void main(String[] args) {
		
		// 1. ��ü ���� �� �Ű����� b�� ���� �Ҵ�
		A a1 = new A();
		
		a1.b = (A.B) new A.B() {
			@Override
			public void play() {
				System.out.println("��ü ���� �� �Ű����� b�� ���� �Ҵ�, �͸� Ŭ���� play()�޼ҵ�");
			}
			@Override
			public void stop() {
				System.out.println("��ü ���� �� �Ű����� b�� ���� �Ҵ�, �͸� Ŭ���� stop()�޼ҵ�");
			}
		};
		
		a1.abc();
		
		System.out.println("===========================================");
		
		// 2. �����ڸ� ���ؼ� b ���� �Ҵ� 
		
		A a2 = new A(new A.B() {
			@Override
			public void play() {
				System.out.println("�����ڸ� ���ؼ� b ���� �Ҵ�, �͸� Ŭ���� play()�޼ҵ�");
			}
			@Override
			public void stop() {
				System.out.println("�����ڸ� ���ؼ� b ���� �Ҵ�, �͸� Ŭ���� stop()�޼ҵ�");
			}
		});
		
		a2.abc();
		
		System.out.println("===========================================");
		
		// 3. setter�� ���ؼ� ���� �Ҵ�

		A a3 =  new A();
		
		a3.setB (new A.B() {
			@Override
			public void play() {
				System.out.println("setter�� ���ؼ� ���� �Ҵ�, �͸� Ŭ���� play()�޼ҵ�");
			}
			@Override
			public void stop() {
				System.out.println("setter�� ���ؼ� ���� �Ҵ�, �͸� Ŭ���� stop()�޼ҵ�");
			}
		});
		
		a3.abc();
		
	}
}
