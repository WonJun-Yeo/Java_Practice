package Practice;

public class typeCastingOfBasicDataType {

	public static void main(String[] args) {
		// ĳ���� ���1 : �ڷ���
		int value1 = (int) 5.3;
		long value2 = (long) 10;
		float value3 = (float) 5.8;
		double value4 = (double) 16;
		
		// ĳ���� ���2 : L, F
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		/* �ڵ�Ÿ�Ժ�ȯ
		 ��� ���� ���ͷ� ���� int�� �νĵȴ�.
		 int�� �νĵ� ��, ������ �ڷ������� �ڵ� ���Ժ�ȯ
		 */
		float val1 = 3;
		long val2 = 5;
		double val3 = 7;
		byte val4 = 9;
		short val5 = 11;
		
		// ����Ÿ�Ժ�ȯ
		byte val6 = (byte)128;
		int val7 = (int) 3.5;
		double val8 = (float) 7.5;
		
		
	}

}
