package Practice;

public class ifControlStatement {

	public static void main(String[] args) {
		// if ���� ����
		boolean b = true;
		
		if (b) {
			System.out.println("���");
		}
		
		// if-else ����
		boolean c = false;
		
		if (c) {
			System.out.println("��µ��� ����");
		} else {
			System.out.println("���");
		}
		
		// if-else if-else ����
		boolean a = true;
		boolean d = false;
		boolean e = true;
		
		if (d) {
			System.out.println("������� ����");
		} else if(a) {
			System.out.println("���");
		} else if(e) {
			System.out.println("��µ��� ����");
		} else {
			System.out.println("��µ��� ����");
		}
		
	}

}
