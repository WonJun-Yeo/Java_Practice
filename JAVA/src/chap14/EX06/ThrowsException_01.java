package chap14.EX06;

/*	예외처리 2가지 방법
 * 1. 직접처리 : try/catch
 * 2. 예외 전가(throws) : 메소드를 호출하는 쪽에서 예외를 처리하도록 전가 (미룬다)
 * 		** [s유무에 따라] throw : 강제로 예외를 발생시킨다.
 */

class A {														// 메서드내에서 직접 예외처리
	void abc() {
		bcd();
	}
	
	void bcd () {
		try {
			Thread.sleep(1000);									// 일반예외(checked exception) InterruptedException 발생
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("예외 발생 1");
		}
	}
}


class B {
	void abc() {
		try {
			bcd();												//  bcd() 메소드를 호출하였기때문에 bcd()메소드의 예외를 처리할 의무를 가진다.
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("예외 발생 2");
		}
	}
	
	void bcd () throws InterruptedException {					// bcd() 메소드를 호출하는 쪽에서 예외를 처리하도록 미룬다.
		Thread.sleep(1000);										// 일반예외(checked exception) InterruptedException 발생
	}
}


public class ThrowsException_01 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();
	}

}
