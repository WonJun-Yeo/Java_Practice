package EX;

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
	
}




public class Quiz_04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1111, "홍길동", 90, 80);
		Student1 s2 = new Student1(2222, "김기동", 70, 85);
		Student1 s3 = new Student1(3333, "박수현", 80, 90);
		Student1 s4 = new Student1(1111, "홍길동", 90, 80);
		
		
		// studentID 가 같은 경우, "같은 학생입니다". 출력
		
		System.out.println(s1.equals(s4));			// true	
		
		System.out.println();
		
		if (s1.equals(s4)) {
			System.out.println("같은 학생입니다.");
		} else {
			System.out.println("다른 학생입니다.");
		}
		
		
	}

}
