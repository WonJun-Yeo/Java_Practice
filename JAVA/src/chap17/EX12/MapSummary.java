package chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Map 정리 : Key, Value
 * 1. HashMap : 입력순서와 관계없이 무작위로 출력, 메소드 동기화가 되어 있지 않다. 싱글스레드 환경에 사용
 * 2. HashTable : 모든 메소드가 동기화(Synchronized) 되어 있다. 멀티 스레드 환경에서 사용
 * 3. LinkedHashMap : 입력순서와 동일하게 순서대로 출력
 * 4. TreeMap : Key를 기준으로 오름차순 정렬되어 입력, Comparable<E>인터페이스의 compareTo() or Comparator<E>인터페이스의 compare() 메소드가 재정의 되어야한다. (Wrapper 클래스는 이미 재정의되어있다.)
 */

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : 입력순서와 출력순서가 다르다.
		Map <String, Integer> hashMap = new HashMap<>();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		
		System.out.println(hashMap);
		
		
		// 2. HashTable : 입력순서와 출력순서가 다르다. <동기화 되어 있다.> <멀티스레드환경>
		Map <String, Integer> hashTable = new Hashtable<>();
		hashTable.put("다", 30);
		hashTable.put("마", 40);
		hashTable.put("나", 50);
		hashTable.put("가", 60);
		System.out.println(hashTable);
		
		// 3. LinkedHashTable : 입력순서와 출력순서가 다르다. <동기화 되어 있다.> <멀티스레드환경>
		Map <String, Integer> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put("다", 30);
		linkedhashMap.put("마", 40);
		linkedhashMap.put("나", 50);
		linkedhashMap.put("가", 60);
		System.out.println(linkedhashMap);
		
		// 4. TreeMap : Key를 기준으로 오름차순으로 정렬되어 저장
		
		TreeMap <String, Integer> treeMap = new TreeMap<>();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		System.out.println(treeMap);
		
		
		
	}

}
