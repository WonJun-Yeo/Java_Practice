package Practice;

public class arithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자
		System.out.println(2 + 3);					// 5
		System.out.println(8 - 5);					// 3
		System.out.println(7 * 2);					// 14
		System.out.println(7 / 2);					// 3, int 자료형이므로 나머지 데이터가 날아감
		System.out.println(8 % 5);					// 3
		
		// 증감연산자
		int value1 = 3;
		int value2 = value1++;
		System.out.println(value1);					// 3
		System.out.println(value2);					// 3, value1 값인 3호출 후 value3에 1을 더해줌
		System.out.println(value1);					// 4, 위 코드의 결과 value1이 3+1이 됨
		
		int value3 = 3;
		int value4 = ++value3;
		System.out.println(value3);					// 4
		System.out.println(value4);					// 4, value3에 1을 더한 후, value3을 호출
		System.out.println(value3);					// 4, 위 코드의 결과 value3이 3+1이 됨
		
		int value5 = 3;
		int value6 = 4;
		int value7 = 2 + value5-- + ++value6;
		System.out.println(value7);					// 10, 2+3+5
		System.out.println(value5);					// 2
		System.out.println(value6);					// 5
		
	}
}
