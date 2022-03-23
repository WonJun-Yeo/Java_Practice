package chap14.EX03;

// �������� Exception�� ���ÿ� �߻��� ���

public class MultiCatch_01 {

	public static void main(String[] args) {
		// 1. ���� Exception ó�� : try, catch ó��
		try {
			System.out.println(10 / 0);								// ArithmeticException
		} catch (ArithmeticException e) {
			// catch ����� �ƹ� ó���� ���� �ʾƵ� ����ó���� �ȴ�.
			System.out.println("���� ����ó�� (ArithmeticException)");
		}
		
		
		try {
			int num = Integer.parseInt("10A");							// NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("���� ����ó�� (NumberFormatException)");
		}
		
		System.out.println("==================================================");
		
		// 2. ���� Exception ó�� ���1
		
		try {
			System.out.println(10 / 0);
			int num2 = Integer.parseInt("10B");
		} catch (ArithmeticException e) {
			System.out.println("���� ����ó�� (ArithmeticException)");
		} catch (NumberFormatException k) {
			System.out.println("���� ����ó�� (NumberFormatException)");
		}
		
		System.out.println("==================================================");
		
		// 3. ���� Exception ó�� ���2 
		
		try {
			System.out.println(10 / 0);
			int num3 = Integer.parseInt("10C");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("���� ����ó�� (ArithmeticException | NumberFormatException)");
		}
		
		
		
		
		System.out.println("���α׷� ����");
		
		
	}

}
