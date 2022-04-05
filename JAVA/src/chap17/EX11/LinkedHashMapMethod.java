package chap17.EX11;

import java.util.Hashtable;
import java.util.LinkedHashMap;
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
 * LinkedHashMap : �Է� ������� ���
 * 
 * 
 * HashMap VS LinkedHashMap
 * HashMap<Key, Value> : �Է� ������ ��� ������ �ٸ� �� �ִ�.
 * LinkedHashMap<Key, Value> : Key�� �� �� ���� ������ ������ ����Ǿ� �ִ�. �Է� ������ ��� ������ ����.
 */


public class LinkedHashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> lhMap1 = new LinkedHashMap<>();
		
		// 1. put(Key, Value)
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
		lhMap1.put(3, "�ٴٴ�");							// key�� �ߺ��Ǿ� ����� �� ����. ���� ����
		
		System.out.println(lhMap1);
		
		System.out.println("==========================");
		
		// 2. putAll(�ٸ� ��ü) : �ٸ� Map�� �����ؼ� �߰�
		
		Map<Integer, String> lhMap2 = new Hashtable<>();
		lhMap2.put(1, "������");
		lhMap2.putAll(lhMap1);
		
		System.out.println(lhMap2);
		
		System.out.println("==========================");
		
		// 3. replace(Key, Value) : Key�� ����� value�� Value�� ����
		lhMap2.replace(1, "��ü������");
		lhMap2.replace(4, "��ü����");							// key 4�� ����. �� ���, ������ ���� �ʰ� ���õȴ�.

		System.out.println(lhMap2);
		
		System.out.println("==========================");
		
		// 4. replace(Key, oldValue, newValue) : Key�� ����� oldValue�� newValue�� ����

		lhMap2.replace(1, "��ü������", "��ü������2");
		lhMap2.replace(4, "���°�", "��ü����2");					// value�� ����. �� ���, ������ ���� �ʰ� ���õȴ�. (key �� value�� ��� ��ġ�ؾ� �Ѵ�.)

		System.out.println(lhMap2);
		
		System.out.println("==========================");
		
		// 5. get(Object key) : Map�� ���� �����ö�, key�� �Ҵ�� value�� ��ȯ
		
		System.out.println(lhMap2.get(1));
		System.out.println(lhMap2.get(2));
		System.out.println(lhMap2.get(3));

		System.out.println("==========================");
		
		// 6. containsKey(Object key) : Map�� �ش� key�� �����ϴ��� Ȯ���� true/false�� ��ȯ
		System.out.println(lhMap2.containsKey(1));
		System.out.println(lhMap2.containsKey(4));

		System.out.println("==========================");
		
		// 7. containsValue(Object value) : Map�� �ش� value�� �����ϴ��� Ȯ���� true/false�� ��ȯ
		System.out.println(lhMap2.containsValue("���ٶ�"));
		System.out.println(lhMap2.containsValue("���°�"));

		System.out.println("==========================");
				
		// 8. Set<Key> KetSet() : Set �������� Ű�� �����Ͽ� �ٸ� set�� ������ �� ���
		Set<Integer> keySet = lhMap2.keySet();
		System.out.println(keySet);

		System.out.println("==========================");
				
		// 9. Set<Map.Entry<key, value>> entrySet() : key�� value ��� �����Ͽ� �ٸ� set�� ������ �� ���
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);

		System.out.println("==========================");
		
		// 10. size() : key�� value ��Ʈ ����
		System.out.println(lhMap2.size());

		System.out.println("==========================");
		
		// 11. remove(Object key) : key�� �Ҵ�� value ��� ����
		lhMap2.remove(1);
		lhMap2.remove(4);										// key 4�� ����. �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ �ȳ�
		System.out.println(lhMap2);

		System.out.println("==========================");
				
		// 12. remove(Object key, Object value) : key�� value ��� ��ġ�� ��, �ش� key�� value ��� ����
		lhMap2.remove(2, "���ٶ�");
		lhMap2.remove(3, "Ʋ����");										// value�� �߸��Ǿ���. �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ �ȳ�
		System.out.println(lhMap2);

		System.out.println("==========================");

		
		// 13. clear() : ��� ����
		lhMap2.clear();
		System.out.println(lhMap2);
		
		
	}
}
