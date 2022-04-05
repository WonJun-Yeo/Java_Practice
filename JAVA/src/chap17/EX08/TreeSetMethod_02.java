package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet의 장점
 * 1. Set이기 때문에 중복저장되지 않는다.
 * 2. 오름차순으로 정렬되어 입력된다.
 * 3. descending() 메소드 을 이용해 내림차순으로 정렬할 수 있다.
 * 4. 검색기능을 사용할 수 있다.
 * 5. 특정 범위를 지정하여 출력할 수 있다.
 * 
 * TreeSet 에 일반 객체를 저장할 경우, 크기비교 기준 특정 필드가 존재해야 한다.
 * 		1. Comparable<E> 인터페이스의 compareTo() 메소드 재정의 방법: TreeSet에 일반 객체를 저장할 때, 일반 객체의 특정 필드를 재정의
 * 		2. Comparator<E> 인터페이스의 compare() 메소드 재정의 방법 : 기존의 객체를 수정하지 않고 사용할 때
 * 				익명 내부 객체를 사용해서 처리한다. : TreeSet<E> 객체를 생성할 때 생성자에 Comparator<E> 인터페이스를 구현한 익명 객체를 생성하고 매개변수로 삽입
 */

class MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
		public String toString() {
			return data1 + " " + data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;																// 필드를 비교기준으로 설정하고 compareTo() 재정의
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyComparableClass o) {								// 객체의 크기비교 기준을 설정하도록 Override, TreeSet에서 사용
		// 오름차순 정렬 방식
		if(this.data1 < o.data1) {											// this.data1 기준 값이 작을 경우, -1 (음수)
			return -1;
		} else if (this.data1 == o.data1) {									// this.data1 기준 값이 같을 경우, 0
			return 0;
		} else {
			return 1;														// this.data1 기준 값이 클 경우, +1 (양수)
		}
		
		/* 내림차순 정렬 방식
		if(this.data1 < o.data1) {											// this.data1 기준 값이 작을 경우, -1 (음수)
			return 1;
		} else if (this.data1 == o.data1) {									// this.data1 기준 값이 같을 경우, 0
			return 0;
		} else {
			return -1;														// this.data1 기준 값이 클 경우, +1 (양수)
		}
		*/
	};
	
	@Override
	public String toString() {
		return data1 + "/" + data2;
	}
}




public class TreeSetMethod_02 {

	public static void main(String[] args) {
		/* wrapper 클래스는 comparable<E> 인터페이스의 compareTo() 메소드를 재정의하고 있다. 
		 * 		wrapper 클래스의 값을 TreeSet에 넣으면 정렬되어 저장
		 */
		
		// 1. Integer
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);					// 큰값
		Integer intValue2 = new Integer(10);					// 작은값
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);							// 오름차순 정렬
		
		// 2. String
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나");							// 작은값
		String str2 = new String("다라");							// 큰값
		
		treeSet2.add(str2);
		treeSet2.add(str1);
		
		System.out.println(treeSet2);
		
		// 3. MyClass가 TreeSet에 저장되기 위해서는 Comparable<E> 인터페이스의 compareTo() 메소드가 재정의되어야 한다.
		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		
		//treeSet3.add(myClass1);									// ClassCastException 발생
		//treeSet3.add(myClass2);									// ClassCastException 발생
		
		//System.out.println(treeSet3);
		
		// 4. 방법1 : MyComparableClass 객체 크기 비교 : Comparable<E> 인터페이스의 compareTo() 메소드가 재정의
		// 기존객체의 수정이 필요
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
		MyComparableClass myComparableClass2 = new MyComparableClass(5,3);
		MyComparableClass myComparableClass3 = new MyComparableClass(4,3);
		
		treeSet4.add(myComparableClass1);
		treeSet4.add(myComparableClass2);
		treeSet4.add(myComparableClass3);
		
		System.out.println(treeSet4);
		
		System.out.println("=====================================================");
		
		
		// 5. 방법2 : 기존의 객체를 수정하지 않고 TreeSet에 저장할 경우
		// treeSet 생성자 내부에 Comparator <E> 인터페이스를 정의, 익명 객체로 구혀
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			// Comparator<MyClass>를 구현한 익명 자식 클래스 블락
			@Override
			public int compare(MyClass o1, MyClass o2) {
				
				if (o1.data1 < o2.data1) {
					return -1;
				} else if (o1.data1 == o2.data1 ) {
					return 0;
				} else {
					return 1;
				}
				
			}
		});
		
		MyClass myClass3 = new MyClass(2,5);
		MyClass myClass4 = new MyClass(3,3);
		
		treeSet5.add(myClass3);
		treeSet5.add(myClass4);
		
		System.out.println(treeSet5);
		
	}

}
