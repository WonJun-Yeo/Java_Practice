package Practice;

public class outputStatement {

	public static void main(String[] args) {
		// Println()
		System.out.println("ȭ�� ���");									// ȭ�� ���
		System.out.println("ȭ��" + "���");								// ȭ�����
		System.out.println(3.8);										// 3.8
		System.out.println(3 + 5);										// 8
		System.out.println(3 + 5 + "ȭ��");								// 8ȭ��
		System.out.println("ȭ��" + 3);									// ȭ��3
		System.out.println("ȭ��" + 3 + 5);								// ȭ��35
		System.out.println(5 + "ȭ��" + 3);								// 5ȭ��3
		
		// Print()
		System.out.print("ȭ��");
		System.out.print("���");
		System.out.print(3);
		System.out.print(5);
		
		// Printf()
		System.out.printf("%d\n", 30);									// 30
		System.out.printf("%o\n", 30);									// 36
		System.out.printf("%x\n", 30);									// 1e
		System.out.printf("%s\n", "���");								// ���
		System.out.printf("%f\n", 5.8);									// 5.800000
		System.out.printf("%4.2f\n", 5.8);								// 5.80 ���
		System.out.printf("%d �� %4.2f\n", 3, 5.8);						// 4�� 5.80
		
	}

}
