package chap03;
public class OperatorEx06 {
	public static void main(String[] args) {
		/*
		 * ���� ����Ʈ�� �̿��ؼ� �� ��Ʈ�� ��ġ ���� �˾Ƴ���
		 */
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1); // 0 : 0��° ��Ʈ��
		System.out.println(flags >>> 1 & 1); // 1 : 1��° ��Ʈ��
		System.out.println(flags >>> 2 & 1); // 2 : 2��° ��Ʈ��
		System.out.println(flags >>> 3 & 1); // 3 : 3��° ��Ʈ��
		System.out.println(flags >>> 4 & 1); // 4 : 4��° ��Ʈ��
		System.out.println(flags >>> 5 & 1); // 5 : 5��° ��Ʈ��
		System.out.println(flags >>> 6 & 1); // 6 : 6��° ��Ʈ��
		System.out.println(flags >>> 7 & 1); // 7 : 7��° ��Ʈ��
		System.out.println(flags >>> 8 & 1); // 8 : 8��° ��Ʈ��
	}
}