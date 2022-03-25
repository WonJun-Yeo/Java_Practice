package chap14.EX09;

class seasonException extends Exception {									// �Ϲݿ��� (checked exception)
	public seasonException() {
		super();												
	}
	
	public seasonException(String message) {	
		super(message);
	}
}

class weekException extends Exception {
	public weekException() {
		super();												
	}
	
	public weekException(String message) {	
		super(message);
	}
}

class scoreKorException extends Exception {
	public scoreKorException() {
		super();												
	}
	
	public scoreKorException(String message) {	
		super(message);
	}
}

class scoreEngException extends Exception {
	public scoreEngException() {
		super();												
	}
	
	public scoreEngException(String message) {	
		super(message);
	}
}

class userIDException extends Exception {
	public userIDException() {
		super();												
	}
	
	public userIDException(String message) {	
		super(message);
	}
}


class A {
	// private�� �ٿ�����ϴ� ���� : �Ⱥٿ��� ��� ��ü�� ���� ���� �Ҵ��� �� �ֱ� ����, ĸ��ȭ
	// ������, setter�� ���� �ʵ尪�� �ʱ�ȭ : ���� ��, �ʵ尪�� �Ҵ��� �� �ִ�.
	private String season;								// ��, ����, ����, �ܿ� �̿��� ���� ���� �߻�
	private String week;								// ��, ȭ, ��, ��, ��, ��, �� �̿��� ���� ���� �߻�
	private int scoreKor;								// 0~100 �̿��� ���� ���� �߻�
	private int scoreEng;								// 0~100 �̿��� ���� ���� �߻�
	private String userID;								// 12~20�� �̿��� ���� ���� ���� �߻�
	
	public void checkSeason (String season) throws seasonException {
		if (season.equals("��") || season.equals("����") || season.equals("����") || season.equals("�ܿ�")) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.season = season;
			System.out.println("���� : " + this.season);
		} else {
			throw new seasonException("���ܹ߻� : ������ �Է��� �ּ���.");
		}
	}
	
	public void checkWeek (String week) throws weekException {
		if (week.equals("��") || week.equals("ȭ") || week.equals("��") || week.equals("��") || week.equals("��") || week.equals("��") || week.equals("��")) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.week = week;
			System.out.println("���� : " + this.week);
		} else {
			throw new weekException("���ܹ߻� : ������ �Է��� �ּ���.");
		}
	}
	
	public void checkScoreKor (int scoreKor) throws scoreKorException {
		if (scoreKor >= 0 && scoreKor <=100) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.scoreKor = scoreKor;
			System.out.println("�������� : " + this.scoreKor);
		} else {
			throw new scoreKorException("���ܹ߻� : 0~100 ���� �Է��� �ּ���.");
		}
	}
	
	public void checkScoreEng (int scoreEng) throws scoreEngException {
		if (scoreEng >= 0 && scoreEng <=100) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.scoreEng = scoreEng;
			System.out.println("�������� : " + this.scoreEng);
		} else {
			throw new scoreEngException("���ܹ߻� : 0~100 ���� �Է��� �ּ���.");
		}
	}
	
	
	public void checkUserID (String userID) throws userIDException {
		if (userID.length() < 12 || userID.length() > 20) {
			throw new userIDException("���ܹ߻� : 12~20�ڷ� �ۼ��� �ּ���");
		} else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.userID = userID;
			System.out.println("�������̵� : " + this.userID);
			
		}
	}
	
	
	
}

public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.checkSeason("��");
		} catch	(seasonException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
			
		try {
			a.checkWeek("ȭ");
		} catch	(weekException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
		
		try {
			a.checkScoreKor(100);
		} catch	(scoreKorException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
		
		try {
			a.checkScoreEng(120);
		} catch	(scoreEngException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=============================");
		
		try {
			a.checkUserID("ashdlas");
		} catch	(userIDException e) {
			System.out.println(e.getMessage());
		}

	}

}
