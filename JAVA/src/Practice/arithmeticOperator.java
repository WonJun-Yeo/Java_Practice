package Practice;

public class arithmeticOperator {

	public static void main(String[] args) {
		// ���������
		System.out.println(2 + 3);					// 5
		System.out.println(8 - 5);					// 3
		System.out.println(7 * 2);					// 14
		System.out.println(7 / 2);					// 3, int �ڷ����̹Ƿ� ������ �����Ͱ� ���ư�
		System.out.println(8 % 5);					// 3
		
		// ����������
		int value1 = 3;
		int value2 = value1++;
		System.out.println(value1);					// 3
		System.out.println(value2);					// 3, value1 ���� 3ȣ�� �� value3�� 1�� ������
		System.out.println(value1);					// 4, �� �ڵ��� ��� value1�� 3+1�� ��
		
		int value3 = 3;
		int value4 = ++value3;
		System.out.println(value3);					// 4
		System.out.println(value4);					// 4, value3�� 1�� ���� ��, value3�� ȣ��
		System.out.println(value3);					// 4, �� �ڵ��� ��� value3�� 3+1�� ��
		
		int value5 = 3;
		int value6 = 4;
		int value7 = 2 + value5-- + ++value6;
		System.out.println(value7);					// 10, 2+3+5
		System.out.println(value5);					// 2
		System.out.println(value6);					// 5
		
	}
}
