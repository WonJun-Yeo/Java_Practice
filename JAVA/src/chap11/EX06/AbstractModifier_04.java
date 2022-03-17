package chap11.EX06;

abstract class Animal {
	String name;
	int age;
	
	abstract void cry();
	abstract void run();
}

class Cat extends Animal {
	
	Cat (String name, int age) {
		super.name = name;
		super.age = age;
	}
	

	@Override
	void cry() {
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}

	@Override
	void run() {
		System.out.println("����̴� ȣ�ٴ� �ݴϴ�.");
		
	}
	
}

class Tiger extends Animal {
	Tiger (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println("ȣ���̴� �����ϰ� ��ϴ�.");
		
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� ��ŭ��ŭ �ݴϴ�.");
		
	}
	
}

class Eagle extends Animal {
	Eagle (String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println("�������� �����ϰ� ��ϴ�.");
		
	}

	@Override
	void run() {
		System.out.println("������ Ǫ��Ǫ�� ���ϴ�.");
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
