package chap19.EX08;

import java.io.InputStreamReader;


 
 /*InputStreamReader isr = new InputStreamReader (System.in, Charset)
 * InputStreamReader : byte => char ������ ��ȯ
 * System.in : �ܼ� �Է�, byte
 * 
 * 
 */




public class InputStreamReader_02 {

	public static void main(String[] args) {
		// 1. console �Է� (MS949) : defaultCharset, byte ��Ʈ��
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			System.out.println("�ѱ��� �Է����ּ���. >>");
			int data;
			while ((data = isr.read()) != '\r') {						// console �Է��� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
		} catch (Exception e) {
		}
		
		
		System.out.println("=====================================================");
		
		// 2. console �Է� (UTF-8)
		
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");){
			System.out.println("�ѱ��� �Է����ּ���. >>");
			int data;
			while ((data = isr.read()) != '\r') {						// console �Է��� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
		} catch (Exception e) {}
		
	}

}
