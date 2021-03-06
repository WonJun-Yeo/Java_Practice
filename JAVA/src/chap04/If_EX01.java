package chap04;
public class If_EX01 {
	public static void main(String[] args) {
		/* if문
		 * if (조건) {
		 * 	참인 조건 실행 코드;
		 * } 
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1 : 조건이 참일때 실행");
		}
		System.out.println("========================");
		
		/*
		 * if (조건) {
		 * 	참인 조건 실행 코드;
		 * } else {
		 * 	거짓인 조건 실행 코드;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		// 조건이 True 일 때 실행
		if (bool1) {
			System.out.println("실행2 : 조건이 참일때 실행");
		} else {
			System.out.println("실행3 : 조건이 거짓일때 실행");
		}
		
		// 조건이 False 일 때 실행
		if (bool2) {
			System.out.println("실행4 : 조건이 참일때 실행");
		} else {
			System.out.println("실행5 : 조건이 거짓일때 실행");
		}
		System.out.println("==========================");
		
		// if ~ else 문은 삼항 연산자로 변환이 가능
		System.out.println((bool1)? "실행7 : 참" : "실행8 : 거짓");
		System.out.println((bool2)? "실행9 : 참" : "실행10 : 거짓");
		System.out.println("==========================");
		/*
		 * if의 조건이 여러개 일 때
		 * if (조건1) {
		 * 	조건1이 참일 때 실행코드
		 * } else if (조건2) {
		 * 	조건1이 거짓이고 조건2가 참일 때 실행코드
		 * } else if (조건3) {
		 * 	조건1과 2가 거짓이고 조건3이 참일 때 실행코드
		 * } else {
		 * 	위의 조건이 모두 거짓일 때 실행코드
		 * } 
		 */
		
		int value2 = 85;
		
		if (value2 >= 90) {
			System.out.println("A 학점, 점수 : " + value2);
		} else if (value2 >= 80) {
			System.out.println("B 학점, 점수 : " + value2);			//실행 후 if 문을 빠져 나온다.
		} else if (value2 >= 70) {
			System.out.println("C 학점, 점수 : " + value2);
		} else {
			System.out.println("F 학점, 점수 : " + value2);
		}
		System.out.println("===========================");
		
		/*
		 * if 문에서 조건의 순서가 바뀌어 있을 경우
		 */
		
		value2 = 85;
		
		if (value2 >= 90) {
			System.out.println("A 학점, 점수 : " + value2);
		} else if (value2 >= 70) {
			System.out.println("C 학점, 점수 : " + value2);			//실행 후 if 문을 빠져 나온다.
		} else if (value2 >= 80) {
			System.out.println("B 학점, 점수 : " + value2);
		} else {
			System.out.println("F 학점, 점수 : " + value2);
		}
		System.out.println("===========================");
		
		/*
		 * 조건을 부여할 때 세밀하게 적용 (순서가 바뀌어도 제대로 적용)
		 */
		value2 = 85;
		if (value2 <=100 && value2 >= 90) {
			System.out.println("A학점입니다.");
		} else if (value2 <80 && value2 >= 70) {
			System.out.println("C학점입니다");
		} else if (value2 <90 && value2 >= 80) {
			System.out.println("B학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		System.out.println("===========================");
		
		/*
		 * if문에서 실행문이 하나일 때, 중괄호를 생략할 수 있다. (권장하지 않는다.)
		 */
		
		if (3 < 5)
			System.out.println("안녕1");
		
		if (3 > 5)
			System.out.println("안녕2");
			System.out.println("반갑");
	}
}
