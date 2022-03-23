package chap14.EX02;

/*	���࿹�� (Unchecked Exception, Runtime Exception) : ������ �ܰ迡���� ���ܰ� �߻����� �ʰ�, ������ �� ���� �߻�
 * 
 */

class AA {}
class BB extends AA {}

public class UncheckedException {

	public static void main(String[] args) {
		// ArithmeticException : 0���� � ���� ������ ���� �߻�
		// System.out.println(10 / 0);
		
		// ClassCastException : Ŭ������ Ÿ���� ��ȯ�� �� �Ұ����� Ÿ������ ��ȯ �� ���� �߻�
		AA aa = new AA();
		// BB bb = (BB) aa;
		
		// ArrayIndexOutOfBoundsException : �迭���� �������� �ʴ� index ��ȣ�� ����� �� ���� �߻�
		int[] array = {1, 2, 3};
		// System.out.println(array[3]);
		
		// NumberFormatException : ������ ���ڸ� ����Ÿ������ ��ȯ�� �� ���� �� ���� �߻�
		// int num = Integer.parseInt("10!");					// ���ڿ� 10�� ������ ��ȯ
		// System.out.println(num);
		
		// NullPointerException : ��ü�� �������� �ʾ� null���� �� ȣ���ϴ� ��� ���� �߻�
		String str = null;
		System.out.println(str.charAt(2));
		
		
		
		
	}

}
