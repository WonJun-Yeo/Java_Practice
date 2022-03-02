package aa.dd;
public class Variable {
	public static void main(String[] args) {
		int a = 3;				// 변수 a <== 정수         =은 같다라는 뜻이 아니라 오른쪽의 값을 왼쪽에 넣어라 라는 뜻
		String b = "화면";		// 변수 b <== 문자열		자바에서는 변수를 선언할 때 자료형을 먼저 선언해주어야한다
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		System.out.println(b + "출력");
		System.out.println(a + b + "출력");
		
		System.out.println("=====================");
		System.out.println();
		
		a = 10;
		b = "오늘";
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		System.out.println(b + "출력");
		System.out.println(a + b + "출력");
		
		a = 30;
		b = "10";
		
		
		System.out.println("==================================");
		// String에 값을 할당 할대 생성자를 통해 할당. 각각의 별도의 메모리 공간(heep 영역)을 가진다. 별도의 주소값을 가진다.
		String aa = new String("안녕");
		String bb = new String("안녕");
		
		System.out.println(aa);
		System.out.println(bb);
		
		if (aa == bb) {					// 두 변수의 메모리의 주소값을 비교 (aa, bb는 다른 메모리 주속를 갖는다.)
			System.out.println(true);	// 참조자료형에서 == 은 메모리 주소가 같냐고 물어보는 것이다. (기본 자료형에서는 값을 비교)
		} else {
			System.out.println(false);
		}
		
		if (aa.equals(bb)) {
			System.out.println(true);
		} else {						// 참조자료형에서 값을 비교하기 위해서는 aa.equals(bb) 처럼 equals 메소드를 사용해야한다.
			System.out.println(false);
		}
		System.out.println();
		
		// String에 값을 리터럴 값으로 바로 할당. 메모리 공간을 공유한다.
		
		String cc = "안녕";
		String dd = "안녕";
		
		System.out.println(cc);
		System.out.println(dd);
		
		if (cc == dd) {					// 두 변수의 메모리의 주소값을 비교 (aa, bb는 같은 메모리 주속를 갖는다.)
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if (cc.equals(dd)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
