package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_01 {

	public static void main(String[] args) {
		/* List�� �޼ҵ� 13�� 
		 * 1. ArrayList Ŭ���� : �̱� ������ ȯ�濡 ���
		 * 2. Vector Ŭ���� : ��Ƽ ������ ȯ�濡 ��� (��� �޼ҵ尡 ����ȭ(synchronized)�Ǿ��־� ����)
		 * 3. LinkedList
		 */
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// 1. add(E element) : ������ index�� �� �߰�
		aList1.add(3);aList1.add(4);aList1.add(5);aList1.add(6);
		System.out.println(aList1);
		System.out.println(aList1.size());
		
		System.out.println();
		
		// 2. add(index, E element) : ������ index�� �߰�, ������ �ڵ����� �ڷ� �и���.
		aList1.add(1, 6);
		System.out.println(aList1);
		System.out.println(aList1.size());
		
		System.out.println();
		
		// 3. addAll (�Ǵٸ� ����Ʈ ��ü) : ������ index �ڷ� �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�
		List<Integer> aList2 = new ArrayList();
		aList2.add(1);
		aList2.add(2);
		System.out.println(aList2);
		System.out.println(aList2.size());
		
		
		aList2.addAll(aList1);
		System.out.println(aList2);
		System.out.println(aList2.size());
		
		System.out.println();
		
		// 4. addAll (index, �Ǵٸ� ����Ʈ ��ü) : ������ index���� �߰�, ������ �ڵ����� �ڷ� �и���.
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		aList3.addAll(1, aList3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 5. set(index, E element) : index�� �ش��ϴ� ���� ����
		aList3.set(1, 5);
		aList3.set(3, 6);
		// aList3.set(6, 2);							// ���� index�� IndexOutOfBoundsException �߻�
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 6. remove(index) : index�� �ش��ϴ� ���� ����, index�� �ڵ����� �������.
		aList3.remove(1);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 7. remove (Object o) : ���� �ش��ϴ� ���� ����, index�� �ڵ����� �������.
		aList3.remove(new Integer(2));					// throw line�� �ִ� ���� ������ ������ �� �ִ� �����̶� ���̴�. �����ƴ�
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 8. clear() : ��ü ����
		aList3.clear();
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 9. isEmpty() : ���� ��� ������ true, ������� ������ false
		System.out.println(aList3.isEmpty());
		
		System.out.println();
		
		// 10.size() : index���� ���� ����
		aList3.add(1);aList3.add(2);aList3.add(3);aList3.add(4);
		System.out.println(aList3.size());
		
		System.out.println();
		
		// 11. get(index) : index�� �ش��ϴ� �� ��ȯ
		System.out.print(aList3.get(0) + " ");
		System.out.print(aList3.get(1) + " ");
		System.out.print(aList3.get(2) + " ");
		System.out.println(aList3.get(3));
		
		System.out.println();
		
		// 12. toArray() : List(����Ʈ) Array(�迭)�� ��ȯ
		Object[] object = aList3.toArray();					// �⺻������ toArray�� Object Ÿ���� �迭�κ�ȯ
		System.out.println(object);							// �迭�� �ٲ���� ������ ��ü�� ���� ����ϸ� �ּҰ��� ��µȴ�.
		
		System.out.println();
		
		// 13-1 toArray(T[] t) : Integer�� �ٷ� ĳ����
		Integer[] integer1 = aList3.toArray(new Integer[0]);			// ��ũ�Ⱑ �ڷ� �������� ���� ����� ���, ���� �ڷḸŭ ũ�Ⱑ �Ҵ�ȴ�. 
		System.out.println(Arrays.toString(integer1));					// ** ��ũ�⸦ �𸣴� ��찡 �ֱ� ������, 0���� ����Ͽ� �˸°� ��ũ�⸦ �Ҵ��� �� �ִ�.
		
		Integer[] integer2 = aList3.toArray(new Integer[6]);			// ��ũ�Ⱑ �ڷ� �������� ���� ����� ���, �� ����� null ���� �Ҵ�ȴ�.
		System.out.println(Arrays.toString(integer2));
		
	}

}
