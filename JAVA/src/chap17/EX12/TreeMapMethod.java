package chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/* TreeMap : ����ÿ� Key�� �������� ������������ ���ĵǾ� ���� �� ���
 * Key�� �Ϲ� ��ü�� ������ ��, Comparable �������̽��� compareTo() �޼ҵ带 ������ �ϰų� Comparator �������̽��� compare()�޼ҵ带 ������ �ؾ� �Ѵ�. (����)
 * 		1. Comparable �������̽��� compareTo() �޼ҵ带 ������ ��� : ��ü ���� �ʿ�
 * 		2. Comparator �������̽��� compare()�޼ҵ带 ������ : ��ü ���� �ʿ�X
 * 
 * Map <K,V> > SortedMap<K,V> (���ĸ޼ҵ�) > NavigableMap<K,V> (�˻��޼ҵ�) > TreeMap<K,V>
 * 		TreeMap�� ����� ��, Ÿ���� TreeMap���� �����ؾ� ���İ� �˻� �޼ҵ带 ����� �� �ִ�.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class TreeMapMethod {

	public static void main(String[] args) {
		// TreeMap<K, V> �� Map<K, V> �޼ҵ带 ��� ���, �߰������� SortedMap, NavigableMap �޼ҵ� ���
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		for (int i = 20; i > 0; i -=2) {
			treeMap.put(i, i + "��° ������");
		}
		
		System.out.println(treeMap);												// ������������ ���ĵǾ� ���� �� ���
		
		System.out.println("===========================================");
		
		
		// 1. firstKey() : ���� ù��° Key ���� ��ȯ
		System.out.println(treeMap.firstKey());

		System.out.println("===========================================");
		
		
		// 2. firstEntry() : ���� ù��° Key ���� Value ���� ��ȯ 
		System.out.println(treeMap.firstEntry());

		System.out.println("===========================================");
			
		
		// 3. lastKey()	: ���� ������ Key ���� ��ȯ
		System.out.println(treeMap.lastKey());

		System.out.println("===========================================");
			
		
		// 4. firstEntry() : ���� ù��° Key ���� Value ���� ��ȯ 
		System.out.println(treeMap.lastEntry());

		System.out.println("===========================================");
		
		
		// 5. lowerKey(K key) : �Է¹��� Key ������ ���� Ű�� �ϳ� ���
		System.out.println(treeMap.lowerEntry(10));

		System.out.println("===========================================");
		
		
		// 6. higherKey(K key) : �Է¹��� Key ������ ���� Ű�� �ϳ� ���
		System.out.println(treeMap.higherEntry(10));

		System.out.println("===========================================");
			
		
		// 7. pollFirstEntry() : ù ��° key�� value ���� ������ ���� (��������� �����)
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		System.out.println("===========================================");
		
		
		// 8. pollLastEntry() :������ key�� value ���� ������ ���� (��������� �����)	
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		System.out.println("===========================================");
		
		
		// 9. SortedMap<K,V> headMap(k Key) : �Է¹��� key ���� �������� head�� �����͸� SortedŸ������ ��ȯ
		SortedMap<Integer,String> sMap = treeMap.headMap(8);
		System.out.println(sMap);

		System.out.println("===========================================");
		
		
		// 10. NavigableMap<K,V> headMap(k Key, boolean inclusive) : �Է¹��� key ���� ����(true) or ������(false)�Ͽ� �������� head�� �����͸�NavigableMap Ÿ������ ��ȯ
		NavigableMap<Integer,String> nMap = treeMap.headMap(8, true);
		System.out.println(nMap);
		
		System.out.println("===========================================");
		
		
		// 11. SortedMap<K,V> tailMap(k Key) : �Է¹��� key ���� �������� head�� �����͸� SortedŸ������ ��ȯ
		SortedMap<Integer,String> sMap2 = treeMap.tailMap(8);
		System.out.println(sMap2);

		System.out.println("===========================================");
		
		
		// 12. NavigableMap<K,V> headMap(k Key, boolean inclusive) : �Է¹��� key ���� ����(true) or ������(false)�Ͽ� �������� head�� �����͸�NavigableMap Ÿ������ ��ȯ
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false);
		System.out.println(nMap2);

		System.out.println("===========================================");
		
		// 13. SortedMap<K,V> subMap(k fromKey, k toKey)		
		SortedMap<Integer,String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);

		System.out.println("===========================================");
		
		// 14. NavigableMap<K, V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer,String> subMap2 = treeMap.subMap(6, true, 10, false);
		System.out.println(subMap2);

		System.out.println("===========================================");
		
		// 15. NavigableMap<K> descendingKeySet() : Key���� �������� key�� �ݴ�� �����Ͽ� Set Ÿ������ ��ȯ
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		
		System.out.println(nSet.descendingSet());
		
		System.out.println("===========================================");
				
		// 16. NavigableMap<K, V> descendingMap() : ���� ������ �ݴ�� ���
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		
		System.out.println(nvMap.descendingMap());
		
		System.out.println("===========================================");
		
		
		
		
		
		
		
		
		
	}

}
