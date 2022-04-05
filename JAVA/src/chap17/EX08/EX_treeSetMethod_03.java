package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력 시, 이름을 오름차순으로 출력하도록 구현하라. treeSet에 name 컬럼을 기준으로 정렬
// 1. Comparable <E> 인터페이스의 compareTo() 메소드 재정의 : 기존 객체 수정 필요
// 2. Comparator <E> 인터페이스의 compare() 구현 : 기존 객체 수정없이 구현



class Abc {
	String name;											// 이름, 정렬 컬럼 (가-하)
															// 강감찬, 이순신, 홍길동
	int age;												// 나이
	
	Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
	
}

class Abc_T implements Comparable<Abc_T> {
	
	String name;											// 이름, 정렬 컬럼 (가-하)
	// 강감찬, 이순신, 홍길동
	int age;												// 나이

	Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Abc_T o) {
		
		if(this.name.compareTo(o.name) < 0) {
			return -1;
		} else if (this.name == o.name) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
	
}


public class EX_treeSetMethod_03 {

	public static void main(String[] args) {
		
		TreeSet<Abc_T> treeSet1 = new TreeSet<Abc_T>();	
		
		Abc_T abc_t1 = new Abc_T("이순신", 50);
		Abc_T abc_t2 = new Abc_T("홍길동", 20);
		Abc_T abc_t3 = new Abc_T("강감찬", 40);
		
		
		treeSet1.add(abc_t1);
		treeSet1.add(abc_t2);
		treeSet1.add(abc_t3);
		
		System.out.println(treeSet1);
		
		System.out.println("================================");
		
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				if(o1.name.compareTo(o2.name) < 0) {
					return -1;
				} else if (o1.name == o2.name) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		Abc abc1 = new Abc("이순신", 50);
		Abc abc2 = new Abc("홍길동", 20);
		Abc abc3 = new Abc("강감찬", 40);
		
		
		treeSet2.add(abc1);
		treeSet2.add(abc2);
		treeSet2.add(abc3);
		
		System.out.println(treeSet2);
	}

}
