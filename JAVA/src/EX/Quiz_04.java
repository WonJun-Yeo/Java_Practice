package EX;


class E extends Object {								// �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ� Ŭ�����̴�.
	String name;
	
	E(){}
	
	E(String name) {
		this.name =name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸� : " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name.equals(((E)obj).name)) {
			return true;
		} else {
			return false;
		}
	}
}

class Student1 {
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student1(int studentID, String name, int kor, int eng) {
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.studentID == ((Student1) obj).studentID) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return studentID + ", " + name + ", " + kor + ", " + eng;
	}
	
}




public class Quiz_04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1111, "ȫ�浿", 90, 80);
		Student1 s2 = new Student1(2222, "��⵿", 70, 85);
		Student1 s3 = new Student1(3333, "�ڼ���", 80, 90);
		Student1 s4 = new Student1(1111, "ȫ�浿", 90, 80);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("===============================");
		
		// studentID �� ���� ���, "���� �л��Դϴ�". ���
		
		System.out.println(s1.equals(s4));			// true	
		
		System.out.println();
		
		if (s1.equals(s4)) {
			System.out.println("���� �л��Դϴ�.");
		} else {
			System.out.println("�ٸ� �л��Դϴ�.");
		}
		
		System.out.println("===============================");
		
		E e1 = new E();
		System.out.println(e1.name);
		
		E e2 = new E("�����");
		System.out.println(e2.name);
		
		E e3 = new E("�����");
		
		System.out.println(e2 == e3);							// ���� Ÿ�� �����Ϳ��� ==�� ��ü�� �ּҸ� ��
		System.out.println(e2);									// Object Ŭ������ toString() �޼ҵ�� ��ü �ּҰ��� ��ȯ�Ѵ�.
		System.out.println(e3);
		
		System.out.println(e2.equals(e3));						// Object Ŭ������ equals() �޼ҵ�� == �� ���� ��ü�� �ּҸ� ��
		// �Ϲ������� Object Ŭ������ equals() �� toString() �޼ҵ�� �������̵�(������)�Ͽ� ����Ѵ�.
	}
}
