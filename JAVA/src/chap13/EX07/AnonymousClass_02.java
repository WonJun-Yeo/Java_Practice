package chap13.EX07;

// �͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü ����


class A {
	C c = new C() {										// �͸� �̳�Ŭ����
		@Override
		public void bcd() {
			System.out.println("�͸� �̳�Ŭ����");
		}
	};
	
	void abc() {
		c.bcd();
	}
}


interface C {											// �������̽�, �߻�޼ҵ� ����
	public abstract void bcd();
}





public class AnonymousClass_02 {

	public static void main(String[] args) {
		A a = new A();
		
		a.abc();

	}

}
