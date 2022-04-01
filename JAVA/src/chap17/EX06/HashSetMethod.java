package chap17.EX06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set<E elements> : index�� ������, �ߺ��� ���� ���� �� ����.
 * 1. HashSet : index�� ���� ���� ��� ��, ������� ������ �ʴ´�.
 * 2. LinkedHashSet : index�� ������ ������ Link �Ǿ��־� ���� ��½�, ������� ��µȴ�.
 * 3. TreeSet : ����� �� ���� ���ĵǾ� ����.( ascending : ��������, descending : �������� ). ��� ��, ���ɼ������ ���
 */



public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet();
		
		// 1. add(E element) �޼ҵ� : Set�� ���� �߰�
		hSet1.add("��"); hSet1.add("��"); hSet1.add("��");				// "��" �ߺ����� ���� �ʴ´�. error ������ �ʴ´�.
		System.out.println(hSet1);
		System.out.println(hSet1.toString());							// toString() �޼ҵ尡 �����ǵǾ��ִ�.
		
		System.out.println("=================================");
		
		// 2. addAll(�ٸ� set ��ü) �޼ҵ� : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� (�ߺ��� ���� ����)
		Set<String> hSet2 = new HashSet();
		hSet2.add("��"); hSet2.add("��");
		hSet2.addAll(hSet1);											// �ߺ��� ���� ������� �ʴ´�.
		System.out.println(hSet2);
		
		System.out.println("=================================");
		
		// 3. remove(Object o) : ������ ����								// ** List�� ��� index�� ����
		hSet2.remove("��");
		System.out.println(hSet2);
		
		System.out.println("=================================");
		
		// 4. clear() : ��� ����
		hSet2.clear();
		System.out.println(hSet2);
		
		System.out.println("=================================");
		
		// 5. isEmpty()	 : ��������� true, ������� ������ false
		System.out.println(hSet2.isEmpty());
		
		System.out.println("=================================");
		
		// 6. contains (Object o) : ���� Set�� �����ϸ� true, �������� ������ false
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("��"); hSet3.add("��"); hSet3.add("��"); 
		System.out.println(hSet3) ;
		System.out.println(hSet3.contains("��"));
		System.out.println(hSet3.contains("��"));
		
		System.out.println("=================================");
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(hSet3.size());
		
		System.out.println("=================================");
		
		// 8. iterator() : Set�� index�� ������ �ʴ´�. ���� ��ȸ�ϸ鼭 ���
		
		/* 1. hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
		 * 2. next() : ���� ���� ����ϰ� ���������� �̵�
		 * for ���� ���ȣ�� ��������ϱ� ������ ���Ұ�, enhanced for���� ���� �ֱ⶧���� ����
		 */
		
		Iterator<String> iterator = hSet3.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		
		for (String k : hSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("=================================");
		
		// 9. toArray() : Set�� ������ Object Ÿ���� �迭�� ��ȯ. Object Ÿ������ ��ȯ�Ǳ� ������ �ٿ�ĳ������ �ʿ��ϴ�.
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		System.out.println(objArray);
		for (int i = 0; i < objArray.length; i ++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		
		for (Object k : objArray) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("=================================");
		
		// 10. toArray(T[] t) : Set�� ������ ������ Ÿ���� �迭�� ��ȯ
		String[] strArray1 = hSet3.toArray(new String[0]);						// ������ ���� ũ�Ⱑ �ʿ��� �溸�� ���� ���, �����Ϸ��� �ʿ��� ���� ũ�⸸ŭ �ڵ� ����
		System.out.println(Arrays.toString(strArray1));
		
		for (String k : strArray1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================================");
		
		// 11. Set�� ���� ũ�⺸�� ũ�� ������ ��� ������ ���� null���� ����.
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		System.out.println("=================================");
		
		Set<Integer> intSet1 = new HashSet();
		
		intSet1.add(30);intSet1.add(50);intSet1.add(100);intSet1.add(10);
		
		// iterator ���, Enhanced for���� ����ؼ� ���
		
		Iterator<Integer> iterator2 = intSet1.iterator();
		
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();
		
		
		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}
		
	}

}
