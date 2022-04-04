package chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* TreeSet : 임의의 값을 넣으면 Set에 정렬되어 저장, 출력 시 오름차순으로 정렬되어 출력 (ascending : 오름차순, descending : 내림차순)
 * Set 인터페이스> SortedSet 인터페이스 (정렬메소드정의)> NavigableSet 인터페이스 (검색메소드정의) > TreeSet 클래스
 * TreeSet 타입으로 객체를 생성해야 정렬 및 검색 메소드가 지원 (목적이 정렬 및 검색이므로 꼭 TreeSet 타입으로 생성)
 * Set 인터페이스의 모든 메소드 또한 사용이 가능
 */


public class TreeSetMethod {
	public static void main(String[] args) {
		// TreeSet은 Set의 모든 메소드를 사용할 수 있다.
		
		// TreeSet 에 값을 넣었을 경우 오름차순 정렬되어 값이 Set에 저장, 출력 시 오름차순 정렬로 출력
		TreeSet<Integer> treeSet = new TreeSet<>();						// Type을 TreeSet으로 지정해야 정렬과 검색을 사용할 수 있다.
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);									// 큰 수부터 저장하더라도 오름차순으로 정렬하여 저장되고 출력된다.
		
		System.out.println("==============================");
		
		// TreeSet에서만 사용 가능한 메소드
		
		
		
		// 데이터 검색
		
		// 1. first() : 제일 처음값을 리턴
		System.out.println(treeSet.first());
		
		System.out.println("==============================");
		
		// 2. last() : 제일 마지막값을 리턴
		System.out.println(treeSet.last());
		
		System.out.println("==============================");
		
		// 3. lower(E element) : element로 지정해준 값보다 작은 값 하나를 리턴
		System.out.println(treeSet.lower(26));
		
		System.out.println("==============================");
		
		// 4. higher(E element) : element로 지정해준 값보다 큰 값 하나를 리턴
		System.out.println(treeSet.higher(26));
		
		System.out.println("==============================");
		
		// 5. floor (E element) : element로 지정해준 값보다 작거나 같은 값 하나를 리턴 
		System.out.println(treeSet.floor(26));
		System.out.println(treeSet.floor(25));
		
		System.out.println("==============================");
		
		// 6. ceiling (E element) : element로 지정해준 값보다 크거나 같은 값 하나를 리턴
		System.out.println(treeSet.ceiling(26));
		System.out.println(treeSet.ceiling(27));
		
		System.out.println("==============================");
		
		
		
		// 데이터 값을 꺼내기 (가져와서 꺼내오면 그 값이 사라진다.)
		
		// 7. pollFirse() : 첫 번째 값 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		
		System.out.println();
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());
		}
		
		System.out.println();
		
		System.out.println(treeSet.size());
		
		System.out.println("==============================");
		
		// 8. pollLast() : 마지막 값 꺼내기
		for (int i = 50; i > 0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		System.out.println();
		
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		
		System.out.println();
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		
		System.out.println();
		
		System.out.println(treeSet.size());
		
		System.out.println("==============================");
		
		/* 9. SortedSet<E> headSet(E element) : 정렬을 사용하기 위해서는 SortedSet 객체를 생성해주어야 한다.
		 * 		SortedSet<E> : 정렬된 데이터를 저장하는 Set
		 * 		headSet(E element) : element를 기준으로 Head 쪽의 값을 저장, element 값은 미포함
		 */
		for (int i = 50; i > 0; i -=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		System.out.println();
		
		SortedSet<Integer> sSet = treeSet.headSet(20);				// headSet(20)은 SortedSet으로 리턴값을 돌려줌
		// Set<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		System.out.println("==============================");
		
		
		/* 10. NavigableSet<E> headSet(E element, boolean inclusive)
		 * 		headSet(E element, true) : element를 기준으로 Head 쪽의 값을 저장, element 값을 포함
		 * 		headSet(E element, false) : element를 기준으로 Head 쪽의 값을 저장, element 값을 미포함
		 */
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		// Set<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet);
		
		System.out.println("==============================");
		
		/* 11. SortedSet<E> tailSet(E element) : 정렬을 사용하기 위해서는 SortedSet 객체를 생성해주어야 한다.
		 * 		SortedSet<E> : 정렬된 데이터를 저장하는 Set
		 * 		tailSet(E element) : element를 기준으로 Tail 쪽의 값을 저장, element 값을 포함
		 */
		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);				// headSet(20)은 SortedSet으로 리턴값을 돌려줌
		// Set<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		System.out.println("==============================");
		
		/* 12. NavigableSet<E> tailSet(E element, boolean inclusive)
		 * 		tailSet(E element, true) : element를 기준으로 Tail 쪽의 값을 저장, element 값을 포함
		 * 		tailSet(E element, false) : element를 기준으로 Tail 쪽의 값을 저장, element 값을 미포함
		 */
		
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, true);
		// Set<Integer> nSet2 = treeSet.tailSet(20, true);
		System.out.println(nSet2);
		
		System.out.println("==============================");
		
		// 13. SortedSet<E> subSet(E element, E element) : 특정 범위의 값을 set으로 담을 때
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3);									// 시작값은 포함, 끝값은 미포함이 모든 프로그램에서 기본이다.
		
		System.out.println("==============================");
		
		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet3 = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet3);
		
		System.out.println("==============================");
		
		// 15. NavigableSet<E> descendingSet() : 현재 정렬을 반대로 정렬
		
		NavigableSet<Integer> nSet4 = treeSet.descendingSet();
		
		System.out.println(nSet4);
		
		NavigableSet<Integer> nSet5 = nSet4.descendingSet();
		
		System.out.println(nSet5);
		
		
	}

}
