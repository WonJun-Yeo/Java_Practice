package EX;
import java.util.Scanner;
public class MultiplicationOf3 {
	// 인풋값중 3의 배수만 출력
	public static void main(String[] args) {
		System.out.println("양의 정수 10개를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int numb = 0;
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			numb = sc.nextInt();
			array[i] = numb;
		}
		
		System.out.print("3의 배수는 ");
		
		for (int i = 0; i < 10; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			};
		}
		sc.close();
	}
}
