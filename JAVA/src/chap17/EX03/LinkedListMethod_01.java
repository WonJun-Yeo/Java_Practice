package chap17.EX03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* LinkedList 는 ArrayList와 다르게 생성장로 생성 시, capacity 설정이 불가능하다.
 * 데이터의 내부 저장방식이 index가 아닌 앞뒤 객체의 위치 정보를 저장
 * 평소에는 index가 없다가 작동할 때 index를 부여한다.
 * 떄문에 index번호로 바로 찾아 갈 수 없이 앞뒤 객체 정보로 찾아가야하므로 검색이 느리다.
 * 추가, 삭제가 빠르다.
 */

public class LinkedListMethod_01 {

	public static void main(String[] args) {
		/* List의 메소드 13개 
		 * 1. ArrayList 클래스 : 싱글 스레드 환경에 사용. 추가,삭제가 느리고 검색이 빠르다.
		 * 2. LinkedList 클래스 : 멀티 스레드 환경에 사용
		 * 3. LinkedList : 추가,삭제가 빠르고 검색이 느리다.
		 */
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		// 1. add(E element) : 마지막 index에 값 추가
		linkedlist1.add(3);linkedlist1.add(4);linkedlist1.add(5);linkedlist1.add(6);
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.size());
		
		System.out.println();
		
		// 2. add(index, E element) : 선언한 index에 추가, 값들이 자동으로 뒤로 밀린다.
		linkedlist1.add(1, 6);
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.size());
		
		System.out.println();
		
		// 3. addAll (또다른 리스트 객체) : 마지막 index 뒤로 또 다른 리스트의 객체를 복사해서 추가
		List<Integer> linkedlist2 = new LinkedList();
		linkedlist2.add(1);
		linkedlist2.add(2);
		System.out.println(linkedlist2);
		System.out.println(linkedlist2.size());
		
		
		linkedlist2.addAll(linkedlist1);
		System.out.println(linkedlist2);
		System.out.println(linkedlist2.size());
		
		System.out.println();
		
		// 4. addAll (index, 또다른 리스트 객체) : 선언한 index부터 추가, 값들이 자동으로 뒤로 밀린다.
		List<Integer> linkedlist3 = new LinkedList<>();
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.add(3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		linkedlist3.addAll(1, linkedlist3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 5. set(index, E element) : index에 해당하는 값을 수정
		linkedlist3.set(1, 5);
		linkedlist3.set(3, 6);
		// linkedlist3.set(6, 2);							// 없는 index는 IndexOutOfBoundsException 발생
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 6. remove(index) : index에 해당하는 값을 삭제, index가 자동으로 당겨진다.
		linkedlist3.remove(1);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 7. remove (Object o) : 값에 해당하는 값을 삭제, index가 자동으로 당겨진다.
		linkedlist3.remove(new Integer(2));					// throw line이 있는 것은 앞으로 없어질 수 있는 구문이란 뜻이다. 오류아님
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 8. clear() : 전체 삭제
		linkedlist3.clear();
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 9. isEmpty() : 값이 비어 있으면 true, 비어있지 않으면 false
		System.out.println(linkedlist3.isEmpty());
		
		System.out.println();
		
		// 10.size() : index안의 값의 갯수
		linkedlist3.add(1);linkedlist3.add(2);linkedlist3.add(3);linkedlist3.add(4);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 11. get(index) : index에 해당하는 값 반환
		System.out.print(linkedlist3.get(0) + " ");
		System.out.print(linkedlist3.get(1) + " ");
		System.out.print(linkedlist3.get(2) + " ");
		System.out.println(linkedlist3.get(3));
		
		System.out.println();
		
		// 12. toArray() : List(리스트) Array(배열)로 변환
		Object[] object = linkedlist3.toArray();							// 기본적으로 toArray는 Object 타입의 배열로변환
		System.out.println(object);											// 배열로 바뀌었기 때문에 객체를 직접 출력하면 주소값이 출력된다.
		
		System.out.println();
		
		// 13-1 toArray(T[] t) : Integer로 바로 캐스팅
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]);			// 방크기가 자료 갯수보다 적게 선언된 경우, 실제 자료만큼 크기가 할당된다. 
		System.out.println(Arrays.toString(integer1));						// ** 방크기를 모르는 경우가 있기 때문에, 0으로 사용하여 알맞게 방크기를 할당할 수 있다.
		
		Integer[] integer2 = linkedlist3.toArray(new Integer[6]);			// 방크기가 자료 갯수보다 많게 선언된 경우, 빈 방들은 null 값이 할당된다.
		System.out.println(Arrays.toString(integer2));
		
	}

}
