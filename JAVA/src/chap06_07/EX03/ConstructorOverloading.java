package chap06_07.EX03;


// �ļ��� �����ε� : �ϳ��� �����ڸ� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��ȴ�.
// ����) ������Ÿ�԰� ���� ��� ������ ������ ����.

class Abc {
	int a, b, c;
	String d;
	
	Abc(){		// �⺻������
		System.out.println(a + ", " + b + ", " + c + ", " + d);
		System.out.println();
	}
	
	Abc(String d) {		// �Ű������� �ϳ��� ������, ������ Ÿ���� String
		this.d = d;
		System.out.println(d);
		System.out.println();
	}
	
	Abc(int a) {		// �Ű������� �ϳ��� ������, ������ Ÿ���� int
		this.a = a;
		System.out.println(a);
		System.out.println();
	}
	
	Abc(int a, int b) {		// �Ű������� �� ���� ������
		this.a = a;
		this.b = b;
		System.out.println(a + ", " + b);
		System.out.println();
	}
	
	Abc(int a, int b, int c) {		// �Ű������� �� ���� ������
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a + ", " + b + ", " + c);
	}
	
}




public class ConstructorOverloading {

	public static void main(String[] args) {
		Abc abc = new Abc();
		Abc abc0 = new Abc("�����ڵ���");
		Abc abc1 = new Abc(1);
		Abc abc2 = new Abc(1,2);
		Abc abc3 = new Abc(1,2,3);
	}
}
