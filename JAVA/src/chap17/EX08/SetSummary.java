package chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Set : �ߺ����� �ʴ� ���� ���� ( equals()&hashCode() �޼ҵ带 ������, WrapperŬ������ �����ǵǾ� �ִ�.), index�� ����.
 * 	1. HashSet : ������ ������ ���
 *  2. LinkedHashSet : �Է¼������ ���
 * 	3. TreeSet : ���ĵǾ� ������������ ���
 * 		�����ϱ����� Comparable<E> �������̽��� compareTo() ������ or Comparator<E> �������̽��� compare() ����
 */







public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		
		System.out.println(hashSet);
		System.out.println("==================================");
		
		// 2. LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		
		System.out.println(linkedhashSet);
		System.out.println("==================================");
		
		// 3. TreeSet
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		
		System.out.println(treeSet);
		System.out.println("==================================");
		
		
	}

}
