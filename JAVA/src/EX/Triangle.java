package EX;
public class Triangle {
	public static void main(String[] args) {
		// ���� ���
		String s = "*";
		for (int i = 0; i < 4; i++) {
			System.out.print(s);
			s = "*" + s;
			System.out.println();
		}
		
		
		/* 2�� for������ �ۼ�
		 * 
		 * int lineCount;		// ���� �������� �����ϴ� ����
		 * int starCount;		// ���� ����ϴ� ����
		 * 
		 * for (lineCount = 0; lineCount < 4; lineCount++) {
		 * 		for (starCount = 0; starCount <= lineCount; starCount++) {
		 * 			System.out.print(*);
		 * 		{
		 * 		System.out.println();
		 * }
		*/
	}
}
