package chap14.EX09;


class MyAllException extends Exception {									// �Ϲݿ��� (checked exception)
	public MyAllException() {
		super();												
	}
	
	public MyAllException(String message) {	
		super(message);
	}
}


class AA {
	// private�� �ٿ�����ϴ� ���� : �Ⱥٿ��� ��� ��ü�� ���� ���� �Ҵ��� �� �ֱ� ����, ĸ��ȭ
	// ������, setter�� ���� �ʵ尪�� �ʱ�ȭ : ���� ��, �ʵ尪�� �Ҵ��� �� �ִ�.
	private String season;								// ��, ����, ����, �ܿ� �̿��� ���� ���� �߻�
	private String week;								// ��, ȭ, ��, ��, ��, ��, �� �̿��� ���� ���� �߻�
	private int scoreKor;								// 0~100 �̿��� ���� ���� �߻�
	private int scoreEng;								// 0~100 �̿��� ���� ���� �߻�
	private String userID;								// 12~20�� �̿��� ���� ���� ���� �߻�
	
	void studentInfo (String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if (season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new MyAllException ("��, ����, ����, �ܿ� �� �Է����ּ���");
		} else if (week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��") {
			throw new MyAllException ("��, ȭ, ��, ��, ��, ��, �� �� �Է����ּ���");
		} else if (scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException ("0~100 ���� �Է�");
		} else if (scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException ("0~100 ���� �Է�");
		} else if (userID.length() < 12 || userID.length() > 20) {
			throw new MyAllException ("12�� �̻� 20�� ������ ����");
		} else {
			System.out.println("���������� ���� �ԷµǾ����ϴ�.");
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		
		System.out.println(season + ", " + week + ", " + scoreKor + ", " + scoreEng + ", " + userID);
		
	}
	
	
	
	
	
	
	
}

public class UserException_EX02 {

	public static void main(String[] args) {
		AA aa = new AA();
		
		// ������ �� �Է�
		try {
			aa.studentInfo("��", "��", 80, 90, "������������������������");
		} catch (MyAllException e) {
			// e.printStackTrace();													// �޼ҵ尡 void �̱⶧���� ��ȯŸ���� ����. ����� ��, ��¹��ȿ� ���� �ʴ´�.
			System.out.println(e.getMessage());										// �޼ҵ尡 ��ȯŸ���� String�̱� ������ ������� �ʿ�
		}
		
		System.out.println("===========================================");
		
		// ���ܹ߻�
		try {
			aa.studentInfo("��", "��", 80, 90, "������������������������");
		} catch (MyAllException e) {
			// e.printStackTrace();													// �޼ҵ尡 void �̱⶧���� ��ȯŸ���� ����. ����� ��, ��¹��ȿ� ���� �ʴ´�.
			System.out.println(e.getMessage());										// �޼ҵ尡 ��ȯŸ���� String�̱� ������ ������� �ʿ�
		}

	}

}
