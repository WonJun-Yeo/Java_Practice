package chap06_07.EX01;




class AA {
	String name;			// 필드(멤버) : 객체화(인스턴스화) 시켜야 사용이 가능하다. (RAM(메모리)의 Heep 공간에 값과 변수명이 저장)
	int age;				// 선언만 되어 있기 때문에 default 값이 할당된다.
	String email;
	
	AA() {}					// 기본생성자, 생략이 가능, 다른 생성자가 존재할 경우에는 생략해선 안된다.
	
	
	public String getName() {			// 메소드(멤버) : 개체화(인스턴스화) 시켜야 사용이 가능하다. (RAM(메모리)의 Heep 공간에 주소만 저장, 메소드 내부의 코드들은 클래스영역내의 메소드 영역에 저장)
		return name;
	}
	public void setName(String name) {	// void : 리턴값이 없다를 알려주는 식별자
		this.name = name;				// this : 자신의 객체(클래스), 파라미터와 변수명이 다르면 생략가능
	}
	public int getAge() {
		return age;						// return : 메소드를 호출하는 곳으로 변수의 값을 반환
	}
	public void setAge(int age) {		// parameter인 age를 int 자료형으로 받으면
		this.age = age;					// 그 자료형을 RAM(메모리)에 저장한다.
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


public class CreateObject {

	public static void main(String[] args) {
		
		AA aa = new AA();					
		/* AA클래스(설계도)를 aa(객체)를 생성, 이 객체는 stack영역에 저장되고 클래스 내부의 코드들이 heep 영역에 저장된다.
		 * AA() : 생성자, 객체의 필드값을 초기화, 생성자도 하나의 메소드
		 * 		1. 생성자명이 클래스명과 동일해야한다.
		 * 		2. 리턴타입이 없다.
		 * 		3. 생성자중 매개변수가 없는 생성자를 기본 생성자라고 한다.
		 * 		4. 기본생성자는 생략이 가능하다.
		 * 		5. 객체를 생성할 때, 반드시 생성자를 호출
		*/
		
		// 객체의 메소드 호출
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("==============");
		
		// 객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		System.out.println("==============");
		
		// 객체의 메소드에 값을 할당하고 호출
		aa.setName("홍길동");					// setter : 객체의 메모리에 값을 할당
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		System.out.println(aa.getName());	// getter : 객체의 메모리 값을 호출
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("==============");
		
		// 하나의 클래스로 여러개의 객체를 생성할 수 있다.
		
		AA bb = new AA();
		bb.setName("김유신");
		bb.setAge(50);
		bb.setEmail("bbb@bbb.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		System.out.println();
		
		AA cc = new AA();
		cc.setName("심사임당");
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
