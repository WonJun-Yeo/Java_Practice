package chap11.EX04;

/*	�߻� Ŭ������ ������� �ʴ� ���
 * �ڽ�Ŭ�������� �޼ҵ� �������̵� ��, �������̵��� ��Ÿ�� ���� �߸� ������ �� �ִ�.
 */

class Animal {
	void cry() {}						// ������ cry() �޼ҵ带 �������ְ� ������ �������� ����
}

class Cat extends Animal {
	void cRy() {						// �������̵��� �ƴ� �ڽ�Ŭ������ ������ �޼ҵ�
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	void Cry() {						// �������̵��� �ƴ� �ڽ�Ŭ������ ������ �޼ҵ�
		System.out.println("�۸�");
	}
}

public class AbstactModifier_02 {

	public static void main(String[] args) {
		// 1. ��ü ����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		//2. �޼ҵ�ȣ��
		a1.cry();
		a2.cry();
	}

}
