package chap11.EX06;

abstract class Animal {										// �߻�Ŭ���� : �߻�޼ҵ带 �ϳ� �̻����� �����ϰ� �ִٸ� �ʼ������� �߻�Ŭ������ �Ǿ���Ѵ�.
	String name;
	int age;
	
	abstract void cry();									// �߻�޼ҵ� : �����ΰ� ���� �޼ҵ�
	abstract void run();									// �߻�޼ҵ� : �����ΰ� ���� �޼ҵ�
}

class Cat extends Animal {
	
	Cat (String name, int age) {
		super.name = name;
		super.age = age;
	}
	

	@Override
	void cry() {
		System.out.println(name + "�� �߿��ϰ� ��ϴ�.");
	}

	@Override
	void run() {
		System.out.println(name + "�� ���̴� " + age + "�Դϴ�.");
		
	}
	
}

class Tiger extends Animal {
	Tiger (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println(name + "�� �����ϰ� ��ϴ�.");
		
	}

	@Override
	void run() {
		System.out.println(name + "�� ���̴� " + age + "�Դϴ�.");
		
	}
	
}

class Eagle extends Animal {
	Eagle (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println(name + "�� �����ϰ� ��ϴ�.");
		
	}

	@Override
	void run() {
		System.out.println(name + "�� ���̴� " + age + "�Դϴ�.");
	}
	
}





public class AbstractModifier_04 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������", 15);
		
		
		// 1. Animal �迭 ��ü�� ����
		
		Animal[] arr = {a1, a2, a3};
		
		
		// 2. For���� ����Ͽ� ��ü�� ��� (�̸��� ���� ���, cry & run method)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
			arr[i].run();
		}
		
		System.out.println("=================");
		
		
		// 3. Enhanced For�� ����Ͽ� ��ü�� ���
		
		for (Animal k : arr) {
			k.cry();
			k.run();
		}
		
	}

}
