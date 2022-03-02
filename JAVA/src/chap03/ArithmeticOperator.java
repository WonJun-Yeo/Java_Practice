package chap03;
public class ArithmeticOperator {
	public static void main(String[] args) {
		//
		
		int a = 3;
		++a;					// ++a 는 a의 할당값에 1을 더한다.
		System.out.println(a);
		
		int b = 3;
		b++;
		System.out.println(b);
		
		System.out.println("=====================");
		
		
		// ++a1, a2++ 는 변수명 부분과 ++부분을 순서대로 시행한다고 생각하면 편함
		// ++a1의 경우 a1에 먼저 더하고 b1에 할당되기 때문에 더해진 값,
		// a2++의 경우 a2를 b2에 먼저 할당하고 a2에 더하기 때문에 더해지기 전 값
		
		
		int a1 = 3;
		int b1 = ++a1;				// a1의 값을 1증가시키고 --> b1에 할당
		System.out.println(a1);		//4
		System.out.println(b1);		//4
		
		int a2 = 3;
		int b2 = a2++;				// b2에 할당시키고 --> a2의 값을 1증가
		System.out.println(a2);
		System.out.println(b2);
		
		System.out.println("=====================");
		
		// 산술 연산자
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(7 * 2);
		System.out.println(7 / 2);		// 몫만 가져 올때는 int 형으로 가져오면 된다.
		System.out.println(8 % 5);		// 나눈 나머지 값만 출력
		
		System.out.println("2" + "3");	// + 는 두 문자열을 연결하는 연산자
		
		// 증감 연산자 (case1)
		int value1 = 3;
		value1++ ;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
		System.out.println("=======================");
		
		// 증감 연산자 (case2)
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3);
		System.out.println(value4);
		
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		
		// 증감 연산자 (case3)
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("=========================");
		
		
		int value10 = 9;
		System.out.println(++value10);
		System.out.println(value10++);
	}
}
