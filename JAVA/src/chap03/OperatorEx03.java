package chap03;
public class OperatorEx03 {
	public static void main(String[] args) {
		/*
		 * �� ������ (&&, ||, ^, !) 	: ��Ʈ ��Ŷ�� �߻��ȴ�. (��Ʈ ��Ŷ : �պκ��� ���� ����� ������ �� ������, �޺κ��� ������ ����)
		 * ��Ʈ ������ (&, |, ^)		: ��Ʈ ��Ŷ�� �߻����� �ʴ´�.
		 */
		
		// 1. �� ������ AND (&&) : �� ���� ��� true �� ��, ����� true
		
		System.out.println(true && true);		// ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println(true && false);		// ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println(false && true);		// ��Ʈ��Ŷ�� �߻��ȴ�. (�պκ��� false�̰� &&�̱� ������ �ڸ� �Ⱥ��� ����� false)
		System.out.println(true && (5 < 3));		// ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println((5 <= 5) && (7 > 2));	// ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println((3 < 2) && (8 < 10));	// ��Ʈ��Ŷ�� �߻��ȴ�.
		System.out.println("===================");
		
		// 2. �� ������ OR (||) : �� ���� �ϳ��� true �̸� ����� true
		
		System.out.println(true || true);		// ��Ʈ��Ŷ�� �߻��ȴ�.
		System.out.println(false || (5 < 3));		// ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println("===================");
		
		
		
		// 3. �� ������ XOR (^) : �ΰ��� ���� �� false, �ΰ��� �ٸ� �� true 
		System.out.println( true ^ true);
		System.out.println( false ^ false);
		System.out.println( true ^ false);
		System.out.println( false ^ true);
		System.out.println((5<=5) ^ (7>2));
		System.out.println("===================");
		
		// 4. �� ������ NOT (!) : true �̸� false, false �̸� true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3));
		System.out.println("===================");
		
		// �� ��Ŷ�� ��� ���� (���������϶� �߻�, ��Ʈ�������϶��� �߻����� ����)
		int value2 = 3;
		System.out.println(false && ++value2 > 6);		// ��Ʈ��Ŷ�� �߻��ȴ�.
		System.out.println(value2);						// ��Ʈ��Ŷ �߻����� ++value2 ����� ������� �ʾ� 3���� ���
		
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6);		// ��Ʈ�������̱⶧���� ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6);		// ��Ʈ��Ŷ�� �߻��ȴ�.
		System.out.println(value4);						// ��Ʈ��Ŷ �߻����� ++value3 ����� ������� �ʾ� 3���� ���
		
		int value5 = 3;
		System.out.println(true | ++value5 > 6);		// ��Ʈ�������̱⶧���� ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println(value5);
		
		
		
	}
}
