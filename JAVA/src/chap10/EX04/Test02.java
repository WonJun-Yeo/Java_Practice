package chap10.EX04;


class Animal3 {							// �θ� Ŭ����, ��� Ŭ������ Object Ŭ������ ����Ѵ�. extends Object�� �����Ǿ� �ִ�. �ڹ��� �ֻ����� �ִ� Ŭ������ Object Ŭ����
	String name;
	int age;
	
	void cry() {
		System.out.println("������ ��ϴ�.");
	}

	@Override
	public String toString() {			// �⺻������ ��ü�� �ּҸ� ���. [��Ű����.Ŭ������@��ü�޸��� �ؽ��ڵ�]
		// TODO Auto-generated method stub
		return "�̸��� : " + name + ", ���̴� : " + age + "�Դϴ�.";
	}
	
}


class Tiger3 extends Animal3 {
	
	Tiger3 (){}							// �⺻������ : �ʱⰪ�� �Ҵ����� �ʰ� �ʱ�ȭ(default ���� �Ҵ�ȴ�.), �ٸ� �����ڰ� ������ ��� ������־���Ѵ�.
	
	Tiger3 (String a, int b) {			// ������ : ��ü�� ���� ��, �޸��� �ʱⰪ�� �Ҵ��� �� ���
		super.name = a;					// super Ű����� �θ�Ŭ����(super class)�� ���Ѵ�. this Ű����� �ڽ��� ��ü�� ���Ѵ�.
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();					// super Ű����� �θ�Ŭ����(super class)�� ���Ѵ�. this Ű����� �ڽ��� ��ü�� ���Ѵ�.
		
		System.out.println("ȣ���̴� ���V�ϰ� ��ϴ�.");
	}
}

class Cat3 extends Animal3 {
	
	Cat3 (){}							// �⺻������ : �ʱⰪ�� �Ҵ����� �ʰ� �ʱ�ȭ(default ���� �Ҵ�ȴ�.), �ٸ� �����ڰ� ������ ��� ������־���Ѵ�.
	
	Cat3 (String a, int b) {			// ������ : ��ü�� ���� ��, �޸��� �ʱⰪ�� �Ҵ��� �� ���
		super.name = a;					// super Ű����� �θ�Ŭ����(super class)�� ���Ѵ�. this Ű����� �ڽ��� ��ü�� ���Ѵ�.
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();
		
		System.out.println("���̴� �߿��ϰ� ��ϴ�.");
	}
}

class Dog3 extends Animal3 {
	
	Dog3 (){}							// �⺻������ : �ʱⰪ�� �Ҵ����� �ʰ� �ʱ�ȭ(default ���� �Ҵ�ȴ�.), �ٸ� �����ڰ� ������ ��� ������־���Ѵ�.
	
	Dog3 (String a, int b) {			// ������ : ��ü�� ���� ��, �޸��� �ʱⰪ�� �Ҵ��� �� ���
		super.name = a;					// super Ű����� �θ�Ŭ����(super class)�� ���Ѵ�. this Ű����� �ڽ��� ��ü�� ���Ѵ�.
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();
		
		System.out.println("�������� �۸��ϰ� ��ϴ�.");
	}
}




public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal3 a3 = new Animal3();		// ��ü ����
		
		/*	��ü��ü�� ����� ���
		 * Object Ŭ������ toString()�޼ҵ尡 ȣ��ȴ�. a3.toString()
		 * Object.toString() : �⺻ ������ ��ü�� �ּҸ� ���
		 */
		System.out.println(a3);	
		System.out.println(a3.toString());
		
		System.out.println("=====================================");
		
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry();				// �θ��� cry() �޼ҵ带 ȣ�� �� ��� �������̵��� Tiger3�� cry()�� ȣ��
		c3.cry();				// �θ��� cry() �޼ҵ带 ȣ�� �� ��� �������̵��� Cat3�� cry()�� ȣ��
		d3.cry();				// �θ��� cry() �޼ҵ带 ȣ�� �� ��� �������̵��� Dog3�� cry()�� ȣ��

		System.out.println("=====================================");
		
		Animal3[] arr = {t3, c3, d3};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("=====================================");
		
		for (Animal3 k : arr) {
			k.cry();
		}
		
		System.out.println("=====================================");
		
		Animal3 tt3 = new Tiger3("ȣ����", 5);
		Animal3 cc3 = new Cat3("�����", 3);
		Animal3 dd3 = new Dog3("������", 10);
		
		System.out.println(tt3);					// ��ü ��ü�� ��� ��, Object Ŭ������ toString()�޼ҵ尡 ȣ��ȴ�. Object.toString() : �⺻ ������ ��ü�� �ּҸ� ���
		System.out.println(cc3);					// ��ü ��ü�� ��� ��, Object Ŭ������ toString()�޼ҵ尡 ȣ��ȴ�. Object.toString() : �⺻ ������ ��ü�� �ּҸ� ���
		System.out.println(dd3);					// ��ü ��ü�� ��� ��, Object Ŭ������ toString()�޼ҵ尡 ȣ��ȴ�. Object.toString() : �⺻ ������ ��ü�� �ּҸ� ���
		
		System.out.println("=====================================");
		
		Animal3[] arr2 = {tt3,cc3,dd3};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=====================================");
		
		for (Animal3 k : arr2) {
			System.out.println(k);
		}
		
	}

}
