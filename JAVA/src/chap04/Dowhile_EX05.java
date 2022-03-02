package chap04;
public class Dowhile_EX05 {
	public static void main(String[] args) {
		
		// 1. while문과 do while문 비교 : 실행이 0인 경우
		
		int a = 0;
		while(a < 0) {
			System.out.println(a);			// 조건이 true 일대만 실행됨
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a);			// do while문에서 무조건 1번은 실행됨
			a++;
		} while (a < 0);		// 조건이 false
		System.out.println("===============");
		
		// 2. while문과 do while문 비교 : 실행이 1인 경우
		
		a = 0;
		while (a < 1) {
			System.out.println(a);
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a < 1);
		System.out.println("===============");
		
		
		// 3. while문과 do while문 비교 : 실행이 10인 경우
		a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a <10);
		
	}
}
