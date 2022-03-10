package chap10.EX01;


// ��ĳ���ð� �ٿ�ĳ������ �ݵ�� ����� ����Ǿ� �־���Ѵ�.



// �ƿ��� Ŭ����
class Tiger extends Animal {
	int tiger;
	
	void tigerEat() {
		System.out.println("ȣ���̴� ���ļ��Դϴ�.");
	}
}

class Dog extends Animal {
	int dog;
	void dogEat() {
		System.out.println("�������� ��ļ��Դϴ�.");
	}
}

class Dog_sub extends Dog {
	int dog_sub;
	
	void dog_sub() {
		System.out.println("Dog�� �ڽ� Ŭ�����Դϴ�.");
	}
}

class Panda extends Animal {
	int panda;
	void pandaEat() {
		System.out.println("�Ǵٴ� �ʽļ��Դϴ�.");
	}
}


public class Animal {
	
	String name;				// ���� �̸�
	int age;					// ���� ����
	String color;				// ���� ����
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		/*	��ĳ���� : �ڽ�Ÿ���� ������ Ÿ�Կ��� �θ� ������ Ÿ������ ��ȯ, �θ�Ÿ���� �ʵ�� �޼ҵ常 ���� ����
		 * ��ĳ������ ���� Ÿ�Ժ�ȯ ���� �ڵ����� ��ĳ���� �ȴ�.
		 * ��ĳ������ ���������� ó���ϱ� ������ ȿ�������� ���α׷����� ó���� �� �ִ�.
		 * ������ : �������̵�(���)�� �̿��� ��ӿ��� �ϳ��� �޼ҵ�� ���� ������ ó���� �� �ִ�.
		 */
		
		
		// Animal <- Dog <- Dog_sub
		
		
		// 1. Animal Ŭ���� ��üȭ
		Animal a1 = new Animal();				// �ڽ��� �ʵ�� �޼ҵ常 ����
		
		// 2. Dog Ŭ������ Dog Ÿ������ ��üȭ
		Dog d1 = new Dog();						// Animal�� Dog�� �ʵ�� �޼ҵ忡 ����
		
		// 3. Dog Ŭ������ Animal Ÿ������ ��ĳ����
		Animal a2 = new Dog();					// Animal, DogŸ���� �����͸� ��� �����ϰ� ������, Animal Ŭ������ �ʵ�� �޼ҵ忡�� ����
		
		// 4. Dog_sub Ŭ������ Animal Ÿ������ ��ĳ����
		Animal a3 = new Dog_sub();				// Animal, Dog, Dog_sub Ÿ���� �����͸� ��� �����ϰ� ������, Animal Ŭ������ �ʵ�� �޼ҵ忡�� ����
		
		a3.name = "ġ�Ϳ�";	// Animal Ŭ������ �ʵ�
		//a3.dog			// ���ٺҰ�
		
		// 5. Dog_sub Ŭ������ Dog Ÿ������ ��ĳ����
		Dog d2 = new Dog_sub();					// Animal, Dog, Dog_sub Ÿ���� �����͸� ��� �����ϰ� ������, Animal, Dog Ŭ������ �ʵ�� �޼ҵ忡�� ����
		
		d2.name = "����Ʈ";	// Animal Ŭ������ �ʵ�
		d2.dog = 3;			// Dog Ŭ������ �ʵ�
		//d2.dog_sub		// ���ٺҰ�
		
		// 6. Dog_sub Ŭ������ Dog_sub Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();			// Animal, Dog, Dog_sub Ÿ���� �����͸� ��� �����ϰ� ��� �ʵ�� �޼ҵ忡 ����
		
		ds1.name = "������";	// Animal Ŭ������ �ʵ�
		ds1.age = 4;		// Animal Ŭ������ �ʵ�
		ds1.dog = 4;		// Dog Ŭ������ �ʵ�
		ds1.dog_sub = 4;	// Dog_sub Ŭ������ �ʵ�
		
		
		
		/*	�ٿ�ĳ���� : �θ� ������ Ÿ���� �ڽ� ������ Ÿ������ ��ȯ
		 * �ٿ� ĳ������ ������ Ÿ���� ��ȯ���־�� �Ѵ�.
		 * ds1�� Dog_sub�� ������ Ÿ���� ������ �ִ�. (Animal, Dog, Dog_sub Ŭ������ ��� �ʵ�, �޼ҵ忡 ���ٰ���)
		 */
		
		Dog ds1_c1 = ds1;		// Dog_sub ������ Ÿ�Կ��� Dog ������ Ÿ������ ��ĳ���� (Animal, Dog Ŭ������ �ʵ�� �޼ҵ� ���ٰ���)
			Dog ds2_c1 = (Dog) ds1;		// ��ĳ������ (Dog) ��� ������Ÿ���� ������ �� ������, �ڵ����� �´� Ÿ������ ��ȯ�� �ȴ�.
		Animal ds1_c2 = ds1;	// Dog_sub ������ Ÿ�Կ��� Animal ������ Ÿ������ ���ɽ��� (Animal Ŭ������ �ʵ�� �޼ҵ� ���ٰ���)
		
		
		
		// a3 �� Animal, Dog, Dot_sub �� Animal Ÿ�Կ��� ������ �� �ֵ��� ��ĳ������ �Ǿ� �ִ�.
		
		Dog a3_down1 = (Dog) a3;		// Animal ������ Ÿ�Կ��� Dog ������ Ÿ������ �ٿ�ĳ���� (Animal, Dog Ŭ������ �ʵ�� �޼ҵ� ���ٰ���)
		a3_down1.dog = 4;
		
		Dog_sub a3_down2 = (Dog_sub) a3;	// Animal ������ Ÿ�Կ��� Dog_sub ������ Ÿ������ �ٿ�ĳ���� (Animal, Dog, Dog_sub Ŭ������ �ʵ�� �޼ҵ� ���ٰ���)
		a3_down2.dog_sub = 3;
		
		
		
		
	}
}
