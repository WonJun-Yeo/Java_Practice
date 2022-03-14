package chap10.EX04;

class Human {								// �θ� Ŭ����
	String name;							// �ν��Ͻ� �ʵ� : ��üȭ ���Ѿ� ����� �����ϴ�. �޸��� Heap������ ����
	int age;
	
	void eat() {							//�ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ����� �����ϴ�. �޸��� Heap������ pointer(�ּҰ�)�� �����ϰ�, Class���� ���� instance method ������ �޼ҵ��� �ڵ尡 ����
		System.out.println("����� ������ �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
}

class Student extends Human {
	int studentID;
	
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}

class Worker extends Human {
	int workerID;
	
	void goToCompany() {
		System.out.println("�������� ���忡 ���ϴ�.");
	}
}


public class Test01 {

	public static void main(String[] args) {


		Human h = new Human();
		h.name = "Ȧ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		
		Student s = new Student();
		
		s.name = "Ȧ�浿";
		s.age = 30;
		s.studentID = 543588;				// �ڽ�Ŭ���� �ʵ�
		
		s.eat();
		s.sleep();
		s.goToSchool();						// �ڽ�Ŭ���� �޼ҵ�
		
		
		Worker w = new Worker();
		
		w.name = "Ȧ�浿";
		w.age = 30;
		w.workerID = 543588;					// �ڽ�Ŭ���� �ʵ�
		
		w.eat();
		w.sleep();
		w.goToCompany();						// �ڽ�Ŭ���� �޼ҵ�
		
		
		Human h1 = new Student();				// ��ĳ���� : �θ� ������ Ÿ�Կ��� ���ٰ���
		h1.name = "Ȧ�浿";
		h1.age = 30;
		h1.eat();
		h1.sleep();
		
		
		// �ٿ�ĳ���� ��, ��Ÿ�� ���� ���� : instanceof �� ����Ͽ� ������Ÿ���� ������ �ִ��� Ȯ��, boolean ������ ��ȯ
		System.out.println(h1 instanceof Human);
		System.out.println(h1 instanceof Student);
		System.out.println(h1 instanceof Worker);
		
		Worker w4 = (Worker) h1;					// h1 Worker Ÿ���� ������, �����Ͽ����� �߻����� �ʴ´�. ��Ÿ�ӿ��� �߻�. �̸� �������� if ���� instanceof �� ����Ͽ� ������ �� �ٿ�ĳ����
		
		
		
		if (h1 instanceof Student) {
			Student s2 = (Student) h1;				// �ٿ�ĳ����
			
			s2.studentID = 12468465;
			s2.goToSchool();
		}
		
		
	}

}
