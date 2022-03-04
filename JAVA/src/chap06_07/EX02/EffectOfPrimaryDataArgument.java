package chap06_07.EX02;

public class EffectOfPrimaryDataArgument {
	
	int abc; 								// 필드 : Heep 영역에 저장, 객체화(인스턴스화)를 시켜야 사용가능
	
	
	static int twice (int a) {				// 정수를 받아서 * 2 한 값을 반환
		a = a* 2;
		return a;							// 메소드가 종효될때 RAM(메모리) stack에서 삭제된다.
	}
	
	public static void main(String[] args) {
		// 
		int result1 = twice(3);
		System.out.println(result1);
		System.out.println("===============");
		
		int a = 3;					// 지역변수, stack 공간에 변수와 값이 저장된다.
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);		// 
	}

}
