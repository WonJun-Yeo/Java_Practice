package Practice;

public class continueKeyWord {

	public static void main(String[] args) {
		// ���� for�� �� ����for�� �ȿ� if���� �Բ� continue�� ���� ��
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		// continue + Label ������ �̿��� ���� for�� ������ �������� �ݺ��� �پ�ѱ�
		POS1:
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					continue POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
		 
		
		
		
	}

}
