package chap17.EX11;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* Map<Key, Value> : key & value 형식으로 자료 저장
 * Key는 중복될 수 없으며, Value는 중복될 수 있다.
 * 		Key는 Set으로 관리된다.
 * 		Key는 index가 아니다.
 * 
 * HashMap : 출력이 랜덤하게 출력, 단일 스레드 환경에 적합, 모든 메소드가 동기화 되어있지 안핟.
 * HashTable : 모든 메소드가 동기화(Synchronized) 되어 있다. 멀티스레드 환경에 적합하다.		
 * 			모든 메소드는 HashMap과 동일하다.
 * LinkedHashMap : 입력 순서대로 출력
 * 
 * 
 * HashMap VS LinkedHashMap
 * HashMap<Key, Value> : 입력 순서와 출력 순서가 다를 수 있다.
 * LinkedHashMap<Key, Value> : Key는 앞 뒤 값의 정보를 가지고 연결되어 있다. 입력 순서와 출력 순서가 같다.
 */


public class LinkedHashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> lhMap1 = new LinkedHashMap<>();
		
		// 1. put(Key, Value)
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");
		lhMap1.put(3, "다다다");							// key는 중복되어 저장될 수 없다. 값만 수정
		
		System.out.println(lhMap1);
		
		System.out.println("==========================");
		
		// 2. putAll(다른 객체) : 다른 Map을 복사해서 추가
		
		Map<Integer, String> lhMap2 = new Hashtable<>();
		lhMap2.put(1, "가가가");
		lhMap2.putAll(lhMap1);
		
		System.out.println(lhMap2);
		
		System.out.println("==========================");
		
		// 3. replace(Key, Value) : Key에 저장된 value를 Value로 수정
		lhMap2.replace(1, "대체가가가");
		lhMap2.replace(4, "대체라라라");							// key 4는 없다. 이 경우, 에러도 나지 않고 무시된다.

		System.out.println(lhMap2);
		
		System.out.println("==========================");
		
		// 4. replace(Key, oldValue, newValue) : Key에 저장된 oldValue를 newValue로 수정

		lhMap2.replace(1, "대체가가가", "대체가가가2");
		lhMap2.replace(4, "없는값", "대체라라라2");					// value가 없다. 이 경우, 에러도 나지 않고 무시된다. (key 와 value가 모두 일치해야 한다.)

		System.out.println(lhMap2);
		
		System.out.println("==========================");
		
		// 5. get(Object key) : Map의 값을 가져올때, key에 할당된 value를 반환
		
		System.out.println(lhMap2.get(1));
		System.out.println(lhMap2.get(2));
		System.out.println(lhMap2.get(3));

		System.out.println("==========================");
		
		// 6. containsKey(Object key) : Map에 해당 key가 존재하는지 확인해 true/false로 반환
		System.out.println(lhMap2.containsKey(1));
		System.out.println(lhMap2.containsKey(4));

		System.out.println("==========================");
		
		// 7. containsValue(Object value) : Map에 해당 value가 존재하는지 확인해 true/false로 반환
		System.out.println(lhMap2.containsValue("나다라"));
		System.out.println(lhMap2.containsValue("없는값"));

		System.out.println("==========================");
				
		// 8. Set<Key> KetSet() : Set 차입으로 키만 추출하여 다른 set에 저장할 때 사용
		Set<Integer> keySet = lhMap2.keySet();
		System.out.println(keySet);

		System.out.println("==========================");
				
		// 9. Set<Map.Entry<key, value>> entrySet() : key와 value 묶어서 추출하여 다른 set에 저장할 때 사용
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);

		System.out.println("==========================");
		
		// 10. size() : key와 value 세트 갯수
		System.out.println(lhMap2.size());

		System.out.println("==========================");
		
		// 11. remove(Object key) : key와 할당된 value 모두 삭제
		lhMap2.remove(1);
		lhMap2.remove(4);										// key 4는 없다. 아무일도 일어나지 않는다. 에러도 안남
		System.out.println(lhMap2);

		System.out.println("==========================");
				
		// 12. remove(Object key, Object value) : key와 value 모두 일치할 때, 해당 key와 value 모두 삭제
		lhMap2.remove(2, "나다라");
		lhMap2.remove(3, "틀린값");										// value가 잘못되었다. 아무일도 일어나지 않는다. 에러도 안남
		System.out.println(lhMap2);

		System.out.println("==========================");

		
		// 13. clear() : 모두 삭제
		lhMap2.clear();
		System.out.println(lhMap2);
		
		
	}
}
