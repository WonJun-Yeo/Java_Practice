package chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/* TreeMap : 저장시에 Key를 기준으로 오름차순으로 정렬되어 저장 및 출력
 * Key에 일반 객체를 저장할 때, Comparable 인터페이스의 compareTo() 메소드를 재정의 하거나 Comparator 인터페이스의 compare()메소드를 재정의 해야 한다. (정렬)
 * 		1. Comparable 인터페이스의 compareTo() 메소드를 재정의 방법 : 객체 수정 필요
 * 		2. Comparator 인터페이스의 compare()메소드를 재정의 : 객체 수정 필요X
 * 
 * Map <K,V> > SortedMap<K,V> (정렬메소드) > NavigableMap<K,V> (검색메소드) > TreeMap<K,V>
 * 		TreeMap을 사용할 때, 타입을 TreeMap으로 지정해야 정렬과 검색 메소드를 사용할 수 있다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class TreeMapMethod {

	public static void main(String[] args) {
		// TreeMap<K, V> 은 Map<K, V> 메소드를 모두 사용, 추가적으로 SortedMap, NavigableMap 메소드 사용
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		for (int i = 20; i > 0; i -=2) {
			treeMap.put(i, i + "번째 데이터");
		}
		
		System.out.println(treeMap);												// 오름차순으로 정렬되어 저장 및 출력
		
		System.out.println("===========================================");
		
		
		// 1. firstKey() : 제일 첫번째 Key 값을 반환
		System.out.println(treeMap.firstKey());

		System.out.println("===========================================");
		
		
		// 2. firstEntry() : 제일 첫번째 Key 값과 Value 값을 반환 
		System.out.println(treeMap.firstEntry());

		System.out.println("===========================================");
			
		
		// 3. lastKey()	: 가장 마지막 Key 값을 반환
		System.out.println(treeMap.lastKey());

		System.out.println("===========================================");
			
		
		// 4. firstEntry() : 제일 첫번째 Key 값과 Value 값을 반환 
		System.out.println(treeMap.lastEntry());

		System.out.println("===========================================");
		
		
		// 5. lowerKey(K key) : 입력받은 Key 값보다 낮은 키값 하나 출력
		System.out.println(treeMap.lowerEntry(10));

		System.out.println("===========================================");
		
		
		// 6. higherKey(K key) : 입력받은 Key 값보다 높은 키값 하나 출력
		System.out.println(treeMap.higherEntry(10));

		System.out.println("===========================================");
			
		
		// 7. pollFirstEntry() : 첫 번째 key와 value 값을 끄집어 내기 (끄집어내고나면 사라짐)
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		System.out.println("===========================================");
		
		
		// 8. pollLastEntry() :마지막 key와 value 값을 끄집어 내기 (끄집어내고나면 사라짐)	
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		System.out.println("===========================================");
		
		
		// 9. SortedMap<K,V> headMap(k Key) : 입력받은 key 값을 기준으로 head쪽 데이터를 Sorted타입으로 반환
		SortedMap<Integer,String> sMap = treeMap.headMap(8);
		System.out.println(sMap);

		System.out.println("===========================================");
		
		
		// 10. NavigableMap<K,V> headMap(k Key, boolean inclusive) : 입력받은 key 값을 포함(true) or 미포함(false)하여 기준으로 head쪽 데이터를NavigableMap 타입으로 반환
		NavigableMap<Integer,String> nMap = treeMap.headMap(8, true);
		System.out.println(nMap);
		
		System.out.println("===========================================");
		
		
		// 11. SortedMap<K,V> tailMap(k Key) : 입력받은 key 값을 기준으로 head쪽 데이터를 Sorted타입으로 반환
		SortedMap<Integer,String> sMap2 = treeMap.tailMap(8);
		System.out.println(sMap2);

		System.out.println("===========================================");
		
		
		// 12. NavigableMap<K,V> headMap(k Key, boolean inclusive) : 입력받은 key 값을 포함(true) or 미포함(false)하여 기준으로 head쪽 데이터를NavigableMap 타입으로 반환
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false);
		System.out.println(nMap2);

		System.out.println("===========================================");
		
		// 13. SortedMap<K,V> subMap(k fromKey, k toKey)		
		SortedMap<Integer,String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);

		System.out.println("===========================================");
		
		// 14. NavigableMap<K, V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer,String> subMap2 = treeMap.subMap(6, true, 10, false);
		System.out.println(subMap2);

		System.out.println("===========================================");
		
		// 15. NavigableMap<K> descendingKeySet() : Key값을 기준으로 key를 반대로 정렬하여 Set 타입으로 반환
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		
		System.out.println(nSet.descendingSet());
		
		System.out.println("===========================================");
				
		// 16. NavigableMap<K, V> descendingMap() : 현재 정렬을 반대로 장렬
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		
		System.out.println(nvMap.descendingMap());
		
		System.out.println("===========================================");
		
		
		
		
		
		
		
		
		
	}

}
