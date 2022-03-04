package chap06_07.EX01;

// Ŭ����(class) : ��ü�� �����ϱ����� Ʋ(like. ���ø�,���赵, �ؾƲ)
// ��ü(Object) = �ν��Ͻ� : class�� �����ؼ� RAM(�޸�)���� �۵��Ǵ� �����ڵ� (like. ��, �ؾ)
// ���� �޼ҵ忡�� ��ü�� ��üȭ (= �ν��Ͻ�ȭ) ��Ų��
// A a = new A() : Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�

class A {										// �ܺ� Ŭ����
	int m = 3;									// m : �ʵ� : Ŭ���� ������� ����� ����
												// �ʵ�� ��üȭ(�ν��Ͻ�ȭ) ���Ѿ� ����� ����
												// �ʵ�� �޸��� Heep ������ ����
	
	void print() {								// �޼ҵ� : ������������ �Լ��� ��ü��������� �޼ҵ�
		System.out.println("��ü ���� �� Ȱ��");	// void : ����Ÿ��, pint() : �޼ҵ��
	}
}

class B {										// �ܺ� Ŭ����
	
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1234-5678";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}


public class CreateObjectAndUsingOfMember {				// �ϳ��� Java ���Ͽ��� ���� �ϳ��� public class�� ������ �� �ִ�.

	public static void main(String[] args) {

		A a = new A();				// class A�� ��üȭ(�ν��Ͻ�ȭ) ���Ѽ� a��� ��ü�� �����Ѵ�. (RAM�� �ε��Ų��.)
		System.out.println(a.m);
		a.print();	
		System.out.println();
		
		A b = new A();				// class A�� ��üȭ(�ν��Ͻ�ȭ) ���Ѽ� a��� ��ü�� �����Ѵ�. (RAM�� �ε��Ų��.)
		System.out.println(b.m);
		b.print();	
		System.out.println();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("=======================");
		
		B bb = new B();				// class B�� ��üȭ(�ν��Ͻ�ȭ) ���Ѽ� bb��� ��ü�� �����Ѵ�. (RAM�� �ε��Ų��.)
		bb.printAge();				// bb��ü�� printAge�޼ҵ带 ȣ��
		bb.printName();				// bb��ü�� printName�޼ҵ带 ȣ��
		bb.printPhone();			// bb��ü�� printPhone�޼ҵ带 ȣ��
		System.out.println();
		
		B cc = new B();
		cc.printAge();				// bb��ü�� printAge�޼ҵ带 ȣ��
		cc.printName();				// bb��ü�� printName�޼ҵ带 ȣ��
		cc.printPhone();			// bb��ü�� printPhone�޼ҵ带 ȣ��
		
	}

}
