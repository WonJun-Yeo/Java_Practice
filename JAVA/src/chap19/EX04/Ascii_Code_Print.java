package chap19.EX04;

/* ASCII �ڵ�
 * 1byte = 8bit
 * ���� �� ��Ʈ�� ��ȣ��Ʈ
 * 1~32 ��Ʈ������ ����� �� �� ���� Ư���� �ڵ尡 ���ִ�. ex) null(1), ����� ����, ���(7), ����(LF, 10), del(����, 127)
 * 
 * ���� ��°����� ��z = 33 ~ 126 ��Ʈ
 * ����, ����, Ư������ ��
 */

/* ���
 * ======================================
 * ASCII	(�ǵι�)	����	(�ǵι�)	ASCII	(�ǵι�)	����
 * 33				!	3		34				&		
 * 35				#			36				$
 * ...
 * 								126
 */



public class Ascii_Code_Print {

	public static void main(String[] args) {
		
		System.out.println("���");
		System.out.println("==================================================");
		System.out.println("ASCII" + "\t\t" + "����" + "\t\t" + "ASCII" + "\t\t" + "����");
		
		int[] array = new int[94];
		for (int i = 33; i < 127; i++) {
			array[i-33] = i;
		}
		
		for (int i = 0; i < 94; i += 2) {
			System.out.println(array[i] + "\t\t" + (char)array[i] + "\t\t" + array[i+1] + "\t\t" + (char)array[i+1]);
		}
		
	}

}
