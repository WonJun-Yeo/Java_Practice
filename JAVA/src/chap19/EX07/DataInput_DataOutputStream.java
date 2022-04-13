package chap19.EX07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* InputStream : ��� ��Ʈ��
 * 		int 5555-> ���� 5555 -> ���� 5555 -> int 5555
 * 
 * DataInputStream
 * 		�پ��� ������ �����͸� ������ ������ �� ���
 * 		Ư�� ������ Ÿ���� ������ä �������ų� ������ �� �ִ�.
 * 			int -> int, double -> double
 * 		�߰� ����� �����ϴ� Stream
 * 		��� Stream�� �ݵ�� �����ؾ� �Ѵ�.
 * 		�ܵ����� ����� �� ����.
 */

public class DataInput_DataOutputStream {

	public static void main(String[] args) {
		// ���� ����
		File dataFile = new File("JAVA\\src\\chap19\\EX07\\file1.data");		// Ȯ���� : data, binary data�� �����
		
		// ������ ���� (DataOutputStream)
		try (OutputStream os = new FileOutputStream(dataFile);					// ��� Stream
				DataOutputStream dos = new DataOutputStream(os)){				// �߰� ����� �����ϴ� Steram
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
		} catch (Exception e) {													// Exception : ��� ������ �ֻ��� Ŭ����
		}
		
		
		// ������ �б� (DataInputStream)
		try (InputStream is = new FileInputStream(dataFile);					// ��� Stream
				DataInputStream dis = new DataInputStream(is)){				// �߰� ����� �����ϴ� Steram
		System.out.println(dis.readInt());	
		System.out.println(dis.readDouble());	
		System.out.println(dis.readChar());	
		System.out.println(dis.readUTF());	
		} catch (Exception e) {													// Exception : ��� ������ �ֻ��� Ŭ����
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
