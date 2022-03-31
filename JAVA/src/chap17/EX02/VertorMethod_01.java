package chap17.EX02;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*	Vector 는 ArrayList와 모든 메소드를 동일하게 사용
 * 모든 메소드가 동기화(synchronized)되어있어 멀티스레드에서 사용하기에 적합하다.
 */

public class VertorMethod_01 {

	public static void main(String[] args) {
		/* List의 메소드 13개 
		 * 1. ArrayList 클래스 : 싱글 스레드 환경에 사용
		 * 2. Vector 클래스 : 멀티 스레드 환경에 사용
		 * 3. LinkedList
		 */
		
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E element) : 마지막 index에 값 추가
		vector1.add(3);vector1.add(4);vector1.add(5);vector1.add(6);
		System.out.println(vector1);
		System.out.println(vector1.size());
		
		System.out.println();
		
		// 2. add(index, E element) : 선언한 index에 추가, 값들이 자동으로 뒤로 밀린다.
		vector1.add(1, 6);
		System.out.println(vector1);
		System.out.println(vector1.size());
		
		System.out.println();
		
		// 3. addAll (또다른 리스트 객체) : 마지막 index 뒤로 또 다른 리스트의 객체를 복사해서 추가
		List<Integer> vector2 = new Vector();
		vector2.add(1);
		vector2.add(2);
		System.out.println(vector2);
		System.out.println(vector2.size());
		
		
		vector2.addAll(vector1);
		System.out.println(vector2);
		System.out.println(vector2.size());
		
		System.out.println();
		
		// 4. addAll (index, 또다른 리스트 객체) : 선언한 index부터 추가, 값들이 자동으로 뒤로 밀린다.
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		vector3.addAll(1, vector3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 5. set(index, E element) : index에 해당하는 값을 수정
		vector3.set(1, 5);
		vector3.set(3, 6);
		// vector3.set(6, 2);							// 없는 index는 IndexOutOfBoundsException 발생
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 6. remove(index) : index에 해당하는 값을 삭제, index가 자동으로 당겨진다.
		vector3.remove(1);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 7. remove (Object o) : 값에 해당하는 값을 삭제, index가 자동으로 당겨진다.
		vector3.remove(new Integer(2));					// throw line이 있는 것은 앞으로 없어질 수 있는 구문이란 뜻이다. 오류아님
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 8. clear() : 전체 삭제
		vector3.clear();
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 9. isEmpty() : 값이 비어 있으면 true, 비어있지 않으면 false
		System.out.println(vector3.isEmpty());
		
		System.out.println();
		
		// 10.size() : index안의 값의 갯수
		vector3.add(1);vector3.add(2);vector3.add(3);vector3.add(4);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 11. get(index) : index에 해당하는 값 반환
		System.out.print(vector3.get(0) + " ");
		System.out.print(vector3.get(1) + " ");
		System.out.print(vector3.get(2) + " ");
		System.out.println(vector3.get(3));
		
		System.out.println();
		
		// 12. toArray() : List(리스트) Array(배열)로 변환
		Object[] object = vector3.toArray();					// 기본적으로 toArray는 Object 타입의 배열로변환
		System.out.println(object);							// 배열로 바뀌었기 때문에 객체를 직접 출력하면 주소값이 출력된다.
		
		System.out.println();
		
		// 13-1 toArray(T[] t) : Integer로 바로 캐스팅
		Integer[] integer1 = vector3.toArray(new Integer[0]);			// 방크기가 자료 갯수보다 적게 선언된 경우, 실제 자료만큼 크기가 할당된다. 
		System.out.println(Arrays.toString(integer1));					// ** 방크기를 모르는 경우가 있기 때문에, 0으로 사용하여 알맞게 방크기를 할당할 수 있다.
		
		Integer[] integer2 = vector3.toArray(new Integer[6]);			// 방크기가 자료 갯수보다 많게 선언된 경우, 빈 방들은 null 값이 할당된다.
		System.out.println(Arrays.toString(integer2));
		
	}

}
