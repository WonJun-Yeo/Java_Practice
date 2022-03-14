package EX;

/*	Java�� ���� ����� �Ұ����ϴ�.
 * �θ� class�� �Ѱ��� �����ϴ�.
 * Java�� ��� class�� Object�� �ڽ� class�̴�.
 * Object class���� ������ �ʵ峪 method�� ������(Overriding)�Ͽ� ��� �� �� �ִ�.
 */

class Student {
	String name;					// �л��̸�
	int studentID;					// �й�
	int kor;						// ��������
	int eng;						// ��������
	int math;						// ��������
	int sum;						// ���� ��
	double avg;						// ���� ���
	
	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸� : " + name + ", �й� : " + studentID + ", ���� : " + kor + ", ���� : " + eng + ", ���� : " + math + ", �հ� : " + sum + ", ��� : " + avg;
	}
	
}

class S_ö�� extends Student {

	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �丮�Դϴ�.");
	}
	
	S_ö��(String a, int b, int c, int d, int e) {
		name = a;
		studentID = b;
		kor = c;
		eng = d;
		math = e;
		sum = c + d + e;
		avg = (double) sum / 3;
	}
	
}

class S_���� extends Student {
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� ��Դϴ�.");
	}
	
	S_����(String a, int b, int c, int d, int e) {
		name = a;
		studentID = b;
		kor = c;
		eng = d;
		math = e;
		sum = c + d + e;
		avg = (double) sum / 3;
	}
}

class S_���� extends Student {
	@Override
	void hobby() {
		System.out.println("������ ��̴� �����Դϴ�.");
	}
	
	S_����(String a, int b, int c, int d, int e) {
		name = a;
		studentID = b;
		kor = c;
		eng = d;
		math = e;
		sum = c + d + e;
		avg = (double) sum / 3;
	}
}

public class Quiz_03 {

	public static void main(String[] args) {
		
		Student ö�� = new S_ö��("ö��", 001, 70, 80, 90);
		Student ���� = new S_����("����", 002, 80, 95, 75);
		Student ���� = new S_����("����", 003, 75, 65, 90);
		
		System.out.println(ö��);
		ö��.hobby();
		System.out.println(����);
		����.hobby();
		System.out.println(����);
		����.hobby();
		
		System.out.println("===============================================");
		
		Student[] arr = {ö��, ����, ����};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("===============================================");
		
		for (Student k : arr) {
			System.out.println(k);
			k.hobby();
		}
	}
}
