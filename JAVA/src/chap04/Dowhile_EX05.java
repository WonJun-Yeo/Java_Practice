package chap04;
public class Dowhile_EX05 {
	public static void main(String[] args) {
		
		// 1. while���� do while�� �� : ������ 0�� ���
		
		int a = 0;
		while(a < 0) {
			System.out.println(a);			// ������ true �ϴ븸 �����
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a);			// do while������ ������ 1���� �����
			a++;
		} while (a < 0);		// ������ false
		System.out.println("===============");
		
		// 2. while���� do while�� �� : ������ 1�� ���
		
		a = 0;
		while (a < 1) {
			System.out.println(a);
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a < 1);
		System.out.println("===============");
		
		
		// 3. while���� do while�� �� : ������ 10�� ���
		a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a <10);
		
	}
}
