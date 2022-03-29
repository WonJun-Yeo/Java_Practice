package chap16.EX05;

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
	
	public void abc() {};
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
	
	public void bcd() {};
}

// Generic을 사용해서 객체를 저장 후, 값 호출

class Goods<T> {													// Generic 클래스
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}


public class Object_Generic {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<Apple>();					// goods1 은 Goods 데이터 타입이다.
		goods1.set(new Apple("사과1", 2000));
		System.out.println(goods1.get());							// goods1.get()은 Apple 데이터 타입의 객체를 가져온다.
		goods1.get().abc();											// Generic에서는 다운 캐스팅이 필요없다.
		
		
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("연필1", 3000));
		System.out.println(goods2.get());							// goods2.get()은 Pencil 데이터 타입의 객체를 가져온다.
	}

}
