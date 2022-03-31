package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		/* 1. List 구현 클래스의 생성자를 사용하여 객체 생성
		 List는 인터페이스이므로 new 키 뒤에 올 수 없다. ArrayList, vector, LinkedList
		 capacity : 메모리의 방 크기를 할당, 기본값은 10
		 size : 방에 저장된 값의 갯수
		*/ 
		
		List<Integer> aList1 = new ArrayList<>();					// capacity : 10
		List<Integer> aList2 = new ArrayList<>(30);					// capacity : 30
		
		
		List<Integer> aList3 = new Vector<>();						// capacity : 10
		List<Integer> aList4 = new Vector<>(30);					// capacity : 30
		
		List<Integer> aList5 = new LinkedList();					
		// List<Integer> aList6 = new LinkedList(30);				// LinkedList 는 capacity 할당이 불가능하다. 
		
		
		// 2. Arrays 클래스의 정적 메소드를 이용하는 방법 : 데이터 크기를 바꿀 수 없다, 따라서 고정된 값을 저장할 때 이용 (EX. 요일, 계정, 24시간)
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24);
		List<String> aList8 = Arrays.asList("웛","화", "수", "목","금","토", "일");
		
		aList7.set(1, 7);											// set(index번호, 값) : 기본의 값을 수정
		// aList7.add(5);											// add(값)은 마지막 index로 값을 추가하는 것으로, 크기가 고정된 List에서는 쓸 수 없다.
		
		System.out.println(aList7);
		
		aList8.set(0, "일");											// set(index번호, 값) : 기본의 값을 수정
		// aList8.add("금");											// add(값)은 마지막 index로 값을 추가하는 것으로, 크기가 고정된 List에서는 쓸 수 없다.
		
		System.out.println(aList8);
		
		
		
	}

}
