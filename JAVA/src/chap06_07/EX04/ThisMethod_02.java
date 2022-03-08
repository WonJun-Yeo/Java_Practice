package chap06_07.EX04;

//Aaa Ŭ������ ������ �������� �����ڸ� ����� ���, this() �޼ҵ���� ����� ��� : �ߺ��� ���� �Ź� �Է�

class Aaa {									
	int m1, m2, m3, m4;						// �ʵ� 4�� ����
	
	Aaa(){									// �Ű������� ���� �⺻������
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4; 
	}

	Aaa(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4; 
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}


//Bbb Ŭ������ ������ �������� �����ڸ� ����� ���, this() �޼ҵ带 ����� ��� : �ߺ��� ���� ����

class Bbb {
	int m1, m2, m3, m4;
	
	Bbb(){								// �ʱⰪ �Ҵ�
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Bbb(int a) {
		this();							// ��ǲ���� ���� ������ ȣ��
		m1 = a;
	}
	
	Bbb (int a, int b) {
		this(a);						// �Ű����� 1���� ������ ȣ��
		m2 = b;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}




public class ThisMethod_02 {
	public static void main(String[] args) {
		// 1. �� ���� ��ü ���� (this �̻��)
		Aaa aaa1 = new Aaa();
		Aaa aaa2 = new Aaa(10);
		Aaa aaa3 = new Aaa(10, 20);
		
		aaa1.print();
		System.out.println();
		
		aaa2.print();
		System.out.println();
		
		aaa3.print();
		System.out.println("================");
		
		// 2. �� ���� ��ü ���� (this ���)
		Bbb bbb1 = new Bbb();
		Bbb bbb2 = new Bbb(10);
		Bbb bbb3 = new Bbb(10, 20);
		
		bbb1.print();
		System.out.println();
		
		bbb2.print();
		System.out.println();
		
		bbb3.print();
	}
}
