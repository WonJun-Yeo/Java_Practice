package chap19.EX03;

import java.io.UnsupportedEncodingException;

/* EUCKR
 * �ѱ� ǥ��, �ѱ� ǥ�� ����
 * ��ü �� ǥ�� ������ �͸� �����Ǿ� ����
 * �� 11,000 �� �� 2,200�� ������ ǥ�� ����
 * 8,000�ڴ� ǥ�� �ȵ�
 * ���� : 1byte, �ѱ� 2byte
 * ���������� ����� �� 
 */

/* MS-949
 * Microsoft �翡�� ������ �ѱ� ǥ�� ���
 * windows�� �⺻ Ÿ��
 * 11,000 ��θ� ǥ���� �� �ִ�.
 * ���� : 1byte, �ѱ� 2byte
 */

/* UTF-8
 * windows �� ������ ��� ������ �⺻ Ÿ��
 * ���� : 1byte, �ѱ� 3byte <��������>
 */

/* UTF-16
 * ���� : 2byte, �ѱ� 2byte <��������>
 */

// ���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� �������� �ʴ´�.

/* ��Ŭ�������� ���ڵ� Ÿ�� ���� 3����
 * 1. ���� ����
 * 2. ������Ʈ ����
 * 3. ���� ����
 * 
 * �켱���� : ���� > ������Ʈ > ����
 * 
 */

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// EUCKR vs MS949
		
		// 1. �����ڸ� byte�� �������� �ٽ� String���� ��ȯ
		
		byte[] b1 = "a".getBytes("EUC-KR");					// ���ڸ� byte �迭�� ��ȯ, ��Ʈ��ũ�� ���ڸ� byte ��Ʈ������ ��ȯ�ؼ� ����				
		// ���� �߻� UnsupportedEncodingException : ��Ÿ�� �߻��� ���, ���ڵ� �� �� ���� ���ܰ� �߻��̵ȴ�.
		
		byte[] b2 = "a".getBytes("MS949");					// ���ڸ� byte �迭�� ��ȯ
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "EUC-KR"));		// byte[] �� ���ڿ��� ��ȯ
		System.out.println(new String(b2, "MS949"));
		
		System.out.println();
		
		// 2. �ѱ��� byte�� �������� String���� �������� 
		byte[] b3 = "��".getBytes("EUC-KR");	
		byte[] b4 = "��".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3, "EUC-KR"));		// byte[] �� ���ڿ��� ��ȯ
		System.out.println(new String(b4, "MS949"));
		
		System.out.println();
		
		// 3. �ѱ��� byte�� �������� String���� �������� 
		byte[] b5 = "��".getBytes("EUC-KR");					// EUC-KR�� 11,000�� �� 2,000 �ڸ� ǥ��Ǿ��ִ�.
		byte[] b6 = "��".getBytes("MS949");					// MS949�� 11,000 �� ��� ǥ�Ⱑ �Ǿ��ִ�.
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR"));		// byte[] �� ���ڿ��� ��ȯ
		System.out.println(new String(b6, "MS949"));
		
		System.out.println();

	}

}
