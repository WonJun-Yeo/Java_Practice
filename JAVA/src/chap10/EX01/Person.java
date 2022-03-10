package chap10.EX01;


/* 상속 : 부모 클래스의 필드, 메소드, 내부클래스를 자식클래스에게 상속
 * 상속의 이점
 * 1. 중복된 코드의 제거 (코드의 재사용)
 * 2. 간결한 코드 (가독성)
 * 3. 다형성 (메소드 오버라이딩, 하나의 메소드명으로 여러 형식으로 출력)
 */

/* 상속다이어그램을 표기할 때 부모 클래스 쪽으로 화살표가 있다.
 * UML(Unified Modeling language) : 시스템을 모델로 표현해주는 대표적인 모델링
 */


/* Student_sub는 Student의 필드와 메소드를 상속 받는다. 
 * Student는 Person의 필드와 메소드를 상속받는다.
 * 따라서, Student_sub는 Person의 필드와 메소드도 상속 받는다.
 */
class Student_sub extends Student {
	
	int weight;
	
	void sub1() {
		System.out.println("Student_sub1 클래스 입니다. 부모의 필드와 메소를 올려 받는다");
	}
	
}






//대학생 클래스
class Student extends Person {						// Person : 부모클래스, Student : 자식클래스
													// 자식클래스는 부모 클래스의 필드, 메소드, 이너클래스를 그대로 상속받는다.
	int studentID;
	void goToSchool() {
		System.out.println("자식 클래스 Student의 goToSchool() 메소드");
	}
}

//직장인 클래스
class Worker extends Person {						// Person : 부모클래스, Worker : 자식클래스
													// 자식클래스는 부모 클래스의 필드, 메소드, 이너클래스를 그대로 상속받는다.	
	int workerID;
	void goToWork() {
		System.out.println("자식 클래스 worker의 goToWork() 메소드");
	}
}


public class Person {
	
	String name;
	int age;
	
	void eat() {
		System.out.println("부모 클래스의 eat() 메소드");
	}
	
	
	void sleep() {
		System.out.println("부모 클래스의 sleep() 메소드");
	}

