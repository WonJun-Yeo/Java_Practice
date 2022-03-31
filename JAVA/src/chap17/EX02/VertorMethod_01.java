package chap17.EX02;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*	Vector �� ArrayList�� ��� �޼ҵ带 �����ϰ� ���
 * ��� �޼ҵ尡 ����ȭ(synchronized)�Ǿ��־� ��Ƽ�����忡�� ����ϱ⿡ �����ϴ�.
 */

public class VertorMethod_01 {

	public static void main(String[] args) {
		/* List�� �޼ҵ� 13�� 
		 * 1. ArrayList Ŭ���� : �̱� ������ ȯ�濡 ���
		 * 2. Vector Ŭ���� : ��Ƽ ������ ȯ�濡 ���
		 * 3. LinkedList
		 */
		
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E element) : ������ index�� �� �߰�
		vector1.add(3);vector1.add(4);vector1.add(5);vector1.add(6);
		System.out.println(vector1);
		System.out.println(vector1.size());
		
		System.out.println();
		
		// 2. add(index, E element) : ������ index�� �߰�, ������ �ڵ����� �ڷ� �и���.
		vector1.add(1, 6);
		System.out.println(vector1);
		System.out.println(vector1.size());
		
		System.out.println();
		
		// 3. addAll (�Ǵٸ� ����Ʈ ��ü) : ������ index �ڷ� �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�
		List<Integer> vector2 = new Vector();
		vector2.add(1);
		vector2.add(2);
		System.out.println(vector2);
		System.out.println(vector2.size());
		
		
		vector2.addAll(vector1);
		System.out.println(vector2);
		System.out.println(vector2.size());
		
		System.out.println();
		
		// 4. addAll (index, �Ǵٸ� ����Ʈ ��ü) : ������ index���� �߰�, ������ �ڵ����� �ڷ� �и���.
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		vector3.addAll(1, vector3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 5. set(index, E element) : index�� �ش��ϴ� ���� ����
		vector3.set(1, 5);
		vector3.set(3, 6);
		// vector3.set(6, 2);							// ���� index�� IndexOutOfBoundsException �߻�
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 6. remove(index) : index�� �ش��ϴ� ���� ����, index�� �ڵ����� �������.
		vector3.remove(1);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 7. remove (Object o) : ���� �ش��ϴ� ���� ����, index�� �ڵ����� �������.
		vector3.remove(new Integer(2));					// throw line�� �ִ� ���� ������ ������ �� �ִ� �����̶� ���̴�. �����ƴ�
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 8. clear() : ��ü ����
		vector3.clear();
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 9. isEmpty() : ���� ��� ������ true, ������� ������ false
		System.out.println(vector3.isEmpty());
		
		System.out.println();
		
		// 10.size() : index���� ���� ����
		vector3.add(1);vector3.add(2);vector3.add(3);vector3.add(4);
		System.out.println(vector3.size());
		
		System.out.println();
		
		// 11. get(index) : index�� �ش��ϴ� �� ��ȯ
		System.out.print(vector3.get(0) + " ");
		System.out.print(vector3.get(1) + " ");
		System.out.print(vector3.get(2) + " ");
		System.out.println(vector3.get(3));
		
		System.out.println();
		
		// 12. toArray() : List(����Ʈ) Array(�迭)�� ��ȯ
		Object[] object = vector3.toArray();					// �⺻������ toArray�� Object Ÿ���� �迭�κ�ȯ
		System.out.println(object);							// �迭�� �ٲ���� ������ ��ü�� ���� ����ϸ� �ּҰ��� ��µȴ�.
		
		System.out.println();
		
		// 13-1 toArray(T[] t) : Integer�� �ٷ� ĳ����
		Integer[] integer1 = vector3.toArray(new Integer[0]);			// ��ũ�Ⱑ �ڷ� �������� ���� ����� ���, ���� �ڷḸŭ ũ�Ⱑ �Ҵ�ȴ�. 
		System.out.println(Arrays.toString(integer1));					// ** ��ũ�⸦ �𸣴� ��찡 �ֱ� ������, 0���� ����Ͽ� �˸°� ��ũ�⸦ �Ҵ��� �� �ִ�.
		
		Integer[] integer2 = vector3.toArray(new Integer[6]);			// ��ũ�Ⱑ �ڷ� �������� ���� ����� ���, �� ����� null ���� �Ҵ�ȴ�.
		System.out.println(Arrays.toString(integer2));
		
	}

}
