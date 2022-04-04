package chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* TreeSet : ������ ���� ������ Set�� ���ĵǾ� ����, ��� �� ������������ ���ĵǾ� ��� (ascending : ��������, descending : ��������)
 * Set �������̽�> SortedSet �������̽� (���ĸ޼ҵ�����)> NavigableSet �������̽� (�˻��޼ҵ�����) > TreeSet Ŭ����
 * TreeSet Ÿ������ ��ü�� �����ؾ� ���� �� �˻� �޼ҵ尡 ���� (������ ���� �� �˻��̹Ƿ� �� TreeSet Ÿ������ ����)
 * Set �������̽��� ��� �޼ҵ� ���� ����� ����
 */


public class TreeSetMethod {
	public static void main(String[] args) {
		// TreeSet�� Set�� ��� �޼ҵ带 ����� �� �ִ�.
		
		// TreeSet �� ���� �־��� ��� �������� ���ĵǾ� ���� Set�� ����, ��� �� �������� ���ķ� ���
		TreeSet<Integer> treeSet = new TreeSet<>();						// Type�� TreeSet���� �����ؾ� ���İ� �˻��� ����� �� �ִ�.
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);									// ū ������ �����ϴ��� ������������ �����Ͽ� ����ǰ� ��µȴ�.
		
		System.out.println("==============================");
		
		// TreeSet������ ��� ������ �޼ҵ�
		
		
		
		// ������ �˻�
		
		// 1. first() : ���� ó������ ����
		System.out.println(treeSet.first());
		
		System.out.println("==============================");
		
		// 2. last() : ���� ���������� ����
		System.out.println(treeSet.last());
		
		System.out.println("==============================");
		
		// 3. lower(E element) : element�� �������� ������ ���� �� �ϳ��� ����
		System.out.println(treeSet.lower(26));
		
		System.out.println("==============================");
		
		// 4. higher(E element) : element�� �������� ������ ū �� �ϳ��� ����
		System.out.println(treeSet.higher(26));
		
		System.out.println("==============================");
		
		// 5. floor (E element) : element�� �������� ������ �۰ų� ���� �� �ϳ��� ���� 
		System.out.println(treeSet.floor(26));
		System.out.println(treeSet.floor(25));
		
		System.out.println("==============================");
		
		// 6. ceiling (E element) : element�� �������� ������ ũ�ų� ���� �� �ϳ��� ����
		System.out.println(treeSet.ceiling(26));
		System.out.println(treeSet.ceiling(27));
		
		System.out.println("==============================");
		
		
		
		// ������ ���� ������ (�����ͼ� �������� �� ���� �������.)
		
		// 7. pollFirse() : ù ��° �� ������
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		
		System.out.println();
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());
		}
		
		System.out.println();
		
		System.out.println(treeSet.size());
		
		System.out.println("==============================");
		
		// 8. pollLast() : ������ �� ������
		for (int i = 50; i > 0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		System.out.println();
		
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		
		System.out.println();
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		
		System.out.println();
		
		System.out.println(treeSet.size());
		
		System.out.println("==============================");
		
		/* 9. SortedSet<E> headSet(E element) : ������ ����ϱ� ���ؼ��� SortedSet ��ü�� �������־�� �Ѵ�.
		 * 		SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set
		 * 		headSet(E element) : element�� �������� Head ���� ���� ����, element ���� ������
		 */
		for (int i = 50; i > 0; i -=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		System.out.println();
		
		SortedSet<Integer> sSet = treeSet.headSet(20);				// headSet(20)�� SortedSet���� ���ϰ��� ������
		// Set<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		System.out.println("==============================");
		
		
		/* 10. NavigableSet<E> headSet(E element, boolean inclusive)
		 * 		headSet(E element, true) : element�� �������� Head ���� ���� ����, element ���� ����
		 * 		headSet(E element, false) : element�� �������� Head ���� ���� ����, element ���� ������
		 */
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		// Set<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet);
		
		System.out.println("==============================");
		
		/* 11. SortedSet<E> tailSet(E element) : ������ ����ϱ� ���ؼ��� SortedSet ��ü�� �������־�� �Ѵ�.
		 * 		SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set
		 * 		tailSet(E element) : element�� �������� Tail ���� ���� ����, element ���� ����
		 */
		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);				// headSet(20)�� SortedSet���� ���ϰ��� ������
		// Set<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		System.out.println("==============================");
		
		/* 12. NavigableSet<E> tailSet(E element, boolean inclusive)
		 * 		tailSet(E element, true) : element�� �������� Tail ���� ���� ����, element ���� ����
		 * 		tailSet(E element, false) : element�� �������� Tail ���� ���� ����, element ���� ������
		 */
		
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, true);
		// Set<Integer> nSet2 = treeSet.tailSet(20, true);
		System.out.println(nSet2);
		
		System.out.println("==============================");
		
		// 13. SortedSet<E> subSet(E element, E element) : Ư�� ������ ���� set���� ���� ��
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3);									// ���۰��� ����, ������ �������� ��� ���α׷����� �⺻�̴�.
		
		System.out.println("==============================");
		
		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet3 = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet3);
		
		System.out.println("==============================");
		
		// 15. NavigableSet<E> descendingSet() : ���� ������ �ݴ�� ����
		
		NavigableSet<Integer> nSet4 = treeSet.descendingSet();
		
		System.out.println(nSet4);
		
		NavigableSet<Integer> nSet5 = nSet4.descendingSet();
		
		System.out.println(nSet5);
		
		
	}

}
