package chap04;
public class Break_EX04 {
	public static void main(String[] args) {
		// 1. ���� loop�� ����� ������ break Ż��
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;		// ���� break�� ������ �ݺ����� ���߰� �ش� ������ �������´�.
		}
		System.out.println("==================");
		
		// 2. for�� ���� if�� ���ǿ� break Ż�� 
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");				
		}
		System.out.println();
		System.out.println("==================");
		
		// 3. ���� loop�� ����� ������ break Ż�� (�ϳ��� �ݺ����� Ż��)
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break;						// ���� for�������� �������´�.
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("==================");
		
		// 4. ���� loop�� ����� ������ break Ż�� (���̸��� �߰��� �Ѳ����� Ż��)
		
		
POS1:	for (int i = 0; i < 5; i++) {		// ���̸��� �ٿ��� 
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break POS1;			// ���̸��� ���� ������ ����������.
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("==================");
				
			
		// 5. ���� loop�� ����� ������ break Ż�� (������ ������ false�� ���� Ż��)
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					i = 100;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
