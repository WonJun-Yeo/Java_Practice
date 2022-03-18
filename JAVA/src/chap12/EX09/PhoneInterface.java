package chap12.EX09;

public interface PhoneInterface {
	int TIMEOUT = 10000;					// public static final 이 생략
	void sendCall();						// public abstract 가 생략
	void receiveCall();						// public abstract 가 생략
	default void printLogo() {
		System.out.println("로고를 출력합니다.");
	}
}
