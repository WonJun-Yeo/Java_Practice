package chap12.EX01;

abstract class Abc {
	abstract void cry();					// �������̵�(������) 
	abstract void fly();					//
}

class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
	
	@Override
	void fly() {
		System.out.println("����̴� ���� ���մϴ�.");
	}
}

class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("�������� Ű���ϰ� ��ϴ�.");
	}
	
	@Override
	void fly() {
		System.out.println("�������� ������ �� �� �ֽ��ϴ�.");
	}
}


public class EX_AbstractClass {

	public static void main(String[] args) {
		// 1. �ڽ� Ŭ���� Cat,Eagle ���� ��, �������̵��ؼ� ���
		Abc abc1 = new Cat();
		Abc abc2 = new Eagle();
		
		abc1.cry();
		abc2.cry();
		System.out.println();
		
		abc1.fly();
		abc2.fly();
		
		System.out.println("========================");
		
		// 2. �͸� Ŭ���� ���� ��, ���
		
		Abc abc3 = new Abc() {
			@Override
			void cry() {
				System.out.println("����̴� �߿��ϰ� ��ϴ�.");
			}

			@Override
			void fly() {
				System.out.println("����̴� ���� ���մϴ�.");
			}
		};
		
		Abc abc4 = new Abc() {
			@Override
			void cry() {
				System.out.println("�������� Ű���ϰ� ��ϴ�.");
			}

			@Override
			void fly() {
				System.out.println("�������� ������ �� �� �ֽ��ϴ�.");
			}
		};
		
		abc3.cry();
		abc4.cry();
		System.out.println();
		
		abc3.fly();
		abc4.fly();
	}

}
