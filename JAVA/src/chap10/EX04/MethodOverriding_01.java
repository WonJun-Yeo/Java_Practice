package chap10.EX04;

// �޼ҵ� �������̵�

class Animal {
	void cry() {
	}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("�������?");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("������߷���!!!");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("(�� �ֱ׷�;;)");
	}
}

public class MethodOverriding_01 {

	public static void main(String[] args) {
		// 1. ������ Ÿ������ ��ü ���� �� ����
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();								// Animal Ŭ������ cry() �޼ҵ� ȣ��
		bb.cry();								// Bird Ŭ������ cry() �޼ҵ� ȣ��
		cc.cry();								// Cat Ŭ������ cry() �޼ҵ� ȣ��
		dd.cry();								// Dog Ŭ������ cry() �޼ҵ� ȣ��
		
		System.out.println("=================");
		
		// 2. Animal Ÿ������ ���� �� ����
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();								// Animal Ŭ������ cry() �޼ҵ� ȣ��, ������ Bird Ŭ�������� cry() �޼ҵ尡 �������̵��Ǿ��� ������ Bird Ŭ������ cry()�� ����Ǿ� Bird Ŭ������ cry()�� ��µȴ�. (�������ε�)
		ac.cry();								// Animal Ŭ������ cry() �޼ҵ� ȣ��, ������ Cat Ŭ�������� cry() �޼ҵ尡 �������̵��Ǿ��� ������ Cat Ŭ������ cry()�� ����Ǿ� Bird Ŭ������ cry()�� ��µȴ�. (�������ε�)
		ad.cry();								// Animal Ŭ������ cry() �޼ҵ� ȣ��, ������ Dog Ŭ�������� cry() �޼ҵ尡 �������̵��Ǿ��� ������ Dog Ŭ������ cry()�� ����Ǿ� Bird Ŭ������ cry()�� ��µȴ�. (�������ε�)
		
		System.out.println("=================");
		
		// 3. ��ü�� �迭�� ����
		Animal[] animal = {ab, ac, ad};
		//��üŸ��[] �迭�̸� = {��ü, ��ü, ��ü};
		
		for (Animal k : animal) {
			k.cry();
			System.out.println(k);
		}
		System.out.println();
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
			System.out.println(animal[i]);
		}
		
	}

}
