package chap05;

import java.util.Arrays;

public class ReadArrayData_EX05 {
	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		// 1. �迭�� ��(index) ����
		
		System.out.println(array.length);			// ���� ������ ���, �迭����.length
		System.out.println("====================");
		
		// 2. ���(1) : ���ȣ�� ���� �Է��Ͽ� ���, Ư�� ���ȣ�� ���� ����� �� ���
		
		System.out.print(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
		// System.out.println(array[5]); Array Index Out Of Bounds Exception, ���ȣ �ʰ� ��½� ����
		System.out.println();
		System.out.println("====================");
		
		// 3. ���(2) : for���� ����ؼ� ��� ������ ���
		
		for (int i =0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		// 4. ���(3) : for���� ����ؼ� Ư�� ������ ���
		
		for (int i = 0; i < 3; i++) {				// �� ���沨��, �� �� �����ϴ��� ������ ����
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		
		// 5. ���(4) : ���� for��, ó�� ����� ������ ����� ��ȯ�ϸ鼭 ���, ������ �����ؼ� ����� �� ���ٴ� ����
		
		for (int k : array) {					// for (������ڷ��� ���� :  �迭����) {�ڷ��� ���� ���� ���౸��}
			System.out.print(k + " ");			// ���������� ���� ���� ���ʷ� k�� ����
		}
		System.out.println();
		System.out.println("====================");
		
		// 6. ���(5) : Arrays.toString(�迭������), �迭 ������ ��� ���� ���, ������ �����ؼ� ����� �� ���ٴ� ����
		System.out.println(Arrays.toString(array));
		
	}
}
