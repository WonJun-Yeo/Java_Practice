package chap14.EX01;

import java.util.Scanner;


/* Error : ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� ����, H/W Error
 * Exception (����) : ���α׷��Ӱ� ������ �� �ִ� �κ�
 * ���ܰ� �߻��Ǹ� ���α׷��� ����ȴ�.
 * ���ܰ� �߻��Ǵ��� ���α׷��� ������� �ʰ� ó�����־�� �Ѵ�.(���� ó��) 
 */

/*	ArithmeticException : � ���� 0���� ������ �߻��ϴ� ����
 * ��ǻ�ʹ� ����� 0���� ������ ����� �Ұ����ϴ�.
 */






public class CheckedException_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է� �ϼ���.");
		
		int a = sc.nextInt();
		int b = 10;
		
		
		try {												// try ������� exception�� �߻��� ���, 
			// try ���
			System.out.println(b / a);
		} catch(ArithmeticException e) {
			// catch ��� : try ������� ������ �߻��� ���, catch ����� �۵��ȴ�.
			System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�.�ٸ� ���� �־� �ּ���.");
		} finally {
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
		
		sc.close();
		
		
		
	}

}
