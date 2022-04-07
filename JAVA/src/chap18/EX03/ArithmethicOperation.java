package chap18.EX03;

import java.util.Scanner;

/* 1. Scanner 사용해서 double의 두 수를 인풋받고
 * 2. 방법
 * 		1. 람다식을 사용해서 인풋 받은 두 값을 사칙연산(+, -, *, /) 구현 후 출력
 * 		2. 인터페이스를 구현한 자식 객체를 사용해서 인풋 받은 값을 사칙연산
 * 		3. 익명이너 클래스를 이용해 인터페이스를 구현해 인풋받은 값을 사칙연산
 * 3. ArithmeticException 처리 : 0으로 나누면 예외 발생
 */


@FunctionalInterface
interface Arithmethic {
	void arithmethicOpr(double p, double q);
}


class A implements Arithmethic {
	
	
	public void arithmethicOpr(double p, double q) {
		System.out.println("합 : " + (p+q) + ", 차 : " + (p-q) + ", 곱 : " + (p*q) + ", 나누기 : " + (p/q));
	};
}


public class ArithmethicOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산을 위한 첫 번째 값을 입력해 주세요.");
		double a = sc.nextDouble();

		System.out.println("사칙연산을 위한 두 번째 값을 입력해 주세요.");
		double b = sc.nextDouble();
		
		
		// 방법 1
		Arithmethic ari = (p, q) -> System.out.println("합 : " + (p+q) + ", 차 : " + (p-q) + ", 곱 : " + (p*q) + ", 나누기 : " + (p/q));
		ari.arithmethicOpr(a, b);
		
		System.out.println("================================");
		
		// 방법 2
		
		Arithmethic ari2 = new A();
		
		ari2.arithmethicOpr(a, b);
		

		
		System.out.println("================================");
		
		// 방법 3
		
		Arithmethic ari3 = new Arithmethic() {
			public void arithmethicOpr(double p, double q) {
				System.out.println("합 : " + (p+q) + ", 차 : " + (p-q) + ", 곱 : " + (p*q) + ", 나누기 : " + (p/q));
			};
		};
		
		ari3.arithmethicOpr(a, b);
		
		sc.close();
	}

}
