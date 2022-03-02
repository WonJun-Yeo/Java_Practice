package chap04;

public class For_EX03 {
	public static void main(String[] args) {
		// For문 기본작동

		int a; // 블락 밖에서 선언된 변수, 선언만 된 상태, 초기값 할당 되지 않음, 전역변수

		for (a = 0; a < 5; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("블락 밖에서 출력 : " + a);
		System.out.println("====================");

		for (int b = 0; b < 10; b++) { // for문 내에서 선언된 변수, 지역변수
			System.out.println(b);
		}
		System.out.println("====================");

		int c;

		for (c = 10; c > 0; c--) {
			System.out.println(c);
		}
		System.out.println("====================");

		// 2의 배수를 출력
		for (int i = 0; i < 100; i += 2) { // i+=2 ===> i = i + 2
			System.out.println(i);
		}
		System.out.println("====================");

		// for문 내에서 초기값과 증가값은 여러 변수를 할당할 수 있다.
		for (int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i + "*" + j + " : " + (i * j));
		}
		System.out.println("====================");

		// for문을 사용해서 1부터 10까지 * 값을 출력해 보세요. (1 * 2 * 3 * 4 *....10)
		int s = 1;
		for (int i = 1; i < 11; i++) {
			s *= i; // s = s * 1
		}
		System.out.println(s);
		System.out.println("====================");

		// for 문을 사용해서 1부터 100까지 +값을 출력해 보세요. (1 + 2 + 3 + 4 + ...100)
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i; // sum = sum + 1
		}
		System.out.println(sum);
		System.out.println("====================");

		// 이중 for 문 : 1단 ~ 9단까지 구구단 출력

		for (int f = 1; f < 10; f++) { // i : 단을 출력
			for (int g = 1; g < 10; g++) {
				System.out.println(f + " * " + g + " = " + f * g);
			}
				System.out.println("===========");
		}
		
		
		// for문에서 무한 루프 발생, 조건이 없을 경우
		
		/* 1번
		for (int i = 0;; i++) {
			System.out.print(i + "");
		}
		*/
		
		/* 2번
		for (;;) {
			System.out.println("무한루프");
		}
		*/
		
		// 무한루프 탈출
		
		for (int i = 0;; i++) {
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}
		
		// for문을 사용해서 1 ~ 1000 사이의 4의 배수만 더한 값 : 125500.0		평균값 : double : 502.0	
		// 내가 한 것
		double z = 0;
		int x;
		
		for (x = 0; x <= 1000; x += 4) {
			z += x;
		}
		
		System.out.println(z);
		System.out.println(x);
		System.out.println(z / ((x - 4) / 4));
		// 강사님 답
		double sum1 = 0;		// 더한 값을 저장하는 변수
		double j = 0;			// 4의 배수를 카운트하는 변수
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0) {	// 4의 배수만
				sum1 += i;		// sum = sum + i
				j++;
			}
		}
		
		System.out.println("합은 : " + sum1);
		System.out.println("평균은 :" + sum1 / j);
		
		
		
		
		
		
		
		
		
		
		
	}
}
