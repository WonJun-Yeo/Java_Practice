package chap17.EX07;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

/* Set<E elements> : index가 없으며, 중복된 값을 넣을 수 없다.
 * 1. LinkedLinkedHashSet : index가 없어 값을 출력 시, 순서대로 꺼내지 않는다.
 * 2. LinkedLinkedLinkedHashSet : index가 없지만 값끼리 Link 되어있어 값을 출력시, 입력한 순서대로 출력된다.
 * 3. TreeSet : 저장될 때 값이 크기순으로 정렬되어 저장.( ascending : 오름차순, descending : 내림차순 ). 출력 시, 정령순서대로 출력 ** 정렬 검색이 목적이기 때문에, 타입을 TreeSet으로 두어야한다.
 */

/*	LinkedLinkedLinkedHashSet
 * 1. LinkedLinkedHashSet과 공통점
 * 		모든 메소드가 동일
 * 		중복된 값을 저장하지 않는다.
 * 		index가 없다. (for문으로 출력할 수 없다, enhanced for으로는 출력이 가능하다.)
 * 2. LinkedLinkedHashSet과 차이점
 * 		입력한 순서대로 출력된다.
 */


public class LinkedHashSetMethod {

	public static void main(String[] args) {
		Set<String> linkedHashSet1 = new LinkedHashSet<>();										// Set의 generic 타입변수로 wrapper 클래스를 사용할 경우, equals()와 hashCode()가 재정의 되어있어 중복값이 저장되지 않는다.
		
		// 1. add(E element) 메소드 : Set에 값을 추가
		linkedHashSet1.add("가"); linkedHashSet1.add("나"); linkedHashSet1.add("가");				// "가" 중복저장 되지 않는다. error 나지는 않는다.
		System.out.println(linkedHashSet1);
		System.out.println(linkedHashSet1.toString());							// toString() 메소드가 재정의되어있다.
		
		System.out.println("=================================");
		
		// 2. addAll(다른 set 객체) 메소드 : 자신의 Set에 다른 Set에 저장된 값을 추가 (중복된 값을 제거)
		Set<String> linkedHashSet2 = new LinkedHashSet<>();
		linkedHashSet2.add("나"); linkedHashSet2.add("다");
		linkedHashSet2.addAll(linkedHashSet1);											// 중복된 값은 저장되지 않는다.
		System.out.println(linkedHashSet2);												// 입력 순서대로 출력
		
		System.out.println("=================================");
		
		// 3. remove(Object o) : 값으로 삭제								// ** List의 경우 index로 삭제
		linkedHashSet2.remove("나");
		System.out.println(linkedHashSet2);
		
		System.out.println("=================================");
		
		// 4. clear() : 모두 삭제
		linkedHashSet2.clear();
		System.out.println(linkedHashSet2);
		
		System.out.println("=================================");
		
		// 5. isEmpty()	 : 비어있으면 true, 비어있지 않으면 false
		System.out.println(linkedHashSet2.isEmpty());
		
		System.out.println("=================================");
		
		// 6. contains (Object o) : 값이 Set에 존재하면 true, 존재하지 않으면 false
		Set<String> linkedHashSet3 = new LinkedHashSet<>();
		linkedHashSet3.add("가"); linkedHashSet3.add("나"); linkedHashSet3.add("다"); 
		System.out.println(linkedHashSet3) ;
		System.out.println(linkedHashSet3.contains("나"));
		System.out.println(linkedHashSet3.contains("라"));
		
		System.out.println("=================================");
		
		// 7. size() : Set에 포함된 값의 갯수
		System.out.println(linkedHashSet3.size());
		
		System.out.println("=================================");
		
		// 8. iterator() : Set은 index를 가지지 않는다. 값을 순회하면서 출력
		
		/* 1. hasNext() : Set의 값이 존재하면 true, 존재하지 않으면 false
		 * 2. next() : 현재 값을 출력하고 다음값으로 이동
		 * for 문은 방번호로 값을출력하기 떄문에 사용불가, enhanced for문은 값을 넣기때문에 가능
		 */
		
		Iterator<String> iterator = linkedHashSet3.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		
		for (String k : linkedHashSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("=================================");
		
		// 9. toArray() : Set의 값들을 Object 타입의 배열로 변환. Object 타입으로 변환되기 때문에 다운캐스팅이 필요하다.
		Object[] objArray = linkedHashSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		System.out.println(objArray);
		for (int i = 0; i < objArray.length; i ++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		
		for (Object k : objArray) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("=================================");
		
		// 10. toArray(T[] t) : Set의 값들을 지정한 타입의 배열로 변환
		String[] strArray1 = linkedHashSet3.toArray(new String[0]);						// 선언한 방의 크기가 필요한 방보다 적을 경우, 컴파일러가 필요한 방의 크기만큼 자동 지정
		System.out.println(Arrays.toString(strArray1));
		
		for (String k : strArray1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================================");
		
		// 11. Set의 방의 크기보다 크게 지정한 경우 나머지 방은 null값이 들어간다.
		String[] strArray2 = linkedHashSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		System.out.println("=================================");
		
		Set<Integer> intSet1 = new LinkedHashSet<>();
		
		intSet1.add(30);intSet1.add(50);intSet1.add(100);intSet1.add(10);
		
		// iterator 출력, Enhanced for문을 사용해서 출력
		
		Iterator<Integer> iterator2 = intSet1.iterator();
		
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();
		
		
		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}
		
	}

}
