package chap14.EX01;

public class CheckException_01_1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);								// ���α׷��� ������ ����ȴ�. ����ó�� �ʿ�
		} catch (ArithmeticException e) {							// try ������� ������ �߻��Ǿ��� ��, �۵�
			e.printStackTrace();									// ������ ���� �ڼ��� ���� ���
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {													// try ����� ������ ��� �۵��ǰ�, ������ �־ �۵��ȴ�. ��ü�� ��� ��, ��ü�� �޸𸮸� ���� �� �� ��� (ex. sc.close)
			System.out.println("finally ����� �׻� �۵��˴ϴ�.");
		}
		
		System.out.println("���α׷��� ���� �����մϴ�.");
		
	}
}
