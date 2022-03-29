package chap16.EX01;

/* Generic을 하용하지 않고 객체를 담을 클래스를 만들 경우
 * 객체를 저장할 클래스를 생성해서 객체 정보를 담을 수 있다.
 * 새로운 정보가 생기면, 매번 그 정보를 담을 클래스를 만들어 주어야한다.
 * 따라서, 매번 객체를 생성할 때마다 그 객체를 담을 클래스를 만들어주어야하는 번거로움이 있다.
 * 코드가 복잡해진다.
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

// 1. Apple을 담을 클래스
class Goods1 {														// 상품에 사과를 담은 클래스
	private Apple apple = new Apple("사과", 1000);

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

// 2. Pencil을 담을 클래스
class Goods2 {
	private Pencil pencil = new Pencil("연필", 2000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}

public class ProblemBeforeGeneric {

	public static void main(String[] args) {
		// 1. Goods1 클래스에 Apple 정보가 저장되어 있다.
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple("사과2", 2000));
		System.out.println(goods1.getApple());
		
		
		// 2. Goods2 클래스에 Pencil 정보가 저장되어 있다.
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("연필2", 3000));
		System.out.println(goods2.getPencil());

	}

}
