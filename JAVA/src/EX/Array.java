package EX;
public class Array {
	public static void main(String[] args) {
		// �迭�� �̿��� 1 ~ 10���� ���� ���
		
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int k : scores) {
			sum += k;
		}
		System.out.println(sum);
	}
}
