package chap12.EX02;

/*	interface 구현한 클래스
 * Overriding : 완전한 메소드를 새로 정의하는 것
 * Implements : 미완성 메소드를 완성시키는 것 (인터페이스 구현)
 * extents : 부모클래스의 기능을 상속받아 자신의 기능을 확장하는 것
 */

interface AA {
	void cry();					// 추상메소드 (미완성 메소드), interface의 추상메소드는 public abstract가 생략되어 있다.
	void run();
}


class BB implements AA {		// implements : 미완성 메소드를 구현한다.
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	@Override
	public void run() {
		System.out.println("펄쩍");
	}
}


public class Interface_02 {

	public static void main(String[] args) {
		
		// implement 한 클래스로 객체 생성
		AA aa = new BB();
		aa.cry();
		aa.run();

	}

}
