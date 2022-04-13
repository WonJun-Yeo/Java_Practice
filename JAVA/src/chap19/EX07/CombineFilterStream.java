package chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* �ϳ��� ��� Stream�� Filter Stream�� ���� �� �����ؼ� ��밡���ϴ�.
 * ���� �������� ó���ϴ� Stream�� �޼ҵ� ��뿩�ο� ���� ������ ���� �� �ִ�.
 */


/* ��� Stream 1�� : FileOutputStream
 * Filter Stream 2�� : BufferedOutputStream (Buffer ���, ������ó��), DataOutputStream (�پ��� ���� ������� ó��)
 */

public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. ���� ����
		File dataFile = new File("JAVA\\src\\chap19\\EX07\\file2.data");
		
		// 2. ������ ����
		try (OutputStream os = new FileOutputStream(dataFile);							// ���Stream
				BufferedOutputStream bos = new BufferedOutputStream(os);				// �߰���� Stream
				DataOutputStream dos = new DataOutputStream(bos)){						// �߰���� Stream
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
		} catch (Exception e) {
		}
		
		// 3. ������ �б�
		
		try (InputStream io = new FileInputStream(dataFile);							// ���Stream
				BufferedInputStream bis = new BufferedInputStream(io);					// �߰���� Stream
				DataInputStream dis = new DataInputStream(bis)){						// �߰���� Stream
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
