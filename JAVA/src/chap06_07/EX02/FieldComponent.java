package chap06_07.EX02;


class Abc {
	int m = 3;							// �ʵ�, Heep�� ������� �� ����, ��üȭ(�ν��Ͻ�ȭ) ���� ����� �����ϴ�.
	int n = 4;
	
	void work1() {						// ��ǲ���� ���� �޼ҵ�
		int k = 5;						// ��������, stack�� ������� �� ����, �޼ҵ� �ۿ��� ����� �Ұ����ϴ�.
		System.out.println(k);
		work2(3);						// �ٸ� �޼ҵ� ȣ��
	}
	
	void work2(int i) {
		int j = 4;						// ��������, stack�� ������� ������, �޼ҵ� �ۿ��� ����� �Ұ����ϴ�.
		System.out.println(i + j);
		
		int l;							// ���������̹Ƿ� �����ʱ�ȭ(default �� �Ҵ�)�� ���� �ʴ´�.
		l = 0;							// �ݵ�� �Ҵ����־�� �Ѵ�.
		System.out.println(l);
	}
}


public class FieldComponent {

	public static void main(String[] args) {
		Abc abc = new Abc();			// abc ��ü ����
		
		// �ʵ� ȣ��
		System.out.println(abc.m);
		System.out.println(abc.n);

		// �޼ҵ� ȣ��
		abc.work1();
	}

}
