package Practice;

public class breakKeyWord {

	public static void main(String[] args) {
		// ���� for�� ������ break�� ���� ���� for�� Ż��
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		
		// �ٱ��� for�� ���ǽ� false�� ����� �� ���� ���� for�� Ż��
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					i = 4;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		out:
		// break + Label �������� �� ���� ���� for�� Ż��
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					break out;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		
	}
}
