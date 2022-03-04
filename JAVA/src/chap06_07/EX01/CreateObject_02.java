package chap06_07.EX01;


class Aaa {
	String name;							// 필드들, 클래스블락에서 선언된 변수, 객체화(인스턴스와) 시켜야 사용 가능
	int age;								// Heep 영역의 변수들은 강제 초기화(default 값 할당)
	String email;							// 참조변수 : null, int : 0, double: 0.0, boolean : false
	double weight;
	boolean man;
	
	
	
	public String getName() {				// 메소드들, String : 리턴타입, getName() : 메소드명(매개변수)
		return name;						// return : 필드값을 반환해준다. 반환타입이 void가 아닌 경우 모두 있어야한다.
	}
	public void setName(String name) {
		this.name = name;					// this : 현재클래스, name : 변수이름(필드이름), 인풋되는 변수 & 받는변수이름 & 메로리이름이 모두 동일할 경우 사용해주어야 한다.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


public class CreateObject_02 {
	public static void main(String[] args) {
		// aaa 객체 생성, 같은 패키지내에 Aaa 클래스가 존재하기 때문에 import하지 않고 사용이 가능하다.
		Aaa aaa = new Aaa();				
		
		// 필드의 값을 출력
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		System.out.println("===============");
		
		// 필드의 값을 직접할당 후, 출력
		// 보안상 메모리에 값을 직접 할당하는 것은 권장되지 않는다.
		aaa.name = "윈터";
		aaa.age = 23;
		aaa.weight = 43;
		aaa.email = "aaa@aaa.com";
		aaa.man = false;
		
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		System.out.println("===============");
		
		// setter를 이용해 필드 값을 할당 후, getter를 이용해 출력
		// 보안상 필드값을 직접 할당하지 못할 경우 사용한다.
		// 메모리에 값을 넣을 때 제어할 수 있다. (범위설정가능)
		
		aaa.setName("박보영");
		aaa.setAge(33);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(false);
		aaa.setWeight(43);
		
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeight());
		
		// 하나의 클래스에서 여러개의 객체를 형성
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
	}
}
