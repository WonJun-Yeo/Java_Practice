package chap06_07.EX02;

import java.util.Arrays;

// ���� �ڷ���(�迭)�� �޼ҵ� ��ǲ������ ȣ��

public class EffectOfReferenceDataArgument {
	
	
	static void modifyData (int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	
	static void printArray (int[] a) {				// �迭�� stack ������ �����ϴ� �ּҰ��� �����Ѵ�.
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,3};			// �迭���� ���� �� �Ҵ�
		modifyData(array);
		printArray(array);
	}

}
