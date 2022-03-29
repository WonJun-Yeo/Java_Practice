package chap16.EX02;

/* Object는 모든 클래스의 부모이다.
 * 모든 클래스는 Object 타입으로 객체를 생성 할 수 있다.
 * Object의 장점 : 모든 객체를 담을 수 있다.
 * Object의 단점 : 매번 다운 캐스팅 후, 출력해야 한다.
 * 				 약한 타입 체그 : ClassCastException이 발생할 수 있다.
 */

class Apple {
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {										// 객체 자체를 출력구문에 넣을 시, toString() 메소드가 실행
		return "이름 : " + name + ", 가격 : " + price;
	}
}

class Pencil {
	String name;
	int price;
	
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {										// 객체 자체를 출력구문에 넣을 시, toString() 메소드가 실행
		return "이름 : " + name + ", 가격 : " + price;
	}
}

// Object 를 사용해서 모든 상품을 저장할 수 있다.
class Goods {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {							// 객체를 인풋값으로 주게되면 Object 타입으로 업캐스팅 된다.
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		// 1. Apple 저장 후, 출력
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("사과1", 1000));
		System.out.println((Apple) goods1.getObject());
		
		// 2. Pencil 저장 후, 출력
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("연필1", 2000));
		System.out.println((Pencil) goods2.getObject());
		
		// 3. 잘못된 캐스팅을 할 수 있다. (약한 타입 체크) : Object의 문제점
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("사과2", 3000));
		// System.out.println((Pencil) goods3.getObject());			// 컴파일 단계가 아닌, 실행 시 오류발생 (ClassCastException)
		
	}

}
