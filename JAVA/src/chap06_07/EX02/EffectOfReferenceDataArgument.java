package chap06_07.EX02;

import java.util.Arrays;

// 참조 자료형(배열)의 메소드 인풋값으로 호출

public class EffectOfReferenceDataArgument {
	
	
	static void modifyData (int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	
	static void printArray (int[] a) {				// 배열의 stack 영역에 존재하는 주소값을 복사한다.
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,3};			// 배열변수 선언 및 할당
		modifyData(array);
		printArray(array);
	}

}
