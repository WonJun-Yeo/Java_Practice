package chap18.EX03;

import java.util.Scanner;

/* 1. Scanner ����ؼ� double�� �� ���� ��ǲ�ް�
 * 2. ���
 * 		1. ���ٽ��� ����ؼ� ��ǲ ���� �� ���� ��Ģ����(+, -, *, /) ���� �� ���
 * 		2. �������̽��� ������ �ڽ� ��ü�� ����ؼ� ��ǲ ���� ���� ��Ģ����
 * 		3. �͸��̳� Ŭ������ �̿��� �������̽��� ������ ��ǲ���� ���� ��Ģ����
 * 3. ArithmeticException ó�� : 0���� ������ ���� �߻�
 */


@FunctionalInterface
interface Arithmethic {
	void arithmethicOpr(double p, double q);
}


class A implements Arithmethic {
	
	
	public void arithmethicOpr(double p, double q) {
		System.out.println("�� : " + (p+q) + ", �� : " + (p-q) + ", �� : " + (p*q) + ", ������ : " + (p/q));
	};
}


public class ArithmethicOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Ģ������ ���� ù ��° ���� �Է��� �ּ���.");
		double a = sc.nextDouble();

		System.out.println("��Ģ������ ���� �� ��° ���� �Է��� �ּ���.");
		double b = sc.nextDouble();
		
		
		// ��� 1
		Arithmethic ari = (p, q) -> System.out.println("�� : " + (p+q) + ", �� : " + (p-q) + ", �� : " + (p*q) + ", ������ : " + (p/q));
		ari.arithmethicOpr(a, b);
		
		System.out.println("================================");
		
		// ��� 2
		
		Arithmethic ari2 = new A();
		
		ari2.arithmethicOpr(a, b);
		

		
		System.out.println("================================");
		
		// ��� 3
		
		Arithmethic ari3 = new Arithmethic() {
			public void arithmethicOpr(double p, double q) {
				System.out.println("�� : " + (p+q) + ", �� : " + (p-q) + ", �� : " + (p*q) + ", ������ : " + (p/q));
			};
		};
		
		ari3.arithmethicOpr(a, b);
		
		sc.close();
	}

}
