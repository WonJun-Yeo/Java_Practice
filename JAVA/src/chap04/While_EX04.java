package chap04;
public class While_EX04 {
	public static void main(String[] args) {
		// 1. while문의 기본 문법
		int a = 0;				// 초기값
		while (a < 10) {		// 조건
			System.out.println(a);
			a++;				// 증감
		}
		System.out.println();
		
		int b = 10;
		while (b > 0) {
			System.out.println(b);
			b--;
		}
		System.out.println("==================");
		
		// 2. while문을 for문으로 변환
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("==================");
		
		// 3. while문의 무한루프
		
//		while (true) {								// 초기값과 증감값이 업고 조건이 항상 true이기 때문
//			System.out.println("while의 무한루프");
//		}
//		System.out.println("===================");
		
		// 4. while문의 무한루프 중지
		
//		int c = 0;
//		while (true) {
//			if (c > 100) {
//				break;
//			}
//			System.out.println(c);
//			c++;
//		}
		
		
		
	}
}
