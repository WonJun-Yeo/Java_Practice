package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*	ArrayList VS LinkedList
 * ArrayList : 값에 대해서 index를 가지고 있다.
 * 		장정 : 검색 속도가 빠르다.
 * 		단점 : 값을 추가하거나 삭제할 때, 부하가 많이 걸려 느리다.
 * LinkedList : 각각의 값은 앞뒤의 정보만 가지고 있으며, 검색시에 index가 할당된다.
 * 		장점 : 값을 추가하거나 삭제할 때, 부하가 걸리지 않아 빠르다. (앞뒤 정보(Linked)만 끊어서 새로 연결하면 되기 때문)
 * 		단점 : 검색 속도가 느리다.
 * 
 */


public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		// 1. 데이터를 추가 시, 속도비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		
		long startTime = 0, endTime = 0;
		
		// 1-1 ArrayList 데이터 추가 시간
		startTime = System.nanoTime();													// System.nanoTime() : 기준 시점에서 경과 시간을 측정하는데 사용
		for (int i = 0; i < 100000; i++) {
			aList.add(0, i);															// 한칸씩 밀리면서 index 0 에 10만까지 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간 : " + (endTime - startTime));
		
		// 1-2 LinkedList 데이터 추가 시간
		
		startTime = System.nanoTime();													// System.nanoTime() : 기준 시점에서 경과 시간을 측정하는데 사용
		for (int i = 0; i < 100000; i++) {
			linkedlist.add(0, i);														// 한칸씩 밀리면서 index 0 에 10만까지 추가
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 추가 시간 : " + (endTime - startTime));
		
		
		System.out.println("=============================");
		
		
		// 2. 검색시 시, 속도비교
		
		// 2-1 ArrayList 검색 시간
		startTime = System.nanoTime();													// System.nanoTime() : 기준 시점에서 경과 시간을 측정하는데 사용
		for (int i = 0; i < 100000; i++) {
			aList.get(i);																// index 0 에 10만까지 값을 검색
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 검색 시간 : " + (endTime - startTime));
		
		// 2-2 LinkedList 검색 시간
		startTime = System.nanoTime();													// System.nanoTime() : 기준 시점에서 경과 시간을 측정하는데 사용
		for (int i = 0; i < 100000; i++) {
			linkedlist.get(i);															// index 0 에 10만까지 값을 검색
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 검색 시간 : " + (endTime - startTime));
		
		
		System.out.println("=============================");
		
		
		// 3. 삭제 시, 속도비교
		
		// 3-1 ArrayList 검색 시간
		startTime = System.nanoTime();													// System.nanoTime() : 기준 시점에서 경과 시간을 측정하는데 사용
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);															// index 0 에 10만까지 값을 삭제
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 삭제 시간 : " + (endTime - startTime));
		
		// 3-2 LinkedList 검색 시간
		startTime = System.nanoTime();													// System.nanoTime() : 기준 시점에서 경과 시간을 측정하는데 사용
		for (int i = 0; i < 100000; i++) {
			linkedlist.remove(0);														// index 0 에 10만까지 값을 삭제
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 삭제 시간 : " + (endTime - startTime));
	}

}
