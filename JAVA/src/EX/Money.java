package EX;
import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		// �ݾ� �Է½� ���� �� ���� ���� ���
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int result = 0;
		
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			if (i == 0) {
				result = numb / unit[i];
				System.out.println(unit[i] + " �� ¥�� : " + result + " ��");
			} else {
				result = numb % unit[i - 1] / unit[i];
				System.out.println(unit[i] + " �� ¥�� : " + result + " ��");
			}
		}
		
		/* �ٸ� ���
		 * 
		 * for (int i = 0; i < unit.length; i++) {
		 * 		System.out.print("%d �� ¥�� : %d �� \n", unit[i], numb/unit[i]);
		 * 		money = money - (money/unit[i]) * unit[i];
		 * }
		 * 
		 */
		
		
		
		sc.close();
	}
}