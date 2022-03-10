package chap10.EX01;


/* ��� : �θ� Ŭ������ �ʵ�, �޼ҵ�, ����Ŭ������ �ڽ�Ŭ�������� ���
 * ����� ����
 * 1. �ߺ��� �ڵ��� ���� (�ڵ��� ����)
 * 2. ������ �ڵ� (������)
 * 3. ������ (�޼ҵ� �������̵�, �ϳ��� �޼ҵ������ ���� �������� ���)
 */

/* ��Ӵ��̾�׷��� ǥ���� �� �θ� Ŭ���� ������ ȭ��ǥ�� �ִ�.
 * UML(Unified Modeling language) : �ý����� �𵨷� ǥ�����ִ� ��ǥ���� �𵨸�
 */


/* Student_sub�� Student�� �ʵ�� �޼ҵ带 ��� �޴´�. 
 * Student�� Person�� �ʵ�� �޼ҵ带 ��ӹ޴´�.
 * ����, Student_sub�� Person�� �ʵ�� �޼ҵ嵵 ��� �޴´�.
 */
class Student_sub extends Student {
	
	int weight;
	
	void sub1() {
		System.out.println("Student_sub1 Ŭ���� �Դϴ�. �θ��� �ʵ�� �޼Ҹ� �÷� �޴´�");
	}
	
}






//���л� Ŭ����
class Student extends Person {						// Person : �θ�Ŭ����, Student : �ڽ�Ŭ����
													// �ڽ�Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��ӹ޴´�.
	int studentID;
	void goToSchool() {
		System.out.println("�ڽ� Ŭ���� Student�� goToSchool() �޼ҵ�");
	}
}

//������ Ŭ����
class Worker extends Person {						// Person : �θ�Ŭ����, Worker : �ڽ�Ŭ����
													// �ڽ�Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��ӹ޴´�.	
	int workerID;
	void goToWork() {
		System.out.println("�ڽ� Ŭ���� worker�� goToWork() �޼ҵ�");
	}
}


public class Person {
	
	String name;
	int age;
	
