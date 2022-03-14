package EX;

/*	Java는 다중 상속이 불가능하다.
 * 부모 class는 한개만 가능하다.
 * Java의 모든 class는 Object의 자식 class이다.
 * Object class에서 정의한 필드나 method를 재정의(Overriding)하여 사용 할 수 있다.
 */

class Student {
	String name;					// 학생이름
	int studentID;					// 학번
	int kor;						// 국어점수
	int eng;						// 영어점수
	int math;						// 수학점수
	int sum;						// 점수 합
	double avg;						// 점수 평균
	
	void hobby() {
		System.out.println("각 학생의 취미는 입니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 학번 : " + studentID + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 합계 : " + sum + ", 평균 : " + avg;
	}
	
}

class S_철수 extends Student {

	@Override
	void hobby() {
		System.out.println("철수의 취미는 요리입니다.");
	}
	
	S_철수(String a, int b, int c, int d, int e) {
		name = a;
		studentID = b;
		kor = c;
		eng = d;
		math = e;
		sum = c + d + e;
		avg = (double) sum / 3;
	}
	
}

class S_영희 extends Student {
	
	@Override
	void hobby() {
		System.out.println("영희의 취미는 운동입니다.");
	}
	
	S_영희(String a, int b, int c, int d, int e) {
		name = a;
		studentID = b;
		kor = c;
		eng = d;
		math = e;
		sum = c + d + e;
		avg = (double) sum / 3;
	}
}

class S_영식 extends Student {
	@Override
	void hobby() {
		System.out.println("영식의 취미는 게임입니다.");
	}
	
	S_영식(String a, int b, int c, int d, int e) {
		name = a;
		studentID = b;
		kor = c;
		eng = d;
		math = e;
		sum = c + d + e;
		avg = (double) sum / 3;
	}
}

public class Quiz_03 {

	public static void main(String[] args) {
		
		Student 철수 = new S_철수("철수", 001, 70, 80, 90);
		Student 영희 = new S_영희("영희", 002, 80, 95, 75);
		Student 영식 = new S_영식("영식", 003, 75, 65, 90);
		
		System.out.println(철수);
		철수.hobby();
		System.out.println(영희);
		영희.hobby();
		System.out.println(영식);
		영식.hobby();
		
		System.out.println("===============================================");
		
		Student[] arr = {철수, 영희, 영식};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("===============================================");
		
		for (Student k : arr) {
			System.out.println(k);
			k.hobby();
		}
	}
}
