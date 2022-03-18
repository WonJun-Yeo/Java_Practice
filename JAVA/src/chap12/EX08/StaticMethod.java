package chap12.EX08;

/* 인터페이스 내부에 static 키가 들어간 메소드
 * 자식에서 객체 생성없이 인터페이스명으로 바로 호출 가능
 * default 처럼 구현부가 존재한다.
 * java 1.8 (8 version) 에서 새롭게 추가된 기능
 * 
 */

/*	인터페이스(Interface) 내부 구성요소
 * 필드 : public static final		생략가능
 * 메소드 : public abstract		생략가능
 * 		  public default : 구현부가 있는 메소드 (java 1.8 이상)
 * 		  public static : 구련부가 있고, 객체 생성없이 호출이 가능한 메소드 (java 1.8 이상)
 */

interface A {
	static void abc() {
		System.out.println("A 인터페이스의 정적메소드 abc()");
	}
}




public class StaticMethod {

	public static void main(String[] args) {
		// static 메소드 호출
		A.abc();							// 객체 생성없이 인터페이스명으로 바로 호출
	}

}
