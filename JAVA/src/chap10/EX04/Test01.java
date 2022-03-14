package chap10.EX04;

class Human {								// 부모 클래스
	String name;							// 인스턴스 필드 : 객체화 시켜야 사용이 가능하다. 메모리의 Heap영역에 저장
	int age;
	
	void eat() {							//인스턴스 메소드 : 객체화 시켜야 사용이 가능하다. 메모리의 Heap영역에 pointer(주소값)을 저장하고, Class영역 내의 instance method 영역에 메소드의 코드가 저장
		System.out.println("사람이 음식을 먹습니다.");
	}
	
	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}

class Student extends Human {
	int studentID;
	
	void goToSchool() {
		System.out.println("학생은 학교에 갑니다.");
	}
}

class Worker extends Human {
	int workerID;
	
	void goToCompany() {
		System.out.println("직장인은 직장에 갑니다.");
	}
}


public class Test01 {

	public static void main(String[] args) {


		Human h = new Human();
		h.name = "홀길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		
		Student s = new Student();
		
		s.name = "홀길동";
		s.age = 30;
		s.studentID = 543588;				// 자식클래스 필드
		
		s.eat();
		s.sleep();
		s.goToSchool();						// 자식클래스 메소드
		
		
		Worker w = new Worker();
		
		w.name = "홀길동";
		w.age = 30;
		w.workerID = 543588;					// 자식클래스 필드
		
		w.eat();
		w.sleep();
		w.goToCompany();						// 자식클래스 메소드
		
		
		Human h1 = new Student();				// 업캐스팅 : 부모 데이터 타입에만 접근가능
		h1.name = "홀길동";
		h1.age = 30;
		h1.eat();
		h1.sleep();
		
		
		// 다운캐스팅 시, 런타임 오류 방지 : instanceof 를 사용하여 데이터타입을 가지고 있는지 확인, boolean 값으로 반환
		System.out.println(h1 instanceof Human);
		System.out.println(h1 instanceof Student);
		System.out.println(h1 instanceof Worker);
		
		Worker w4 = (Worker) h1;					// h1 Worker 타입이 없지만, 컴파일오류가 발생하지 않는다. 런타임오류 발생. 이를 막기위해 if 문에 instanceof 를 사용하여 검증한 뒤 다운캐스팅
		
		
		
		if (h1 instanceof Student) {
			Student s2 = (Student) h1;				// 다운캐스팅
			
			s2.studentID = 12468465;
			s2.goToSchool();
		}
		
		
	}

}
