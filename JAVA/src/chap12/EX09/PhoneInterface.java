package chap12.EX09;

public interface PhoneInterface {
	int TIMEOUT = 10000;					// public static final �� ����
	void sendCall();						// public abstract �� ����
	void receiveCall();						// public abstract �� ����
	default void printLogo() {
		System.out.println("�ΰ��� ����մϴ�.");
	}
}