	void eat() {
		System.out.println("�θ� Ŭ������ eat() �޼ҵ�");
	}
	
	
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ�");
	}

	public static void main(String[] args) {
	
		// 1. Person ��ü ����
		
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 20;
		p.eat();
		p.sleep();
		
		System.out.println("============================");
		
		
		// 2. Student ��ü ����
		
		Student s = new Student();				// Person Ŭ������ ���, Person Ŭ������ �ʵ�� �޼ҵ带 ����� �� �ִ�.
		
		// Person Ŭ�������� ��ӵ� �ʵ�
		s.name = "�̼���";
		s.age = 50;
		
		// Student �ɷ����� �ʵ�
		
		s.studentID = 123123456;
		
		// Person Ŭ�������� ��ӵ� �޼ҵ�
		
		s.eat();
		s.sleep();
		
		// Student Ŭ������ �޼ҵ�
		
		s.goToSchool();
		
		System.out.println("============================");
		
		
		// 3. Worker ��ü ����
		
		Worker w = new Worker();				// Person Ŭ������ ���, Person Ŭ������ �ʵ�� �޼ҵ带 ����� �� �ִ�.
		
		// Person Ŭ�������� ��ӵ� �ʵ�
		w.name = "�̼���";
		w.age = 50;
		
		// Worker �ɷ����� �ʵ�
		
		w.workerID = 456789123;
		
		// Person Ŭ�������� ��ӵ� �޼ҵ�
		
		w.eat();
		w.sleep();
		
		// Worker Ŭ������ �޼ҵ�
		
		w.goToWork();
		
		System.out.println("============================");
		
		
		// ��ü ������ Ÿ�� ��ȯ
		
		Person p1 = new Person();				// Person()�� Person�̴�.
		
		Person ps = new Student();				// ��ĳ����, Student�� Person�̴�. ����
		// Student sp = new Person();			// �ٿ�ĳ����, Person�� Student�̴�. ����X
		
		Person pw = new Worker();				// ��ĳ����, Worker�� Person�̴�. ����
		// Worker = new Person();				// �ٿ�ĳ����, Person�� Worker�̴�. ����X
		
		System.out.println("============================");
		
		
		// Person <- Student <- Student_sub
		
		
		Student_sub sub1 = new Student_sub();
		
		// Person Ŭ������ �ʵ�
		sub1.name = "�Ż��Ӵ�";
		sub1.age = 50;
		
		// Student Ŭ������ �ʵ�
		sub1.studentID = 741852963;
		
		// Student_sub Ŭ������ �ʵ�
		sub1.weight = 55;
		
		// Person Ŭ������ �޼ҵ�
		sub1.eat();
		sub1.sleep();
		
		// Student Ŭ������ �޼ҵ�
		sub1.goToSchool();
		
		// Student_suv Ŭ������ �޼ҵ�
		sub1.sub1();
		
		System.out.println("============================");
		
		
		/*	Student_sub�� �θ� Ŭ���� Ÿ������ ��ĳ���� (�ڵ����� ��ȯ)
		 * Ŭ����Ÿ��(Type) ��ü�� = new �ڽ�Ŭ����������();
		 * �θ� Ŭ������ ���(�ʵ�, �޼ҵ�)�� ��밡��
		 */
		Person ps1 = new Student_sub();					// ��ĳ���� : Student_sub ��ü�� ���� ��, Person Ŭ���� ������ Ÿ������ ����ȯ
														// Person Ŭ���� ����� ��밡��
		ps1.name = "BTS";
		ps1.age = 30;
		ps1.eat();
		ps1.sleep();
		
		System.out.println();
		
		Student ss1 = new Student_sub();				// ��ĳ���� : Student_sub ��ü�� ���� ��, Student Ŭ���� ������ Ÿ������ ����ȯ
														// Person, Student Ŭ���� ��� ��밡��
		ss1.name = "SES";
		ss1.age = 30;
		ss1.eat();
		ss1.sleep();
		
		ss1.studentID = 987654321;
		ss1.goToSchool();
		
		System.out.println();
		
		Student_sub ss2 = new Student_sub();
														// Person, Student, Student_sub Ŭ���� ��� ��밡��
		ss2.name = "�����������ܿ�";
		ss2.age = 40;
		ss2.eat();
		ss2.sleep();
		
		ss2.studentID =159487263;
		ss2.goToSchool();
		
		ss2.weight = 60;
		ss2.sub1();
		
		System.out.println("============================");
		
		/* ��� ���迡�� ��ü ���� ��, �θ� ������ Ÿ������ ��ĳ���� ����
		 * ��� ������ Ÿ���� ������ ������ ��밡���� �κ��� �����ϴ� ��
		 * �θ� ������ Ÿ������ ��ĳ���� �� ���, �θ��� �ʵ�� �޼ҵ常 ��밡��
		 * Person <- Student <- Student_sub
		 */
		
		Person ps4 = new Student_sub();					
		/* Student_sub ��ü ���� ��, Person Ÿ������ ��ĳ����
		 * Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
		 * ���߿��� Person Ŭ������ �ʵ�� �޼ҵ常 ���� ����
		 */
		
		Student ss4 = new Student_sub();	
		/* Student_sub ��ü ���� ��, Student Ÿ������ ��ĳ����
		 * Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
		 * ���߿��� Person, Student Ŭ������ �ʵ�� �޼ҵ常 ���� ����
		 */
		
		Student_sub ss5 = new Student_sub();
		/* Student_sub ��ü ���� ��, Student Ÿ������ ��ĳ����
		 * Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
		 * ���߿��� Person, Student, Student_sub Ŭ������ �ʵ�� �޼ҵ� ��� ���� ����
		 * ��ĳ������ �ƴϴ�. �׳� ��ü ����
		 */
		
		System.out.println("============================");
		
		/*	�ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���� �Ȱ��� �ڽ� ������ Ÿ������ ��ȯ (�������� ��ȯ)
		 * 
		 */
		
		Student ps5 = (Student) ps4;						
		/* Person ������Ÿ���� ps4�� Student ������ Ÿ���� ps5���� �ٿ�ĳ����
		 * Person, Student�� �ʵ�� �޼ҵ� ���� ����
		 */
		
		ps5.name = "�ٿ�ĳ����";
		ps5.age = 30;
		ps5.eat();
		ps5.sleep();
		
		ps5.studentID = 326159487;
		ps5.goToSchool();
		
		System.out.println();
		
		Student_sub ps6;
		ps6 = (Student_sub) ps4;						
		/* Person ������Ÿ���� ps4�� Student_sub ������ Ÿ���� ps6�� �ٿ�ĳ����
		 * Person, Student, Student_sub�� �ʵ�� �޼ҵ� ��� ���� ����
		 */
		
		ps6.name = "�ٿ�ĳ����2";
		ps6.age = 40;
		ps6.eat();
		ps6.sleep();
		
		ps6.studentID = 159487326;
		ps6.goToSchool();
		
		ps6.weight = 60;
		ps6.sub1();
		
		
		
		
	}

}


