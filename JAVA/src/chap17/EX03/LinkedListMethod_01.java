package chap17.EX03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* LinkedList �� ArrayList�� �ٸ��� ������� ���� ��, capacity ������ �Ұ����ϴ�.
 * �������� ���� �������� index�� �ƴ� �յ� ��ü�� ��ġ ������ ����
 * ��ҿ��� index�� ���ٰ� �۵��� �� index�� �ο��Ѵ�.
 * ������ index��ȣ�� �ٷ� ã�� �� �� ���� �յ� ��ü ������ ã�ư����ϹǷ� �˻��� ������.
 * �߰�, ������ ������.
 */

public class LinkedListMethod_01 {

	public static void main(String[] args) {
		/* List�� �޼ҵ� 13�� 
		 * 1. ArrayList Ŭ���� : �̱� ������ ȯ�濡 ���. �߰�,������ ������ �˻��� ������.
		 * 2. LinkedList Ŭ���� : ��Ƽ ������ ȯ�濡 ���
		 * 3. LinkedList : �߰�,������ ������ �˻��� ������.
		 */
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		// 1. add(E element) : ������ index�� �� �߰�
		linkedlist1.add(3);linkedlist1.add(4);linkedlist1.add(5);linkedlist1.add(6);
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.size());
		
		System.out.println();
		
		// 2. add(index, E element) : ������ index�� �߰�, ������ �ڵ����� �ڷ� �и���.
		linkedlist1.add(1, 6);
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.size());
		
		System.out.println();
		
		// 3. addAll (�Ǵٸ� ����Ʈ ��ü) : ������ index �ڷ� �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�
		List<Integer> linkedlist2 = new LinkedList();
		linkedlist2.add(1);
		linkedlist2.add(2);
		System.out.println(linkedlist2);
		System.out.println(linkedlist2.size());
		
		
		linkedlist2.addAll(linkedlist1);
		System.out.println(linkedlist2);
		System.out.println(linkedlist2.size());
		
		System.out.println();
		
		// 4. addAll (index, �Ǵٸ� ����Ʈ ��ü) : ������ index���� �߰�, ������ �ڵ����� �ڷ� �и���.
		List<Integer> linkedlist3 = new LinkedList<>();
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.add(3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		linkedlist3.addAll(1, linkedlist3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 5. set(index, E element) : index�� �ش��ϴ� ���� ����
		linkedlist3.set(1, 5);
		linkedlist3.set(3, 6);
		// linkedlist3.set(6, 2);							// ���� index�� IndexOutOfBoundsException �߻�
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 6. remove(index) : index�� �ش��ϴ� ���� ����, index�� �ڵ����� �������.
		linkedlist3.remove(1);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 7. remove (Object o) : ���� �ش��ϴ� ���� ����, index�� �ڵ����� �������.
		linkedlist3.remove(new Integer(2));					// throw line�� �ִ� ���� ������ ������ �� �ִ� �����̶� ���̴�. �����ƴ�
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 8. clear() : ��ü ����
		linkedlist3.clear();
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 9. isEmpty() : ���� ��� ������ true, ������� ������ false
		System.out.println(linkedlist3.isEmpty());
		
		System.out.println();
		
		// 10.size() : index���� ���� ����
		linkedlist3.add(1);linkedlist3.add(2);linkedlist3.add(3);linkedlist3.add(4);
		System.out.println(linkedlist3.size());
		
		System.out.println();
		
		// 11. get(index) : index�� �ش��ϴ� �� ��ȯ
		System.out.print(linkedlist3.get(0) + " ");
		System.out.print(linkedlist3.get(1) + " ");
		System.out.print(linkedlist3.get(2) + " ");
		System.out.println(linkedlist3.get(3));
		
		System.out.println();
		
		// 12. toArray() : List(����Ʈ) Array(�迭)�� ��ȯ
		Object[] object = linkedlist3.toArray();							// �⺻������ toArray�� Object Ÿ���� �迭�κ�ȯ
		System.out.println(object);											// �迭�� �ٲ���� ������ ��ü�� ���� ����ϸ� �ּҰ��� ��µȴ�.
		
		System.out.println();
		
		// 13-1 toArray(T[] t) : Integer�� �ٷ� ĳ����
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]);			// ��ũ�Ⱑ �ڷ� �������� ���� ����� ���, ���� �ڷḸŭ ũ�Ⱑ �Ҵ�ȴ�. 
		System.out.println(Arrays.toString(integer1));						// ** ��ũ�⸦ �𸣴� ��찡 �ֱ� ������, 0���� ����Ͽ� �˸°� ��ũ�⸦ �Ҵ��� �� �ִ�.
		
		Integer[] integer2 = linkedlist3.toArray(new Integer[6]);			// ��ũ�Ⱑ �ڷ� �������� ���� ����� ���, �� ����� null ���� �Ҵ�ȴ�.
		System.out.println(Arrays.toString(integer2));
		
	}

}
