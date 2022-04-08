package chap19.EX03;

import java.nio.charset.Charset;								// Charset Ŭ����

public class CreateCharacterObject {

	public static void main(String[] args) {
		// ���� ���ڵ� ������ �����ϴ� ���1
		
		// 1. Charset.defaultCharset() : �ý����� �⺻ ������ charset�� �ε�
		Charset cs1 = Charset.defaultCharset();					// �����޼ҵ�, �ý����� �⺻ ������ charset�� �ε� (������ ���� �ٸ��� ��µȴ�)
		System.out.println(cs1);								// MS949�� Ȯ������� x-windows-949
		
		// 2. Charset.forName("MS949") : charset�� �����Ҵ��ؼ� ����
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC-KR");				// �������� �ʴ� ���ڵ��� ������ UnsupportedCharsetException ���� �߻�, ���࿹�ܸ� ó�����־���Ѵ�.
		System.out.println(cs4);
		
		System.out.println("================================================");
		
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("UTF-16"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("EUC-KRrr"));
		
		
		
		
		
		
		
		
	}

}
