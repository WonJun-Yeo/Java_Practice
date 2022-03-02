package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		/*
		 * 대입 연산자 ( =, +=, -=, *=. /=, >>=, <<=, >>>= )
		 * 수식에서 우선순위가 가장 낮다.
		 * a = b;		b 변수의 값을 a 변수에 할당해라는 의미
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
		
		
		int value2;			// 기본자료형인 경우 변수의 값을 할당 하지않았을 경우, 기본값으로 0이 할당.
		value2 = 5;			// 참조자료형일 경우 변수의 값을 할당 하지않았을 경우, 기본값으로 NULL 
		// 축약 표현
		System.out.println(value2 += 2);		// value2 = value2 + 2
		System.out.println(value2 -= 2);		// value2 = value2 - 2
		System.out.println(value2 /= 2);		// value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);		// value2 = value2 | 2, 2진법으로 바꿔 각 비트를 계산
		value2 = 5; System.out.println(value2 &= 2);		// value2 = value2 & 2, 2진법으로 바꿔 각 비트를 계산
		System.out.println("======================");
		
		// 산술쉬프트 (<<, >>) : 부호비트빼고 이동
		value2 = 5; System.out.println(value2 <<= 2);		// value2 = value2 << 2, 2진법으로 바꿔 왼쪽으로 2비트 옮겨 계산
		value2 = 5; System.out.println(value2 >>= 2);		// value2 = value2 >> 2, 2진법으로 바꿔 오른쪽으로 2비트 옮겨 계산, 이때 범위벗어난건 짤림
		System.out.println("======================");
		
		// 논리 쉬프트 (>>>) : 부호비트까지 이동
		value2 = 5; System.out.println(value2 >>>= 2);		// value2 = value2 >>> 2
		
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);	// 
		
		
		
		
		
		
	}
}
