package chap06_07.EX02;

// �پ��� Ÿ���� �޼ҵ� ���� (����Ÿ�� ����)

public class ExternalCallMethods {

	public static void main(String[] args) {
		// ��ü ����
		A a = new A();								// ���� ��Ű�� ���� Ŭ������ import ���� ȣ���ؼ� ��밡��
		
		// �޼ҵ� ȣ��
		a.print();
		System.out.println();
		
		int k = a.data();
		System.out.println(k);
		System.out.println();
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		System.out.println();
		
		a.printMethod(5);
		a.printMethod(13);
		System.out.println();
		
		// ���� : 
		
		System.out.println(a.data());				// ��±����� ȣ�� ������ �޼ҵ�(������ �ִ� �޼ҵ�)
		// System.out.println(a.print());			// �޼ҵ峻�� �̹� ��±����� �ֱ� ������ ����
		a.print();
		System.out.println(a.sum(4, 10.5));
		// System.out.println(a.printMethod(3));	// �޼ҵ峻�� �̹� ��±����� �ֱ� ������ ����
		
		
	
	}

}
