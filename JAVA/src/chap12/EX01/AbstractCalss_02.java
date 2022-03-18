package chap12.EX01;

/* 추상 메소드를 사용하는 2번째 방법 : 자식 객체 생성없이 추상 클래스를 활용하는 방법
* 장점 : 자식 클래스 생성을 하지 않는다. 임시적으로 사용할 경우 유용
* 단점 : 여러 개의 객체를 생성해야할 경우 코드가 길어진다. 이때는 콘크리트 클래스를 만드는 방법으로 사용
*/


abstract class AAA {
	abstract void abc();						// 추상메소드
}



public class AbstractCalss_02 {

	public static void main(String[] args) {
		
		AAA aaa = new AAA() {					// 익명 객체를 활용한, 추상메소드를 콘크리트클래스 생성없이 구현
			void abc() {
				System.out.println("방법2번");
			}
		};
		
		aaa.abc();
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("방법2");
			}
		};
		
		aaa2.abc();
	}

}
