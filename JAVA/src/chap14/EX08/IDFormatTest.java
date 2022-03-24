package chap14.EX08;

// ID의 값이 Null일 경우, Exception 발생
// user ID가 : 8자 이상 20자가 아닌 경우 Exception 발생



// Checked Exception 생성
class IDFormatException extends Exception {
	public IDFormatException () {
		super();
	}
	
	public IDFormatException(String message) {										// 예외 발생 시, e.getMessage() 메소드(message 반환)를 이용해 예외 메세지가 출력
		super(message);
	}
}


// 
public class IDFormatTest {

	private String userID;															// 체크해서 null 값이거나, 8자 이상 20자가 아닌 경우 Exception 발생
		// userID 캡슐화 되었다. private 접근제어자 : 외부나 다름 클래스에서 접근 차단.
		// 생성자 or setter를 사용해서 값을 할당
		// 접근제어자가 Private으로 설정된 경우 : getter나 setter를 사용
	
	
	
	
	public String getUserID() {														// 메소드 호출 시, 메모리의 userID 값을 할당
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {											// 메모리의 값을 할당
		if (userID == null) {
			throw new IDFormatException("ID는 Null일 수 없습니다.");
		} else if (userID.length() > 20 || userID.length() < 8) {
			throw new IDFormatException("ID는 8자 이상, 20자 이하로 사용 가능합니다.");
		} else {
			System.out.println("정상적으로 작동되었습니다.");
		}
		this.userID = userID;
	}
	
	
	
	public static void main(String[] args) {
		
		// 1. userID 가 null인 경우
		
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserID(userID);														// setter 호출 시 null 입력후, 호출
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
		
		// 2. userID 가 범위를 벗어난 경우
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("==========================");
		
		// 3. userID가 정상적으로 작성된 경우
		
		userID = "12345678910";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		
		
	}
}
