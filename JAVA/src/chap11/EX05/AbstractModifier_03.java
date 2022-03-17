package chap11.EX05;

// �߻�Ŭ������ ����ؼ� ��� �����ϴ� ���

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	@Override
	void cry() {									// ��Ÿ�� �����, ������ ����.
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("�۸�");
	}
	
}

public class AbstractModifier_03 {

	public static void main(String[] args) {
		
		// Animal a0 = new Animal();				// �߻�Ŭ������ ��üȭ �� �� ����.
		
		Animal a1 = new Cat();						// �߻�Ŭ������ Ÿ�����δ� ������ �� �ִ�.
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();

	}

}
