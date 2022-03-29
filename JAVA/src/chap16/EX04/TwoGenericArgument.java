package chap16.EX04;

// �Ű�����(Argument)�� 2���� Generic Ŭ����
class KeyValue<k, v> {
	private k key;
	private v value;
	
	// getter & setter
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	
	
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
}



public class TwoGenericArgument {

	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		// KeyValue<String, Integer> kv1 = new KeyValue();								// �������� �Ű������� ��������
		
		kv1.setKey("���");
		kv1.setValue(2000);
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("================================");
		
		KeyValue<Integer, String> kv2 = new KeyValue();
		
		kv2.setKey(3000);
		kv2.setValue("�ٳ���");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		System.out.println("================================");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		
		kv3.setKey("��հ�");
		kv3.setValue(2500.0);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		System.out.println("================================");
		
		// Ư�� Ÿ���� ������� ���� ��� Void Ű�� ���
		KeyValue<String, Void> kv4 = new KeyValue();
		
		kv4.setKey("��հ�");
		//kv4.setValue();											// Void �� Ÿ�� �������ϸ� ����� �� ����.
		System.out.println(kv4.getKey());
		System.out.println(kv4.getValue());							// �⺻ null �� ���
		
	}

}
