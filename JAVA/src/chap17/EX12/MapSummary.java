package chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Map ���� : Key, Value
 * 1. HashMap : �Է¼����� ������� �������� ���, �޼ҵ� ����ȭ�� �Ǿ� ���� �ʴ�. �̱۽����� ȯ�濡 ���
 * 2. HashTable : ��� �޼ҵ尡 ����ȭ(Synchronized) �Ǿ� �ִ�. ��Ƽ ������ ȯ�濡�� ���
 * 3. LinkedHashMap : �Է¼����� �����ϰ� ������� ���
 * 4. TreeMap : Key�� �������� �������� ���ĵǾ� �Է�, Comparable<E>�������̽��� compareTo() or Comparator<E>�������̽��� compare() �޼ҵ尡 ������ �Ǿ���Ѵ�. (Wrapper Ŭ������ �̹� �����ǵǾ��ִ�.)
 */

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : �Է¼����� ��¼����� �ٸ���.
		Map <String, Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		
		System.out.println(hashMap);
		
		
		// 2. HashTable : �Է¼����� ��¼����� �ٸ���. <����ȭ �Ǿ� �ִ�.> <��Ƽ������ȯ��>
		Map <String, Integer> hashTable = new Hashtable<>();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable);
		
		// 3. LinkedHashTable : �Է¼����� ��¼����� �ٸ���. <����ȭ �Ǿ� �ִ�.> <��Ƽ������ȯ��>
		Map <String, Integer> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put("��", 30);
		linkedhashMap.put("��", 40);
		linkedhashMap.put("��", 50);
		linkedhashMap.put("��", 60);
		System.out.println(linkedhashMap);
		
		// 4. TreeMap : Key�� �������� ������������ ���ĵǾ� ����
		
		TreeMap <String, Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(treeMap);
		
		
		
	}

}
