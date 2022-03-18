package EX;


class E extends Object {								// 자바의 모든 클래스는 Object 클래스의 자식 클래스이다.
	String name;
	
	E(){}
	
	E(String name) {
		this.name =name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name.equals(((E)obj).name)) {
			return true;
		} else {
			return false;
		}
	}
}

class Student1 {
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student1(int studentID, String name, int kor, int eng) {
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.studentID == ((Student1) obj).studentID) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return studentID + ", " + name + ", " + kor + ", " + eng;
	}
	
}




public class Quiz_04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1111, "홍길동", 90, 80);
		Student1 s2 = new Student1(2222, "김기동", 70, 85);
		Student1 s3 = new Student1(3333, "박수현", 80, 90);
		Student1 s4 = new Student1(1111, "홍길동", 90, 80);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("===============================");
		
		// studentID 가 같은 경우, "같은 학생입니다". 출력
		
		System.out.println(s1.equals(s4));			// true	
		
		System.out.println();
		
		if (s1.equals(s4)) {
			System.out.println("같은 학생입니다.");
		} else {
			System.out.println("다른 학생입니다.");
		}
		
		System.out.println("===============================");
		
		E e1 = new E();
		System.out.println(e1.name);
		
		E e2 = new E("고양이");
		System.out.println(e2.name);
		
		E e3 = new E("고양이");
		
		System.out.println(e2 == e3);							// 참조 타입 데이터에서 ==은 객체의 주소를 비교
		System.out.println(e2);									// Object 클래스의 toString() 메소드는 객체 주소값을 반환한다.
		System.out.println(e3);
		
		System.out.println(e2.equals(e3));						// Object 클래스의 equals() 메소드는 == 와 같이 객체의 주소를 비교
		// 일반적으로 Object 클래스의 equals() 와 toString() 메소드는 오버라이딩(재정의)하여 사용한다.
	}
}
