package chap17.EX12;

import java.util.Comparator;
import java.util.TreeMap;

/* TreeMap<K, V> : Key가 정렬되어 저장 및 출력
 * 		key : 일반 객체를 사용할 경우, 중복값 저장을 막기위해 Comparable 인터페이스의 compareTo()메소드 or Comparator 인터페이스의 compare() 메소드 재정의가 필요하다.
 * 
 * 
 * 
 * 
 * 
 */

class  MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + "값출력";
	}
}

// Comparable 인터페이스의 compareTo() 메소드 재정의
class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + "값출력";
	}

	@Override
	public int compareTo(MyComparableClass o) {
		if (this.data1 < o.data1) {
			return -1;
		} else if(this.data1 == o.data1) {
			return 0;
		} else {
			return 1;
		}
	}
}


public class TreeMapMethod_02 {

	public static void main(String[] args) {
		// 1. MyClass를 TreeMap의 Key로 인풋 할 경우, 실행시 오류 발생 (Comparable, Comparator의 메소드 구현 X)
		TreeMap<MyClass, String> treeMap1 = new TreeMap();
		
		MyClass m1 = new MyClass(2, 5);
		MyClass m2 = new MyClass(3, 3);
		/*
		treeMap1.put(m1, "첫번째 값");
		treeMap1.put(m2, "두번째 값");
		
		System.out.println(treeMap1);
		*/
		
		// 2. MyComparableClass를 TreeMap의 Key로 인풋 할 경우 (Comparable, Comparator의 메소드 구현)
		TreeMap<MyComparableClass, String> treeMap2 = new TreeMap();
		
		MyComparableClass m3 = new MyComparableClass(2, 5);
		MyComparableClass m4 = new MyComparableClass(3, 3);
		MyComparableClass m5 = new MyComparableClass(1, 1);
		
		treeMap2.put(m3, "첫번째 값");
		treeMap2.put(m5, "세번째 값");
		treeMap2.put(m4, "두번째 값");
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
		
		System.out.println("====================================");
		
		// 3. Comparator 인터페이스의 compare() 구현 : 기존의 객체 사용, 객체 수정 필요X
		TreeMap<MyClass, String> treeMap3 = new TreeMap<MyClass, String>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1 < o2.data1) {
					return -1;
				} else if(o1.data1 == o2.data1) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		MyClass m6 = new MyClass(2,5);
		MyClass m7 = new MyClass(3,3);
		MyClass m8 = new MyClass(1,1);
		
		treeMap3.put(m6, "첫번째 값");
		treeMap3.put(m8, "세번째 값");
		treeMap3.put(m7, "두번째 값");
		
		System.out.println(treeMap3);
		
	}

}
