package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*	ArrayList VS LinkedList
 * ArrayList : ���� ���ؼ� index�� ������ �ִ�.
 * 		���� : �˻� �ӵ��� ������.
 * 		���� : ���� �߰��ϰų� ������ ��, ���ϰ� ���� �ɷ� ������.
 * LinkedList : ������ ���� �յ��� ������ ������ ������, �˻��ÿ� index�� �Ҵ�ȴ�.
 * 		���� : ���� �߰��ϰų� ������ ��, ���ϰ� �ɸ��� �ʾ� ������. (�յ� ����(Linked)�� ��� ���� �����ϸ� �Ǳ� ����)
 * 		���� : �˻� �ӵ��� ������.
 * 
 */


public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		// 1. �����͸� �߰� ��, �ӵ���
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		
		long startTime = 0, endTime = 0;
		
		// 1-1 ArrayList ������ �߰� �ð�
		startTime = System.nanoTime();													// System.nanoTime() : ���� �������� ��� �ð��� �����ϴµ� ���
		for (int i = 0; i < 100000; i++) {
			aList.add(0, i);															// ��ĭ�� �и��鼭 index 0 �� 10������ �߰�
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �߰� �ð� : " + (endTime - startTime));
		
		// 1-2 LinkedList ������ �߰� �ð�
		
		startTime = System.nanoTime();													// System.nanoTime() : ���� �������� ��� �ð��� �����ϴµ� ���
		for (int i = 0; i < 100000; i++) {
			linkedlist.add(0, i);														// ��ĭ�� �и��鼭 index 0 �� 10������ �߰�
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �߰� �ð� : " + (endTime - startTime));
		
		
		System.out.println("=============================");
		
		
		// 2. �˻��� ��, �ӵ���
		
		// 2-1 ArrayList �˻� �ð�
		startTime = System.nanoTime();													// System.nanoTime() : ���� �������� ��� �ð��� �����ϴµ� ���
		for (int i = 0; i < 100000; i++) {
			aList.get(i);																// index 0 �� 10������ ���� �˻�
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� �˻� �ð� : " + (endTime - startTime));
		
		// 2-2 LinkedList �˻� �ð�
		startTime = System.nanoTime();													// System.nanoTime() : ���� �������� ��� �ð��� �����ϴµ� ���
		for (int i = 0; i < 100000; i++) {
			linkedlist.get(i);															// index 0 �� 10������ ���� �˻�
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� �˻� �ð� : " + (endTime - startTime));
		
		
		System.out.println("=============================");
		
		
		// 3. ���� ��, �ӵ���
		
		// 3-1 ArrayList �˻� �ð�
		startTime = System.nanoTime();													// System.nanoTime() : ���� �������� ��� �ð��� �����ϴµ� ���
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);															// index 0 �� 10������ ���� ����
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ���� �ð� : " + (endTime - startTime));
		
		// 3-2 LinkedList �˻� �ð�
		startTime = System.nanoTime();													// System.nanoTime() : ���� �������� ��� �ð��� �����ϴµ� ���
		for (int i = 0; i < 100000; i++) {
			linkedlist.remove(0);														// index 0 �� 10������ ���� ����
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ���� �ð� : " + (endTime - startTime));
	}

}
