package chap17.EX07;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

/* Set<E elements> : index�� ������, �ߺ��� ���� ���� �� ����.
 * 1. LinkedLinkedHashSet : index�� ���� ���� ��� ��, ������� ������ �ʴ´�.
 * 2. LinkedLinkedLinkedHashSet : index�� ������ ������ Link �Ǿ��־� ���� ��½�, �Է��� ������� ��µȴ�.
 * 3. TreeSet : ����� �� ���� ũ������� ���ĵǾ� ����.( ascending : ��������, descending : �������� ). ��� ��, ���ɼ������ ��� ** ���� �˻��� �����̱� ������, Ÿ���� TreeSet���� �ξ���Ѵ�.
 */

/*	LinkedLinkedLinkedHashSet
 * 1. LinkedLinkedHashSet�� ������
 * 		��� �޼ҵ尡 ����
 * 		�ߺ��� ���� �������� �ʴ´�.
 * 		index�� ����. (for������ ����� �� ����, enhanced for���δ� ����� �����ϴ�.)
 * 2. LinkedLinkedHashSet�� ������
 * 		�Է��� ������� ��µȴ�.
 */


public class LinkedHashSetMethod {

	public static void main(String[] args) {
		Set<String> linkedHashSet1 = new LinkedHashSet<>();										// Set�� generic Ÿ�Ժ����� wrapper Ŭ������ ����� ���, equals()�� hashCode()�� ������ �Ǿ��־� �ߺ����� ������� �ʴ´�.
		
		// 1. add(E element) �޼ҵ� : Set�� ���� �߰�
		linkedHashSet1.add("��"); linkedHashSet1.add("��"); linkedHashSet1.add("��");				// "��" �ߺ����� ���� �ʴ´�. error ������ �ʴ´�.
		System.out.println(linkedHashSet1);
		System.out.println(linkedHashSet1.toString());							// toString() �޼ҵ尡 �����ǵǾ��ִ�.
		
		System.out.println("=================================");
		
		// 2. addAll(�ٸ� set ��ü) �޼ҵ� : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� (�ߺ��� ���� ����)
		Set<String> linkedHashSet2 = new LinkedHashSet<>();
		linkedHashSet2.add("��"); linkedHashSet2.add("��");
		linkedHashSet2.addAll(linkedHashSet1);											// �ߺ��� ���� ������� �ʴ´�.
		System.out.println(linkedHashSet2);												// �Է� ������� ���
		
		System.out.println("=================================");
		
		// 3. remove(Object o) : ������ ����								// ** List�� ��� index�� ����
		linkedHashSet2.remove("��");
		System.out.println(linkedHashSet2);
		
		System.out.println("=================================");
		
		// 4. clear() : ��� ����
		linkedHashSet2.clear();
		System.out.println(linkedHashSet2);
		
		System.out.println("=================================");
		
		// 5. isEmpty()	 : ��������� true, ������� ������ false
		System.out.println(linkedHashSet2.isEmpty());
		
		System.out.println("=================================");
		
		// 6. contains (Object o) : ���� Set�� �����ϸ� true, �������� ������ false
		Set<String> linkedHashSet3 = new LinkedHashSet<>();
		linkedHashSet3.add("��"); linkedHashSet3.add("��"); linkedHashSet3.add("��"); 
		System.out.println(linkedHashSet3) ;
		System.out.println(linkedHashSet3.contains("��"));
		System.out.println(linkedHashSet3.contains("��"));
		
		System.out.println("=================================");
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(linkedHashSet3.size());
		
		System.out.println("=================================");
		
		// 8. iterator() : Set�� index�� ������ �ʴ´�. ���� ��ȸ�ϸ鼭 ���
		
		/* 1. hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
		 * 2. next() : ���� ���� ����ϰ� ���������� �̵�
		 * for ���� ���ȣ�� ��������ϱ� ������ ���Ұ�, enhanced for���� ���� �ֱ⶧���� ����
		 */
		
		Iterator<String> iterator = linkedHashSet3.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		
		for (String k : linkedHashSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("=================================");
		
		// 9. toArray() : Set�� ������ Object Ÿ���� �迭�� ��ȯ. Object Ÿ������ ��ȯ�Ǳ� ������ �ٿ�ĳ������ �ʿ��ϴ�.
		Object[] objArray = linkedHashSet3.toArray();
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
		String[] strArray1 = linkedHashSet3.toArray(new String[0]);						// ������ ���� ũ�Ⱑ �ʿ��� �溸�� ���� ���, �����Ϸ��� �ʿ��� ���� ũ�⸸ŭ �ڵ� ����
		System.out.println(Arrays.toString(strArray1));
		
		for (String k : strArray1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=================================");
		
		// 11. Set�� ���� ũ�⺸�� ũ�� ������ ��� ������ ���� null���� ����.
		String[] strArray2 = linkedHashSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		System.out.println("=================================");
		
		Set<Integer> intSet1 = new LinkedHashSet<>();
		
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
