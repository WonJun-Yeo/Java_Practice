package chap06_07.EX02;


class Abc {
	int m = 3;							// 필드, Heep에 핃르명과 값 저장, 객체화(인스턴스화) 이후 사용이 가능하다.
	int n = 4;
	
	void work1() {						// 인풋값이 없는 메소드
		int k = 5;						// 지역변수, stack에 변수명과 값 저장, 메소드 밖에서 사용이 불가능하다.
		System.out.println(k);
		work2(3);						// 다른 메소드 호출
	}
	
	void work2(int i) {
		int j = 4;						// 지역변수, stack에 변수명과 값저장, 메소드 밖에서 사용이 불가능하다.
		System.out.println(i + j);
		
		int l;							// 지역변수이므로 강제초기화(default 값 할당)이 되지 않는다.
		l = 0;							// 반드시 할당해주어야 한다.
		System.out.println(l);
	}
}


public class FieldComponent {

	public static void main(String[] args) {
		Abc abc = new Abc();			// abc 객체 생성
		
		// 필드 호출
		System.out.println(abc.m);
		System.out.println(abc.n);

		// 메소드 호출
		abc.work1();
	}

}
