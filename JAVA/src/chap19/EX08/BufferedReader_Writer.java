package chap19.EX08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedReader_Writer {

	public static void main(String[] args) {
		// 1. ���� ��ü ����
		File rwfile = new File("JAVA\\src\\chap19\\EX08\\BufferedFile.txt");
		
		// 2. FileWriter�� �̿��ؼ� ���� (MS949)
		try (Writer writer = new FileWriter(rwfile);
				BufferedWriter bw = new BufferedWriter(writer)){					// ��������� ���� Filter
			bw.write("�ȳ��ϼ���\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("�ݰ����ϴ�.", 2, 3);
			bw.flush();
		} catch (Exception e) {}
		
		// 3. FileReader�� �̿��ؼ� �б� (MS949)
		/* readLine()
		 * BufferedReader���� �����ϴ� �޼ҵ�
		 * �� ���ξ� �д´�.
		 * ����Ÿ���� String
		 * ������ ���� ��Ÿ����, null
		 */
		try (Reader reader = new FileReader(rwfile);
				BufferedReader br = new BufferedReader(reader)){
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {}
		
		
		
		
	}

}
