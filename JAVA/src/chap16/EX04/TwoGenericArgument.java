package chap16.EX04;

// 매개변수(Argument)가 2개인 Generic 클래스
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
		// KeyValue<String, Integer> kv1 = new KeyValue();								// 생성자의 매개변수는 생략가능
		
		kv1.setKey("사과");
		kv1.setValue(2000);
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("================================");
		
		KeyValue<Integer, String> kv2 = new KeyValue();
		
		kv2.setKey(3000);
		kv2.setValue("바나나");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		System.out.println("================================");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		
		kv3.setKey("평균값");
		kv3.setValue(2500.0);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		System.out.println("================================");
		
		// 특정 타입을 사용하지 않을 경우 Void 키를 사용
		KeyValue<String, Void> kv4 = new KeyValue();
		
		kv4.setKey("평균값");
		//kv4.setValue();											// Void 로 타입 설정을하면 사용할 수 없다.
		System.out.println(kv4.getKey());
		System.out.println(kv4.getValue());							// 기본 null 값 출력
		
	}

}
