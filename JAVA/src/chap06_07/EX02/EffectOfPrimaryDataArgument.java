package chap06_07.EX02;

public class EffectOfPrimaryDataArgument {
	
	int abc; 								// �ʵ� : Heep ������ ����, ��üȭ(�ν��Ͻ�ȭ)�� ���Ѿ� ��밡��
	
	
	static int twice (int a) {				// ������ �޾Ƽ� * 2 �� ���� ��ȯ
		a = a* 2;
		return a;							// �޼ҵ尡 ��ȿ�ɶ� RAM(�޸�) stack���� �����ȴ�.
	}
	
	public static void main(String[] args) {
		// 
		int result1 = twice(3);
		System.out.println(result1);
		System.out.println("===============");
		
		int a = 3;					// ��������, stack ������ ������ ���� ����ȴ�.
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);		// 
	}

}
