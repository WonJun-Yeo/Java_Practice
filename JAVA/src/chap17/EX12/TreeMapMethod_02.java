package chap17.EX12;

import java.util.Comparator;
import java.util.TreeMap;

/* TreeMap<K, V> : Key�� ���ĵǾ� ���� �� ���
 * 		key : �Ϲ� ��ü�� ����� ���, �ߺ��� ������ �������� Comparable �������̽��� compareTo()�޼ҵ� or Comparator �������̽��� compare() �޼ҵ� �����ǰ� �ʿ��ϴ�.
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
		return data1 + "�����";
	}
}

// Comparable �������̽��� compareTo() �޼ҵ� ������
class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + "�����";
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
		// 1. MyClass�� TreeMap�� Key�� ��ǲ �� ���, ����� ���� �߻� (Comparable, Comparator�� �޼ҵ� ���� X)
		TreeMap<MyClass, String> treeMap1 = new TreeMap();
		
		MyClass m1 = new MyClass(2, 5);
		MyClass m2 = new MyClass(3, 3);
		/*
		treeMap1.put(m1, "ù��° ��");
		treeMap1.put(m2, "�ι�° ��");
		
		System.out.println(treeMap1);
		*/
		
		// 2. MyComparableClass�� TreeMap�� Key�� ��ǲ �� ��� (Comparable, Comparator�� �޼ҵ� ����)
		TreeMap<MyComparableClass, String> treeMap2 = new TreeMap();
		
		MyComparableClass m3 = new MyComparableClass(2, 5);
		MyComparableClass m4 = new MyComparableClass(3, 3);
		MyComparableClass m5 = new MyComparableClass(1, 1);
		
		treeMap2.put(m3, "ù��° ��");
		treeMap2.put(m5, "����° ��");
		treeMap2.put(m4, "�ι�° ��");
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
		
		System.out.println("====================================");
		
		// 3. Comparator �������̽��� compare() ���� : ������ ��ü ���, ��ü ���� �ʿ�X
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
		
		treeMap3.put(m6, "ù��° ��");
		treeMap3.put(m8, "����° ��");
		treeMap3.put(m7, "�ι�° ��");
		
		System.out.println(treeMap3);
		
	}

}
