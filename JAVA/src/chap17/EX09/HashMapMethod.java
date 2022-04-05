package chap17.EX09;

/* Map<Key, Value> : key & value �������� �ڷ� ����
 * Key�� �ߺ��� �� ������, Value�� �ߺ��� �� �ִ�.
 * 		Key�� Set���� �����ȴ�.
 * 		Key�� index�� �ƴϴ�.
 * 
 * 		
 * 
 */



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap1 = new HashMap<>();
		
		// 1. put(Key, Value)
		hMap1.put(2, "���ٶ�");
		hMap1.put(1, "������");
		hMap1.put(3, "�ٶ�");
		hMap1.put(3, "�ٴٴ�");							// key�� �ߺ��Ǿ� ����� �� ����. ���� ����
		
		System.out.println(hMap1);
		
		System.out.println("==========================");
		
		// 2. putAll(�ٸ� ��ü) : �ٸ� Map�� �����ؼ� �߰�
		
		Map<Integer, String> hMap2 = new HashMap<>();
		hMap2.put(1, "������");
		hMap2.putAll(hMap1);
		
		System.out.println(hMap2);
		
		System.out.println("==========================");
		
		// 3. replace(Key, Value) : Key�� ����� value�� Value�� ����
		hMap2.replace(1, "��ü������");
		hMap2.replace(4, "��ü����");							// key 4�� ����. �� ���, ������ ���� �ʰ� ���õȴ�.

		System.out.println(hMap2);
		
		System.out.println("==========================");
		
		// 4. replace(Key, oldValue, newValue) : Key�� ����� oldValue�� newValue�� ����

		hMap2.replace(1, "��ü������", "��ü������2");
		hMap2.replace(4, "���°�", "��ü����2");					// value�� ����. �� ���, ������ ���� �ʰ� ���õȴ�. (key �� value�� ��� ��ġ�ؾ� �Ѵ�.)

		System.out.println(hMap2);
		
		System.out.println("==========================");
		
		// 5. get(Object key) : Map�� ���� �����ö�, key�� �Ҵ�� value�� ��ȯ
		
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));

		System.out.println("==========================");
		
		// 6. containsKey(Object key) : Map�� �ش� key�� �����ϴ��� Ȯ���� true/false�� ��ȯ
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(4));

		System.out.println("==========================");
		
		// 7. containsValue(Object value) : Map�� �ش� value�� �����ϴ��� Ȯ���� true/false�� ��ȯ
		System.out.println(hMap2.containsValue("���ٶ�"));
		System.out.println(hMap2.containsValue("���°�"));

		System.out.println("==========================");
				
		// 8. Set<Key> KetSet() : Set �������� Ű�� �����Ͽ� �ٸ� set�� ������ �� ���
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet);

		System.out.println("==========================");
				
		// 9. Set<Map.Entry<key, value>> entrySet() : key�� value ��� �����Ͽ� �ٸ� set�� ������ �� ���
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);

		System.out.println("==========================");
		
		// 10. size() : key�� value ��Ʈ ����
		System.out.println(hMap2.size());

		System.out.println("==========================");
		
		// 11. remove(Object key) : key�� �Ҵ�� value ��� ����
		hMap2.remove(1);
		hMap2.remove(4);										// key 4�� ����. �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ �ȳ�
		System.out.println(hMap2);

		System.out.println("==========================");
				
		// 12. remove(Object key, Object value) : key�� value ��� ��ġ�� ��, �ش� key�� value ��� ����
		hMap2.remove(2, "���ٶ�");
		hMap2.remove(3, "Ʋ����");										// value�� �߸��Ǿ���. �ƹ��ϵ� �Ͼ�� �ʴ´�. ������ �ȳ�
		System.out.println(hMap2);

		System.out.println("==========================");

		
		// 13. clear() : ��� ����
		hMap2.clear();
		System.out.println(hMap2);
		
		
	}

}
