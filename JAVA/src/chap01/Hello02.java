package chap01;
public class Hello02 {
	// �޼ҵ� ���� (�޼ҵ� : ��ü������� �Լ�(��ǲ���� �־ ���α׷��� ���� ����� ��½�)�� �޼ҵ��� ȣĪ�Ѵ�.)
	
	public static int sum (int n, int m) {
		return n+m;
	}
	
	
	
	public static void main(String[] args) {
		int i = 20;		// i ������ ������ ���� �� �ְ�, �ʱⰪ���� 20�� �Ҵ��ؼ� ����
		int s;			// s ������ ������ ���� �� �ְ�, �ʱⰪ�� �����
		char a;			// a ������ �� ���ڸ� ���� �� �ִ�. (�ƽ�Ű��), ĳ���Ͱ��� ������ �Ҵ��� ���� ''(���� ����ǥ)�� �̿��Ѵ�.
		String b;
		
		b = "������ ������ �����ϴ�.";
		
		s = sum (i, 10); // sum() �޼ҵ� ȣ��
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
	}
}