package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* java.lang 패키지의 클래스들은 import가 필요없다.
 * 그 외 다른 패키지들은 import를 해주어야 한다.
 */


/* Collection (컬렉션) : 동일한 자료형을 저장, 방의 크기가 동적
 * Array (배열) : 동일한 자료형을 저장, 생성시 방의 크기를 선언, 방의 크기가 정적
 */



/* List<E>
 * 1. Generic interface 이며, 다양한 데이터 타입을 사용할 수 있다.
 * 2. index(방번호)를 가지고 있다.
 * 3. toString() 메소드가 오버라이딩되어 있어, 객체안의 값을 출력한다.
 * List<E>를 구현한 클래스
 * 		- ArrayList<E> : 싱글 스레드 환경에서 사용, 검색은 빠르나 값을 추가하거나 삭제할 때 느리다.
 * 		- Vector<E> : 멀티 스레드 환경에서 사용, 모든 메소드가 동기화 되어있다.
 * 		- LinkedList<E> : 검색은 느리나 값을 추가하거나 삭제할 때 빠르다.
 */

public class ArrayList_01 {
	public static void main(String[] args) {
		// 1. Array(배열)
		String[] array = new String[] {"가", "나", "다", "라", "마","바", "사"};
		System.out.println(array.length);		// 7
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);		// 7
		
		// Arrays.toString(배열변수) : 배열값 전체 출력
		System.out.println(Arrays.toString(array));
		
		// for 문 사용해서 출력
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println();
		
		// Enhanced For 문을 사용해서 출력
		for (String k : array) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		// 2. List : 인터페이스, 객체 생성을 할 수 없다. 타입은 지정 가능
		List<String> aList1 = new ArrayList<String>();						// 완성된 구문
		List<String> aList2 = new ArrayList<>();							// 생성자의 데이터 타입 생략가능
		List<String> aList3 = new ArrayList();								// 생성자의 데이터 타입 선언부 생략가능
		
		// List에서 방의 갯수 출력 : aList.size()	;
		System.out.println(aList1.size());		// 0
		
		// List에 값 할당하기 : aList.add(값할당), 제일마지막에 값을 추가
		aList1.add("가");
		aList1.add("나");
		aList1.add("다");
		aList1.add("라");
		aList1.add("마");
		System.out.println(aList1.size());		// 5
		
		// List에 저장된 값 제거 : aList.remove(삭제할 값), 제거된 경우 비어진 곳으로 index들이 당겨진다.
		aList1.remove("나");
		aList1.remove("라");
		System.out.println(aList1.size());		// 3
		
		// List는 index를 가지고 있다. (For)
		for (int i = 0; i < aList1.size(); i++) {
			System.out.print(aList1.get(i) + ", ");
		}
		
		System.out.println();
		
		// Enhanced For 문을 사용해서 출력
		for (String k : aList1) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		// 객체의 toString()을 호출해서 출력
		System.out.println(aList1);											// 
		
		
		
		
		
		
	}
}
