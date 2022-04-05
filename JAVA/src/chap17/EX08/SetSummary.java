package chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Set : 중복되지 않는 값을 저장 ( equals()&hashCode() 메소드를 재정의, Wrapper클래스는 재정의되어 있다.), index가 없다.
 * 	1. HashSet : 무작위 순서로 출력
 *  2. LinkedHashSet : 입력순서대로 출력
 * 	3. TreeSet : 정렬되어 오름차순으로 출력
 * 		정렬하기위해 Comparable<E> 인터페이스의 compareTo() 재정의 or Comparator<E> 인터페이스의 compare() 구현
 */







public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		
		System.out.println(hashSet);
		System.out.println("==================================");
		
		// 2. LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		
		linkedhashSet.add("다");
		linkedhashSet.add("마");
		linkedhashSet.add("나");
		linkedhashSet.add("가");
		
		System.out.println(linkedhashSet);
		System.out.println("==================================");
		
		// 3. TreeSet
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		
		System.out.println(treeSet);
		System.out.println("==================================");
		
		
	}

}
