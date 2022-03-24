package chap14.EX08;

// ID�� ���� Null�� ���, Exception �߻�
// user ID�� : 8�� �̻� 20�ڰ� �ƴ� ��� Exception �߻�



// Checked Exception ����
class IDFormatException extends Exception {
	public IDFormatException () {
		super();
	}
	
	public IDFormatException(String message) {										// ���� �߻� ��, e.getMessage() �޼ҵ�(message ��ȯ)�� �̿��� ���� �޼����� ���
		super(message);
	}
}


// 
public class IDFormatTest {

	private String userID;															// üũ�ؼ� null ���̰ų�, 8�� �̻� 20�ڰ� �ƴ� ��� Exception �߻�
		// userID ĸ��ȭ �Ǿ���. private ���������� : �ܺγ� �ٸ� Ŭ�������� ���� ����.
		// ������ or setter�� ����ؼ� ���� �Ҵ�
		// ���������ڰ� Private���� ������ ��� : getter�� setter�� ���
	
	
	
	
	public String getUserID() {														// �޼ҵ� ȣ�� ��, �޸��� userID ���� �Ҵ�
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {											// �޸��� ���� �Ҵ�
		if (userID == null) {
			throw new IDFormatException("ID�� Null�� �� �����ϴ�.");
		} else if (userID.length() > 20 || userID.length() < 8) {
			throw new IDFormatException("ID�� 8�� �̻�, 20�� ���Ϸ� ��� �����մϴ�.");
		} else {
			System.out.println("���������� �۵��Ǿ����ϴ�.");
		}
		this.userID = userID;
	}
	
	
	
	public static void main(String[] args) {
		
		// 1. userID �� null�� ���
		
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserID(userID);														// setter ȣ�� �� null �Է���, ȣ��
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
		
		// 2. userID �� ������ ��� ���
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("==========================");
		
		// 3. userID�� ���������� �ۼ��� ���
		
		userID = "12345678910";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		
		
	}
}
