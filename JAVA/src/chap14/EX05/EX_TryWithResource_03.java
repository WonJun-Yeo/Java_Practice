package chap14.EX05;

// 자동 리소스(객체) 제거

// 필드의 값 할당. 생성자 호출시 필드에 값을 할당


class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;											// 평균
	
	Abc (String name, int studentID, int kor, int eng, int math) {
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (double) (kor + eng + math) / 3;
	}
	
	@Override
	public void close() throws Exception {							// close() 메소드가 자동으로 호출된다.
		// AutoCloseable 인터페이스의 close() 메소드를 오버라이딩
		
		System.out.println();
		
		System.out.println(name);
		System.out.println(studentID);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(avg);
		
		if (name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			
			System.out.println();
			
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("리소스가 해제 되었습니다.");
			System.out.println(name);
			System.out.println(studentID);
			System.out.println(kor);
			System.out.println(eng);
			System.out.println(math);
			System.out.println(avg);
		}
	}
}

public class EX_TryWithResource_03 {

	public static void main(String[] args) {
		// 1. 객체의 모든 필드를 초기화하고 자동 close() 메소드 호출
		
		try (Abc abc = new Abc("홍길동", 111020, 80, 70, 95)) {
			System.out.println("이름 : " + abc.name);
			System.out.println("국어 : " + abc.kor + ", 영어 : " + abc.eng + ", 수학 : " + abc.math);
			System.out.println("평균 : " + abc.avg);
		} catch (Exception e){
			System.out.println("예외가 발생되었습니다.");
		}
		
		System.out.println("===========================================");
		
		// 2. 객체의 모든 필드를 초기화하고 수동 예외 처리
		
		Abc abc2 = null;
		
		try {
			abc2 = new Abc("이순신", 111021, 90, 80, 75);
			System.out.println("이름 : " + abc2.name);
			System.out.println("국어 : " + abc2.kor + ", 영어 : " + abc2.eng + ", 수학 : " + abc2.math);
			System.out.println("평균 : " + abc2.avg);
		} catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		} finally {
			if(abc2.name != null || abc2.studentID != 0 || abc2.kor != 0 || abc2.eng != 0 || abc2.math != 0 || abc2.avg != 0.0) {
				try {
					abc2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
