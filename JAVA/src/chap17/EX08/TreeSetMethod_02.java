package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet�� ����
 * 1. Set�̱� ������ �ߺ�������� �ʴ´�.
 * 2. ������������ ���ĵǾ� �Էµȴ�.
 * 3. descending() �޼ҵ� �� �̿��� ������������ ������ �� �ִ�.
 * 4. �˻������ ����� �� �ִ�.
 * 5. Ư�� ������ �����Ͽ� ����� �� �ִ�.
 * 
 * TreeSet �� �Ϲ� ��ü�� ������ ���, ũ��� ���� Ư�� �ʵ尡 �����ؾ� �Ѵ�.
 * 		1. Comparable<E> �������̽��� compareTo() �޼ҵ� ������ ���: TreeSet�� �Ϲ� ��ü�� ������ ��, �Ϲ� ��ü�� Ư�� �ʵ带 ������
 * 		2. Comparator<E> �������̽��� compare() �޼ҵ� ������ ��� : ������ ��ü�� �������� �ʰ� ����� ��
 * 				�͸� ���� ��ü�� ����ؼ� ó���Ѵ�. : TreeSet<E> ��ü�� ������ �� �����ڿ� Comparator<E> �������̽��� ������ �͸� ��ü�� �����ϰ� �Ű������� ����
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
	int data1;																// �ʵ带 �񱳱������� �����ϰ� compareTo() ������
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyComparableClass o) {								// ��ü�� ũ��� ������ �����ϵ��� Override, TreeSet���� ���
		// �������� ���� ���
		if(this.data1 < o.data1) {											// this.data1 ���� ���� ���� ���, -1 (����)
			return -1;
		} else if (this.data1 == o.data1) {									// this.data1 ���� ���� ���� ���, 0
			return 0;
		} else {
			return 1;														// this.data1 ���� ���� Ŭ ���, +1 (���)
		}
		
		/* �������� ���� ���
		if(this.data1 < o.data1) {											// this.data1 ���� ���� ���� ���, -1 (����)
			return 1;
		} else if (this.data1 == o.data1) {									// this.data1 ���� ���� ���� ���, 0
			return 0;
		} else {
			return -1;														// this.data1 ���� ���� Ŭ ���, +1 (���)
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
		/* wrapper Ŭ������ comparable<E> �������̽��� compareTo() �޼ҵ带 �������ϰ� �ִ�. 
		 * 		wrapper Ŭ������ ���� TreeSet�� ������ ���ĵǾ� ����
		 */
		
		// 1. Integer
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);					// ū��
		Integer intValue2 = new Integer(10);					// ������
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);							// �������� ����
		
		// 2. String
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����");							// ������
		String str2 = new String("�ٶ�");							// ū��
		
		treeSet2.add(str2);
		treeSet2.add(str1);
		
		System.out.println(treeSet2);
		
		// 3. MyClass�� TreeSet�� ����Ǳ� ���ؼ��� Comparable<E> �������̽��� compareTo() �޼ҵ尡 �����ǵǾ�� �Ѵ�.
		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		
		//treeSet3.add(myClass1);									// ClassCastException �߻�
		//treeSet3.add(myClass2);									// ClassCastException �߻�
		
		//System.out.println(treeSet3);
		
		// 4. ���1 : MyComparableClass ��ü ũ�� �� : Comparable<E> �������̽��� compareTo() �޼ҵ尡 ������
		// ������ü�� ������ �ʿ�
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
		MyComparableClass myComparableClass2 = new MyComparableClass(5,3);
		MyComparableClass myComparableClass3 = new MyComparableClass(4,3);
		
		treeSet4.add(myComparableClass1);
		treeSet4.add(myComparableClass2);
		treeSet4.add(myComparableClass3);
		
		System.out.println(treeSet4);
		
		System.out.println("=====================================================");
		
		
		// 5. ���2 : ������ ��ü�� �������� �ʰ� TreeSet�� ������ ���
		// treeSet ������ ���ο� Comparator <E> �������̽��� ����, �͸� ��ü�� ����
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			// Comparator<MyClass>�� ������ �͸� �ڽ� Ŭ���� ���
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
