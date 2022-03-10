package chap06_07.EX06;


/*	����������
 * ���������ڰ� ���� �� �ִ� Ű���� : class, �ʵ�, �޼ҵ�, ������ ��)
 * �ݵ�� ���������ڰ� �Ҵ�Ǿ� �ִ�. (�����Ǿ� ���� ���, default)
 * 1. public : �ٸ� ��Ű������ ���� ���� (import)
 * 2. protected : ��ӱ����� �Ǿ� ���� ���, �ٸ� ��Ű������ ���� ���� (import)
 * 3. default : ���� ��Ű������ ���� ����
 * 4. private : ���� Ŭ���� ���ο����� ���� ����
 */


/*	�ܺ� Ŭ���� : �ϳ��� java file���� �ܺο� ����� Ŭ����
 * public ���� ������(modifier)�� ������� ���Ѵ�. (public�� file�� �ϳ��� ������ �� �ִ�.)
 * default ���� �����ڰ� �⺻���� ����Ǿ� �ִ�. (Ŭ������ ���������ڴ� public or default)
 */


// �ܺ�Ŭ����
class Abc {
	
	// �ʵ�
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	// �޼ҵ�
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���ٰ���");
	}
	
	protected void print2() {
		System.out.println("��ӱ��� ��, �ٸ� ��Ű������ ���ٰ���");
	}
	
	void print3() {
		System.out.println("���� ��Ű������ ���ٰ���");
	}
	
	private void print4() {
		System.out.println("���� Ŭ���� ���ο����� ���ٰ���");
	}
	
	// ������
	
	//Abc(){}					// �⺻������ : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����, ��������
	
}

public class EX06_All {

	public static void main(String[] args) {
		// ���� ��Ű�� ������ �ʵ� ȣ��
		
		Abc abc1 = new Abc();					// �⺻������ ȣ��
		
		abc1.a = 100;							// public
		abc1.b = 200;							// protected
		abc1.c = 300;							// default
		//abc1.d = 400;							// private
		
		
		// ���� ��Ű�� ������ �޼ҵ� ȣ��
		
		abc1.print1();							// public
		abc1.print2();							// protected
		abc1.print3();							// default
		// abc1.print4();						// private
	}

}
