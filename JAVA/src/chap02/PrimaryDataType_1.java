package chap02;
public class PrimaryDataType_1 {
	public static void main(String[] args) {
		// boolean : true / false ���� �Ҵ� ����
		boolean bool1 = true;
		boolean bool2 = false;
		// boolean bool3 = 10;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("========== ���� : ���� ��, ��� ==========");
		
		byte value1 = -128;		// byte : 1byte(8bit), -128 ~ +127
		//byte value11 = -129;	// ���� �߻�
		
		byte value111 = (byte) -129;	// -129�� byte Ÿ������ ��ȯ, -128 ������ +127�̹Ƿ� 127��ȯ
		byte value1111 = (byte) 128;	// +128�� byte Ÿ������ ��ȯ, +128 ������ -128�̹Ƿ� -128��ȯ
		
		System.out.println(value1);
		System.out.println(value111);
		System.out.println(value1111);
		
		short value2 = -10;		// shot : 2byte, -32768 ~ +32767
		//value2 = -32769;		// ���� ���
		
		value2 = (short) -32769;
		System.out.println(value2);
		
		int value3 = 100;		// int : 4byte
		long value4 = 200L;		// long : 8byte
		
		// �Ǽ� : float, double
		float value5 = 1.2F;
		double value6 = -1.5;
	}
}
