package EX;
public class Max {
	public static void main(String[] args) {
		// �־��� �迭�� �׸񿡼� �ִ눩 ���ϱ�
		
		int max = 0;
		int[] array = {4,5,1,2,3};
		for (int k : array) {
			if (max < k) {
				max = k;
			}
		}
		System.out.println("max : " + max);
	}
}