	public static void main(String[] args) {
	
		// 1. Person 객체 생성
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		p.eat();
		p.sleep();
		
		System.out.println("============================");
		
		
		// 2. Student 객체 생성
		
		Student s = new Student();				// Person 클래스를 상속, Person 클래스의 필드와 메소드를 사용할 수 있다.
		
		// Person 클래스에서 상속된 필드
		s.name = "이순신";
		s.age = 50;
		
		// Student 믈래스의 필드
		
		s.studentID = 123123456;
		
		// Person 클래스에서 상속된 메소드
		
		s.eat();
		s.sleep();
		
		// Student 클래스의 메소드
		
		s.goToSchool();
		
		System.out.println("============================");
		
		
		// 3. Worker 객체 생성
		
		Worker w = new Worker();				// Person 클래스를 상속, Person 클래스의 필드와 메소드를 사용할 수 있다.
		
		// Person 클래스에서 상속된 필드
		w.name = "이순신";
		w.age = 50;
		
		// Worker 믈래스의 필드
		
		w.workerID = 456789123;
		
		// Person 클래스에서 상속된 메소드
		
		w.eat();
		w.sleep();
		
		// Worker 클래스의 메소드
		
		w.goToWork();
		
		System.out.println("============================");
		
		
		// 객체 생성시 타입 변환
		
		Person p1 = new Person();				// Person()은 Person이다.
		
		Person ps = new Student();				// 업캐스팅, Student는 Person이다. 성립
		// Student sp = new Person();			// 다운캐스팅, Person은 Student이다. 성림X
		
		Person pw = new Worker();				// 업캐스팅, Worker는 Person이다. 성립
		// Worker = new Person();				// 다운캐스팅, Person은 Worker이다. 성립X
		
		System.out.println("============================");
		
		
		// Person <- Student <- Student_sub
		
		
		Student_sub sub1 = new Student_sub();
		
		// Person 클래스의 필드
		sub1.name = "신사임당";
		sub1.age = 50;
		
		// Student 클래스의 필드
		sub1.studentID = 741852963;
		
		// Student_sub 클래스의 필드
		sub1.weight = 55;
		
		// Person 클래스의 메소드
		sub1.eat();
		sub1.sleep();
		
		// Student 클래스의 메소드
		sub1.goToSchool();
		
		// Student_suv 클래스의 메소드
		sub1.sub1();
		
		System.out.println("============================");
		
		
		/*	Student_sub는 부모 클래스 타입으로 업캐스팅 (자동으로 변환)
		 * 클래스타입(Type) 객체명 = new 자식클래스생성자();
		 * 부모 클래스의 멤버(필드, 메소드)만 사용가능
		 */
		Person ps1 = new Student_sub();					// 업캐스팅 : Student_sub 객체를 생성 시, Person 클래스 데이터 타입으로 형변환
														// Person 클래스 멤버만 사용가능
		ps1.name = "BTS";
		ps1.age = 30;
		ps1.eat();
		ps1.sleep();
		
		System.out.println();
		
		Student ss1 = new Student_sub();				// 업캐스팅 : Student_sub 객체를 생성 시, Student 클래스 데이터 타입으로 형변환
														// Person, Student 클래스 멤버 사용가능
		ss1.name = "SES";
		ss1.age = 30;
		ss1.eat();
		ss1.sleep();
		
		ss1.studentID = 987654321;
		ss1.goToSchool();
		
		System.out.println();
		
		Student_sub ss2 = new Student_sub();
														// Person, Student, Student_sub 클래스 멤버 사용가능
		ss2.name = "봄여름가을겨울";
		ss2.age = 40;
		ss2.eat();
		ss2.sleep();
		
		ss2.studentID =159487263;
		ss2.goToSchool();
		
		ss2.weight = 60;
		ss2.sub1();
		
		System.out.println("============================");
		
		/* 상속 관계에서 객체 생성 시, 부모 데이터 타입으로 업캐스팅 가능
		 * 모든 데이터 타입을 가지고 있지만 사용가능한 부분을 제한하는 것
		 * 부모 데이터 타입으로 업캐스팅 된 경우, 부모의 필드와 메소드만 사용가능
		 * Person <- Student <- Student_sub
		 */
		
		Person ps4 = new Student_sub();					
		/* Student_sub 객체 생성 시, Person 타입으로 업캐스팅
		 * Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함하고 있다.
		 * 그중에서 Person 클래스의 필드와 메소드만 접근 가능
		 */
		
		Student ss4 = new Student_sub();	
		/* Student_sub 객체 생성 시, Student 타입으로 업캐스팅
		 * Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함하고 있다.
		 * 그중에서 Person, Student 클래스의 필드와 메소드만 접근 가능
		 */
		
		Student_sub ss5 = new Student_sub();
		/* Student_sub 객체 생성 시, Student 타입으로 업캐스팅
		 * Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함하고 있다.
		 * 그중에서 Person, Student, Student_sub 클래스의 필드와 메소드 모두 접근 가능
		 * 업캐스팅이 아니다. 그냥 객체 생성
		 */
		
		System.out.println("============================");
		
		/*	다운 캐스팅 : 부모 데이터 타입으로 업캐스팅 된것을 자식 데이터 타입으로 변환 (수동으로 변환)
		 * 
		 */
		
		Student ps5 = (Student) ps4;						
		/* Person 데이터타입인 ps4를 Student 데이터 타입인 ps5으로 다운캐스팅
		 * Person, Student의 필드와 메소드 접근 가능
		 */
		
		ps5.name = "다운캐스팅";
		ps5.age = 30;
		ps5.eat();
		ps5.sleep();
		
		ps5.studentID = 326159487;
		ps5.goToSchool();
		
		System.out.println();
		
		Student_sub ps6;
		ps6 = (Student_sub) ps4;						
		/* Person 데이터타입인 ps4를 Student_sub 데이터 타입인 ps6로 다운캐스팅
		 * Person, Student, Student_sub의 필드와 메소드 모두 접근 가능
		 */
		
		ps6.name = "다운캐스팅2";
		ps6.age = 40;
		ps6.eat();
		ps6.sleep();
		
		ps6.studentID = 159487326;
		ps6.goToSchool();
		
		ps6.weight = 60;
		ps6.sub1();
		
		
		
		
	}

}


