package chap06_07.EX04;

//Aaa 클래스는 하위의 여러개의 생성자를 사용할 경우, this() 메소드없이 사용한 경우 : 중복된 값을 매번 입력

class Aaa {									
	int m1, m2, m3, m4;						// 필드 4개 선언
	
	Aaa(){									// 매개변수가 없는 기본생성자
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4; 
	}

	Aaa(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4; 
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}


//Bbb 클래스는 하위의 여러개의 생성자를 사용할 경우, this() 메소드를 사용한 경우 : 중복된 값을 제거

class Bbb {
	int m1, m2, m3, m4;
	
	Bbb(){								// 초기값 할당
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Bbb(int a) {
		this();							// 인풋값이 없는 생성자 호출
		m1 = a;
	}
	
	Bbb (int a, int b) {
		this(a);						// 매개변수 1개인 생성자 호출
		m2 = b;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}




public class ThisMethod_02 {
	public static void main(String[] args) {
		// 1. 세 가지 객체 생성 (this 미사용)
		Aaa aaa1 = new Aaa();
		Aaa aaa2 = new Aaa(10);
		Aaa aaa3 = new Aaa(10, 20);
		
		aaa1.print();
		System.out.println();
		
		aaa2.print();
		System.out.println();
		
		aaa3.print();
		System.out.println("================");
		
		// 2. 세 가지 객체 생성 (this 사용)
		Bbb bbb1 = new Bbb();
		Bbb bbb2 = new Bbb(10);
		Bbb bbb3 = new Bbb(10, 20);
		
		bbb1.print();
		System.out.println();
		
		bbb2.print();
		System.out.println();
		
		bbb3.print();
	}
}
