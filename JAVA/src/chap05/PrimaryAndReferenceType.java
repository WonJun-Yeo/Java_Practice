package chap05;
public class PrimaryAndReferenceType {
	public static void main(String[] args) {

		// 1. 기본 데이터 타입의 대입 연산 (Stack 값을 복사)
		
		int value1 = 3;
		int value2 = value1;
		
		value2 = 7;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		// 2. 참조 자료형의 대입 연산 (Stack의 Heep의 주소를 복사) 
		
		int[] array1 = new int[] {3, 4, 5, 6, 7};
		int[] array2 = array1;					// array2는 stack 영영에서 array1의 heep영역 주소를 복사
		array2[0] = 7;
		
		System.out.println(array1[0]);
		System.out.println(array2[0]);
		System.out.println(array1);
		System.out.println(array2);
		System.out.println();
		
		
	}
}
