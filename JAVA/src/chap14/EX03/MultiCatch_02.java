package chap14.EX03;

public class MultiCatch_02 {

	public static void main(String[] args) {
		// 1. Exception ���� ��� ���ܸ� ó�� �� �� �ִ�. (��� ���� Ŭ������ Exception�� ����ϰ� �ִ�.)
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10A");
		} catch(Exception e) {
			// try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("��� ����ó�� (Exception)");
		}
		
		System.out.println("===================================================");
		
		// 2. catch ����� ������ �߸��� ��� (�ֻ��� Exception�� ���� �������� ��ġ�ؾ� �Ѵ�.)
		/*
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10B");
		} catch(Exception e) {
			// try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó�� (��� ���� Ŭ������ Exception�� ����ϰ� �ִ�.)
			System.out.println("��� ����ó�� (Exception)");
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		}
		*/
		
		
		// 3. catch ����� �ùٸ� ���� : �ֻ��� Exception�� catch����� �������� ��ġ
		
		try {
			System.out.println(10 / 0);
			int num = Integer.parseInt("10C");
		} catch (ArithmeticException e) {
			
		} catch (NumberFormatException e) {
			
		} catch(Exception e) {
			// try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó�� (��� ���� Ŭ������ Exception�� ����ϰ� �ִ�.)
			System.out.println("��� ����ó�� (Exception)");
		}
		
		
		System.out.println("���α׷� ����");
		
		
	}

}
