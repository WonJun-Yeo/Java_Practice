package chap14.EX05;

// �ڵ� ���ҽ�(��ü) ����

// �ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ忡 ���� �Ҵ�


class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;											// ���
	
	Abc (String name, int studentID, int kor, int eng, int math) {
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (double) (kor + eng + math) / 3;
	}
	
	@Override
	public void close() throws Exception {							// close() �޼ҵ尡 �ڵ����� ȣ��ȴ�.
		// AutoCloseable �������̽��� close() �޼ҵ带 �������̵�
		
		System.out.println();
		
		System.out.println(name);
		System.out.println(studentID);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(avg);
		
		if (name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			
			System.out.println();
			
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			System.out.println(name);
			System.out.println(studentID);
			System.out.println(kor);
			System.out.println(eng);
			System.out.println(math);
			System.out.println(avg);
		}
	}
}

public class EX_TryWithResource_03 {

	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ� close() �޼ҵ� ȣ��
		
		try (Abc abc = new Abc("ȫ�浿", 111020, 80, 70, 95)) {
			System.out.println("�̸� : " + abc.name);
			System.out.println("���� : " + abc.kor + ", ���� : " + abc.eng + ", ���� : " + abc.math);
			System.out.println("��� : " + abc.avg);
		} catch (Exception e){
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		System.out.println("===========================================");
		
		// 2. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� ���� ���� ó��
		
		Abc abc2 = null;
		
		try {
			abc2 = new Abc("�̼���", 111021, 90, 80, 75);
			System.out.println("�̸� : " + abc2.name);
			System.out.println("���� : " + abc2.kor + ", ���� : " + abc2.eng + ", ���� : " + abc2.math);
			System.out.println("��� : " + abc2.avg);
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		} finally {
			if(abc2.name != null || abc2.studentID != 0 || abc2.kor != 0 || abc2.eng != 0 || abc2.math != 0 || abc2.avg != 0.0) {
				try {
					abc2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
