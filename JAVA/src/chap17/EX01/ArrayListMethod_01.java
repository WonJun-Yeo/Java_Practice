package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_01 {

	public static void main(String[] args) {
		/* List의 메소드 13개 
		 * 1. ArrayList 클래스 : 싱글 스레드 환경에 사용
		 * 2. Vector 클래스 : 멀티 스레드 환경에 사용 (모든 메소드가 동기화(synchronized)되어있어 적합)
		 * 3. LinkedList
		 */
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// 1. add(E element) : 마지막 index에 값 추가
		aList1.add(3);aList1.add(4);aList1.add(5);aList1.add(6);
		System.out.println(aList1);
		System.out.println(aList1.size());
		
		System.out.println();
		
		// 2. add(index, E element) : 선언한 index에 추가, 값들이 자동으로 뒤로 밀린다.
		aList1.add(1, 6);
		System.out.println(aList1);
		System.out.println(aList1.size());
		
		System.out.println();
		
		// 3. addAll (또다른 리스트 객체) : 마지막 index 뒤로 또 다른 리스트의 객체를 복사해서 추가
		List<Integer> aList2 = new ArrayList();
		aList2.add(1);
		aList2.add(2);
		System.out.println(aList2);
		System.out.println(aList2.size());
		
		
		aList2.addAll(aList1);
		System.out.println(aList2);
		System.out.println(aList2.size());
		
		System.out.println();
		
		// 4. addAll (index, 또다른 리스트 객체) : 선언한 index부터 추가, 값들이 자동으로 뒤로 밀린다.
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		aList3.addAll(1, aList3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 5. set(index, E element) : index에 해당하는 값을 수정
		aList3.set(1, 5);
		aList3.set(3, 6);
		// aList3.set(6, 2);							// 없는 index는 IndexOutOfBoundsException 발생
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 6. remove(index) : index에 해당하는 값을 삭제, index가 자동으로 당겨진다.
		aList3.remove(1);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 7. remove (Object o) : 값에 해당하는 값을 삭제, index가 자동으로 당겨진다.
		aList3.remove(new Integer(2));					// throw line이 있는 것은 앞으로 없어질 수 있는 구문이란 뜻이다. 오류아님
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 8. clear() : 전체 삭제
		aList3.clear();
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 9. isEmpty() : 값이 비어 있으면 true, 비어있지 않으면 false
		System.out.println(aList3.isEmpty());
		
		System.out.println();
		
		// 10.size() : index안의 값의 갯수
		aList3.add(1);aList3.add(2);aList3.add(3);aList3.add(4);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 11. get(index) : index에 해당하는 값 반환
		System.out.print(aList3.get(0) + " ");
		System.out.print(aList3.get(1) + " ");
		System.out.print(aList3.get(2) + " ");
		System.out.println(aList3.get(3));
		
		System.out.println();
		
		// 12. toArray() : List(리스트) Array(배열)로 변환
		Object[] object = aList3.toArray();					// 기본적으로 toArray는 Object 타입의 배열로변환
		System.out.println(object);							// 배열로 바뀌었기 때문에 객체를 직접 출력하면 주소값이 출력된다.
		
		System.out.println();
		
		// 13-1 toArray(T[] t) : Integer로 바로 캐스팅
		Integer[] integer1 = aList3.toArray(new Integer[0]);			// 방크기가 자료 갯수보다 적게 선언된 경우, 실제 자료만큼 크기가 할당된다. 
		System.out.println(Arrays.toString(integer1));					// ** 방크기를 모르는 경우가 있기 때문에, 0으로 사용하여 알맞게 방크기를 할당할 수 있다.
		
		Integer[] integer2 = aList3.toArray(new Integer[6]);			// 방크기가 자료 갯수보다 많게 선언된 경우, 빈 방들은 null 값이 할당된다.
		System.out.println(Arrays.toString(integer2));
		
	}

}
