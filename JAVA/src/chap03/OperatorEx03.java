package chap03;
public class OperatorEx03 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자 (&&, ||, ^, !) 	: 쇼트 서킷이 발생된다. (쇼트 서킷 : 앞부분의 연산 결과를 인지할 수 있을때, 뒷부분은 연산을 생략)
		 * 비트 연산자 (&, |, ^)		: 쇼트 서킷이 발생되지 않는다.
		 */
		
		// 1. 논리 연산자 AND (&&) : 두 항이 모두 true 일 때, 결과가 true
		
		System.out.println(true && true);		// 쇼트서킷이 발생되지 않는다.
		System.out.println(true && false);		// 쇼트서킷이 발생되지 않는다.
		System.out.println(false && true);		// 쇼트서킷이 발생된다. (앞부분이 false이고 &&이기 때문에 뒤를 안봐도 결과는 false)
		System.out.println(true && (5 < 3));		// 쇼트서킷이 발생되지 않는다.
		System.out.println((5 <= 5) && (7 > 2));	// 쇼트서킷이 발생되지 않는다.
		System.out.println((3 < 2) && (8 < 10));	// 쇼트서킷이 발생된다.
		System.out.println("===================");
		
		// 2. 논리 연산자 OR (||) : 두 항중 하나만 true 이면 결과가 true
		
		System.out.println(true || true);		// 쇼트서킷이 발생된다.
		System.out.println(false || (5 < 3));		// 쇼트서킷이 발생되지 않는다.
		System.out.println("===================");
		
		
		
		// 3. 논리 연산자 XOR (^) : 두값이 같을 때 false, 두값이 다를 때 true 
		System.out.println( true ^ true);
		System.out.println( false ^ false);
		System.out.println( true ^ false);
		System.out.println( false ^ true);
		System.out.println((5<=5) ^ (7>2));
		System.out.println("===================");
		
		// 4. 논리 연산자 NOT (!) : true 이면 false, false 이면 true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3));
		System.out.println("===================");
		
		// 숏 서킷을 사용 여부 (논리연산자일때 발생, 비트연산자일때는 발생되지 않음)
		int value2 = 3;
		System.out.println(false && ++value2 > 6);		// 쇼트서킷이 발생된다.
		System.out.println(value2);						// 쇼트서킷 발생으로 ++value2 계산이 실행되지 않아 3으로 출력
		
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6);		// 비트연산자이기때문에 쇼트서킷이 발생되지 않는다.
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6);		// 쇼트서킷이 발생된다.
		System.out.println(value4);						// 쇼트서킷 발생으로 ++value3 계산이 실행되지 않아 3으로 출력
		
		int value5 = 3;
		System.out.println(true | ++value5 > 6);		// 비트연산자이기때문에 쇼트서킷이 발생되지 않는다.
		System.out.println(value5);
		
		
		
	}
}
