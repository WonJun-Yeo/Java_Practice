package chap06_07.EX03;

class Car {
	String company;			// 필드 (인스턴스필드), 필드명과 필드의 값이 Heap 메모리에 저장
	String model;			// 인스턴스 : 객체화를 했을때 사용 가능한 필드
	String color;			
	double maxSpeed;
	
	
	Car (String a, String b, String c, double d) {
		this.company = a;							// this 키워드는 객체의 필드 변수를 뜻함, 지역변수와 객체변수명이 동일할 때 사용하는 것이 옳다.
		this.model = b;
		this.color = c;
		this.maxSpeed = d;
	}
	
	void work() {									// 메소드(인스턴스 메소드) : 메소드명과 메소드 포인터를 Heap 영역에 저장
		System.out.println("회사명 : " + company);	// 메소드의 전체 구문은 클래스 영역의 메소드 영역에 저장
		System.out.println("모델명 : " + model);
		System.out.println("생상 : " + color);
		System.out.println("최고속도 : " + maxSpeed);
	}
	
	
}


public class Q1 {

	public static void main(String[] args) {
		// 생성자를 통해서 기본 값을 할당후 메모리에 내용을 work()메소드를 사용해서 출려
		
		Car car = new Car("현대", "소나타", "화이트", 180.5);
		
		car.work();
	}

}
