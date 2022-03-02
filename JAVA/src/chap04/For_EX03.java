package chap04;

public class For_EX03 {
	public static void main(String[] args) {
		// For�� �⺻�۵�

		int a; // ��� �ۿ��� ����� ����, ���� �� ����, �ʱⰪ �Ҵ� ���� ����, ��������

		for (a = 0; a < 5; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("��� �ۿ��� ��� : " + a);
		System.out.println("====================");

		for (int b = 0; b < 10; b++) { // for�� ������ ����� ����, ��������
			System.out.println(b);
		}
		System.out.println("====================");

		int c;

		for (c = 10; c > 0; c--) {
			System.out.println(c);
		}
		System.out.println("====================");

		// 2�� ����� ���
		for (int i = 0; i < 100; i += 2) { // i+=2 ===> i = i + 2
			System.out.println(i);
		}
		System.out.println("====================");

		// for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�.
		for (int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i + "*" + j + " : " + (i * j));
		}
		System.out.println("====================");

		// for���� ����ؼ� 1���� 10���� * ���� ����� ������. (1 * 2 * 3 * 4 *....10)
		int s = 1;
		for (int i = 1; i < 11; i++) {
			s *= i; // s = s * 1
		}
		System.out.println(s);
		System.out.println("====================");

		// for ���� ����ؼ� 1���� 100���� +���� ����� ������. (1 + 2 + 3 + 4 + ...100)
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i; // sum = sum + 1
		}
		System.out.println(sum);
		System.out.println("====================");

		// ���� for �� : 1�� ~ 9�ܱ��� ������ ���

		for (int f = 1; f < 10; f++) { // i : ���� ���
			for (int g = 1; g < 10; g++) {
				System.out.println(f + " * " + g + " = " + f * g);
			}
				System.out.println("===========");
		}
		
		
		// for������ ���� ���� �߻�, ������ ���� ���
		
		/* 1��
		for (int i = 0;; i++) {
			System.out.print(i + "");
		}
		*/
		
		/* 2��
		for (;;) {
			System.out.println("���ѷ���");
		}
		*/
		
		// ���ѷ��� Ż��
		
		for (int i = 0;; i++) {
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}
		
		// for���� ����ؼ� 1 ~ 1000 ������ 4�� ����� ���� �� : 125500.0		��հ� : double : 502.0	
		// ���� �� ��
		double z = 0;
		int x;
		
		for (x = 0; x <= 1000; x += 4) {
			z += x;
		}
		
		System.out.println(z);
		System.out.println(x);
		System.out.println(z / ((x - 4) / 4));
		// ����� ��
		double sum1 = 0;		// ���� ���� �����ϴ� ����
		double j = 0;			// 4�� ����� ī��Ʈ�ϴ� ����
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0) {	// 4�� �����
				sum1 += i;		// sum = sum + i
				j++;
			}
		}
		
		System.out.println("���� : " + sum1);
		System.out.println("����� :" + sum1 / j);
		
		
		
		
		
		
		
		
		
		
		
	}
}
