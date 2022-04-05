package chap17.EX10;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* Map<Key, Value> : key & value �������� �ڷ� ����
 * Key�� �ߺ��� �� ������, Value�� �ߺ��� �� �ִ�.
 * 		Key�� Set���� �����ȴ�.
 * 		Key�� index�� �ƴϴ�.
 * 
 * HashMap : ����� �����ϰ� ���, ���� ������ ȯ�濡 ����, ��� �޼ҵ尡 ����ȭ �Ǿ����� ����.
 * HashTable : ��� �޼ҵ尡 ����ȭ(Synchronized) �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 �����ϴ�.		
 * 			��� �޼ҵ�� HashMap�� �����ϴ�.
 */



public class HashTableMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hTable1 = new Hashtable<>();
		
		// 1. put(Key, Value)
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
		hTable1.put(3, "�ٴٴ�");							// key�� �ߺ��Ǿ� ����� �� ����. ���� ����
		
		System.out.println(hTable1);
		
		System.out.println("==========================");
		
		// 2. putAll(�ٸ� ��ü) : �ٸ� Map�� �����ؼ� �߰�
		
		Map<Integer, String> hTable2 = new Hashtable<>();
		hTable2.put(1, "������");
		hTable2.putAll(hTable1);
		
		System.out.println(hTable2);
		
		System.out.println("==========================");
		
		// 3. replace(Key, Value) : Key�� ����� value�� Value�� ����
		hTable2.replace(1, "��ü������");
		hTable2.replace(4, "��ü����");							// key 4�� ����. �� ���, ������ ���� �ʰ� ���õȴ�.

		System.out.println(hTable2);
		
		System.out.println("==========================");
		
		// 4. replace(Key, oldValue, newValue) : Key�� ����� oldValue�� newValue�� ����

		hTable2.replace(1, "��ü������", "��ü������2");
		hTable2.replace(4, "���°�", "��ü����2");					// value�� ����. �� ���, ������ ���� �ʰ� ���õȴ�. (key �� value�� ��� ��ġ�ؾ� �Ѵ�.)

		System.out.println(hTable2);
		
		System.out.println("==========================");
		
		// 5. get(Object key) : Map�� ���� �����ö�, key�� �Ҵ�� value�� ��ȯ
		
		System.out.println(hTable2.get(1));
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));

		System.out.println("==========================");
		
		// 6. containsKey(Object key) : Map�� �ش� key�� �����ϴ��� Ȯ���� true/false�� ��ȯ
		System.out.println(hTable2.containsKey(1));
		System.out.println(hTable2.containsKey(4));

		System.out.println("==========================");
		
		// 7. containsValue(Object value) : Map�� �ش� value�� �����ϴ��� Ȯ���� true/false�� ��ȯ
		System.out.println(hTable2.containsValue("���ٶ�"));
		System.out.println(hTable2.containsValue("���°�"));

		System.out.println("==========================");
				
		// 8. Set<Key> KetSet() : Set �������� Ű�� �����Ͽ� �ٸ� set�� ������ �� ���
		Set<Integer> keySet = hTable2.keySet();
		System.out.println(keySet);

		System.out.println("==========================");
				
		// 9. Set<Map.Entry<key, value>> entrySet() : key�� value ��� �����Ͽ� �ٸ� set�� ������ �� ���
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);

		System.out.println("==========================");
		
		// 10. size() : key�� value ��Ʈ ����
		System.out.println(hTable2.size());

		System.out.println("==========================");
		
		// 11. remove(Object key) : key�� �Ҵ�� value ��� ����
		hTable2.remove(1);
		hTable2.remove(4);										// key 4�� ����. �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ �ȳ�
		System.out.println(hTable2);

		System.out.println("==========================");
				
		// 12. remove(Object key, Object value) : key�� value ��� ��ġ�� ��, �ش� key�� value ��� ����
		hTable2.remove(2, "���ٶ�");
		hTable2.remove(3, "Ʋ����");										// value�� �߸��Ǿ���. �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ �ȳ�
		System.out.println(hTable2);

		System.out.println("==========================");

		
		// 13. clear() : ��� ����
		hTable2.clear();
		System.out.println(hTable2);
		
		
	}

}
