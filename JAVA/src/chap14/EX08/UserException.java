package chap14.EX08;

/*	Exception�� ��ӹ޴� ����� ����
 * 1. Checked Exception
 * 		1-1. ������ ������ ��� ����
 * 		1-2. ������ 100���� �ʰ��ϴ� ��� ����
 * 
 * 
 */

class MinusException extends Exception {						// ������ ���� ���, ������ ���� �߻�
	public MinusException() {
		super();												// �θ�(Exception)�� �⺻ ������ ȣ��
	}
	
	public MinusException(String message) {						// ���� �޼��� ���, e.getMessage();
		super(message);
	}
}

class OverException extends Exception {							// 100�̻��� ���� ���� ���, ������ ���� �߻�
	public OverException() {
		super();												// �θ�(Exception)�� �⺻ ������ ȣ��
	}
	
	public OverException(String message) {						// ���� �޼��� ���, e.getMessage();
		super(message);
	}
}


class AAA {
	
	int score;
	
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("���ܹ߻� : ������ ���� �� �����ϴ�.");
		} else if (score > 100) {
			throw new OverException("���ܹ߻� : 100���� �Ѵ� ������ ���� �� �����ϴ�.");
		} else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.score = score;
			System.out.println("���� : " + this.score);
		}
	}
}





public class UserException {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		
		// ����
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("==============================");
		
		
		// 100�ʰ�
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("==============================");
		
		// ���� ����
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
