package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* java.lang ��Ű���� Ŭ�������� import�� �ʿ����.
 * �� �� �ٸ� ��Ű������ import�� ���־�� �Ѵ�.
 */


/* Collection (�÷���) : ������ �ڷ����� ����, ���� ũ�Ⱑ ����
 * Array (�迭) : ������ �ڷ����� ����, ������ ���� ũ�⸦ ����, ���� ũ�Ⱑ ����
 */



/* List<E>
 * 1. Generic interface �̸�, �پ��� ������ Ÿ���� ����� �� �ִ�.
 * 2. index(���ȣ)�� ������ �ִ�.
 * 3. toString() �޼ҵ尡 �������̵��Ǿ� �־�, ��ü���� ���� ����Ѵ�.
 * List<E>�� ������ Ŭ����
 * 		- ArrayList<E> : �̱� ������ ȯ�濡�� ���, �˻��� ������ ���� �߰��ϰų� ������ �� ������.
 * 		- Vector<E> : ��Ƽ ������ ȯ�濡�� ���, ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�.
 * 		- LinkedList<E> : �˻��� ������ ���� �߰��ϰų� ������ �� ������.
 */

public class ArrayList_01 {
	public static void main(String[] args) {
		// 1. Array(�迭)
		String[] array = new String[] {"��", "��", "��", "��", "��","��", "��"};
		System.out.println(array.length);		// 7
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);		// 7
		
		// Arrays.toString(�迭����) : �迭�� ��ü ���
		System.out.println(Arrays.toString(array));
		
		// for �� ����ؼ� ���
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println();
		
		// Enhanced For ���� ����ؼ� ���
		for (String k : array) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		// 2. List : �������̽�, ��ü ������ �� �� ����. Ÿ���� ���� ����
		List<String> aList1 = new ArrayList<String>();						// �ϼ��� ����
		List<String> aList2 = new ArrayList<>();							// �������� ������ Ÿ�� ��������
		List<String> aList3 = new ArrayList();								// �������� ������ Ÿ�� ����� ��������
		
		// List���� ���� ���� ��� : aList.size()	;
		System.out.println(aList1.size());		// 0
		
		// List�� �� �Ҵ��ϱ� : aList.add(���Ҵ�), ���ϸ������� ���� �߰�
		aList1.add("��");
		aList1.add("��");
		aList1.add("��");
		aList1.add("��");
		aList1.add("��");
		System.out.println(aList1.size());		// 5
		
		// List�� ����� �� ���� : aList.remove(������ ��), ���ŵ� ��� ����� ������ index���� �������.
		aList1.remove("��");
		aList1.remove("��");
		System.out.println(aList1.size());		// 3
		
		// List�� index�� ������ �ִ�. (For)
		for (int i = 0; i < aList1.size(); i++) {
			System.out.print(aList1.get(i) + ", ");
		}
		
		System.out.println();
		
		// Enhanced For ���� ����ؼ� ���
		for (String k : aList1) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		// ��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList1);											// 
		
		
		
		
		
		
	}
}
