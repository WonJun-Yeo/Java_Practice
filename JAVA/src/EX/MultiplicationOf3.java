package EX;
import java.util.Scanner;
public class MultiplicationOf3 {
	// ��ǲ���� 3�� ����� ���
	public static void main(String[] args) {
		System.out.println("���� ���� 10���� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int numb = 0;
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			numb = sc.nextInt();
			array[i] = numb;
		}
		
		System.out.print("3�� ����� ");
		
		for (int i = 0; i < 10; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			};
		}
		sc.close();
	}
}
