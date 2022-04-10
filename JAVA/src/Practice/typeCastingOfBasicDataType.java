package Practice;

public class typeCastingOfBasicDataType {

	public static void main(String[] args) {
		// 캐스팅 방법1 : 자료형
		int value1 = (int) 5.3;
		long value2 = (long) 10;
		float value3 = (float) 5.8;
		double value4 = (double) 16;
		
		// 캐스팅 방법2 : L, F
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		/* 자동타입변환
		 모든 정수 리터럴 값은 int로 인식된다.
		 int로 인식된 후, 선언한 자료형으로 자동 자입변환
		 */
		float val1 = 3;
		long val2 = 5;
		double val3 = 7;
		byte val4 = 9;
		short val5 = 11;
		
		// 수동타입변환
		byte val6 = (byte)128;
		int val7 = (int) 3.5;
		double val8 = (float) 7.5;
		
		
	}

}
