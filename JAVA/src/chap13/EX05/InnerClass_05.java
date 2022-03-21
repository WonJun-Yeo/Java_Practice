package chap13.EX05;

/*	지역이너클래스 : 메소드 내부에 선언된 클래스
 * 지역이너클래스의 컴파일 이후 생성 클래스 파일
 * 
 * 
 */

class A {														// A.class
	void abc () {
		class B{}												// A$1B.class
		class C{}												// A$1C.class
	}
	
	void bcd() {
		class C{}												// A$2C.class, 동일한 이름의 클래스가 존재할 경우, 메소드 숫자로 순서가 부여된다.
		class D{}												// A$1D.class
	}
	
	void cde() {
		class B{}												// A$2B.class
		class C{}												// A$3C.class
	}
	
	
}





public class InnerClass_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
