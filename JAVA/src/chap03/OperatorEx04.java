package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		/*
		 * ���� ������ ( =, +=, -=, *=. /=, >>=, <<=, >>>= )
		 * ���Ŀ��� �켱������ ���� ����.
		 * a = b;		b ������ ���� a ������ �Ҵ��ض�� �ǹ�
		 * a += b	===>	a = a + b
		 * a -= b	===>	a = a - b
		 * a *= b	===>	a = a * b
		 * a /= b	===>	a = a / b
		 * a &= b	===>	a = a & b
		 * a |= b	===>	a = a | b
		 * a <<= b	===>	a = a << b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		
		int value2;			// �⺻�ڷ����� ��� ������ ���� �Ҵ� �����ʾ��� ���, �⺻������ 0�� �Ҵ�.
		value2 = 5;			// �����ڷ����� ��� ������ ���� �Ҵ� �����ʾ��� ���, �⺻������ NULL 
		// ��� ǥ��
		System.out.println(value2 += 2);		// value2 = value2 + 2
		System.out.println(value2 -= 2);		// value2 = value2 - 2
		System.out.println(value2 /= 2);		// value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);		// value2 = value2 | 2, 2�������� �ٲ� �� ��Ʈ�� ���
		value2 = 5; System.out.println(value2 &= 2);		// value2 = value2 & 2, 2�������� �ٲ� �� ��Ʈ�� ���
		System.out.println("======================");
		
		// �������Ʈ (<<, >>) : ��ȣ��Ʈ���� �̵�
		value2 = 5; System.out.println(value2 <<= 2);		// value2 = value2 << 2, 2�������� �ٲ� �������� 2��Ʈ �Ű� ���
		value2 = 5; System.out.println(value2 >>= 2);		// value2 = value2 >> 2, 2�������� �ٲ� ���������� 2��Ʈ �Ű� ���, �̶� ��������� ©��
		System.out.println("======================");
		
		// �� ����Ʈ (>>>) : ��ȣ��Ʈ���� �̵�
		value2 = 5; System.out.println(value2 >>>= 2);		// value2 = value2 >>> 2
		
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);	// 
		
		
		
		
		
		
	}
}
