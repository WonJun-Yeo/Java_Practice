package chap04;
public class While_EX04 {
	public static void main(String[] args) {
		// 1. while���� �⺻ ����
		int a = 0;				// �ʱⰪ
		while (a < 10) {		// ����
			System.out.println(a);
			a++;				// ����
		}
		System.out.println();
		
		int b = 10;
		while (b > 0) {
			System.out.println(b);
			b--;
		}
		System.out.println("==================");
		
		// 2. while���� for������ ��ȯ
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("==================");
		
		// 3. while���� ���ѷ���
		
//		while (true) {								// �ʱⰪ�� �������� ���� ������ �׻� true�̱� ����
//			System.out.println("while�� ���ѷ���");
//		}
//		System.out.println("===================");
		
		// 4. while���� ���ѷ��� ����
		
//		int c = 0;
//		while (true) {
//			if (c > 100) {
//				break;
//			}
//			System.out.println(c);
//			c++;
//		}
		
		
		
	}
}
