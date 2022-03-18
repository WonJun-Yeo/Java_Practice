package chap12.EX01;

abstract class Abc {
	abstract void cry();					// 오버라이드(재정의) 
	abstract void fly();					//
}

class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("고양이는 야옹하고 웁니다.");
	}
	
	@Override
	void fly() {
		System.out.println("고양이는 날지 못합니다.");
	}
}

class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("독수리는 키야하고 웁니다.");
	}
	
	@Override
	void fly() {
		System.out.println("독수릴는 빠르게 날 수 있습니다.");
	}
}


public class EX_AbstractClass {

	public static void main(String[] args) {
		// 1. 자식 클래스 Cat,Eagle 생성 후, 오버라이드해서 출력
		Abc abc1 = new Cat();
		Abc abc2 = new Eagle();
		
		abc1.cry();
		abc2.cry();
		System.out.println();
		
		abc1.fly();
		abc2.fly();
		
		System.out.println("========================");
		
		// 2. 익명 클래스 생성 후, 출력
		
		Abc abc3 = new Abc() {
			@Override
			void cry() {
				System.out.println("고양이는 야옹하고 웁니다.");
			}

			@Override
			void fly() {
				System.out.println("고양이는 날지 못합니다.");
			}
		};
		
		Abc abc4 = new Abc() {
			@Override
			void cry() {
				System.out.println("독수리는 키야하고 웁니다.");
			}

			@Override
			void fly() {
				System.out.println("독수릴는 빠르게 날 수 있습니다.");
			}
		};
		
		abc3.cry();
		abc4.cry();
		System.out.println();
		
		abc3.fly();
		abc4.fly();
	}

}
