package chap19.EX01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() �޼ҵ��� ������ ������
		
		System.out.println(System.getProperty("user.dir"));						// ���� �۾� ���丮�� ���
		
		System.out.println(System.getProperty("java.version"));					// java ����
		
		System.out.println(System.getProperty("java.vendor"));					// IDE �Ǹ���
		
		System.out.println(System.getProperty("java.vendor.url"));				// URL
		
		System.out.println(System.getProperty("java.home"));					// java ��ġ ����
		
		System.out.println(System.getProperty("java.class.version"));
		
		System.out.println(System.getProperty("java.class.path"));				// bin ���� ���
		
		System.out.println(System.getProperty("user.name"));					// ����� ����
		
		System.out.println(System.getProperty("user.home"));					// Ȩ ����
		
		System.out.println(System.getProperty("os.name"));						// os ����
		
		System.out.println(System.getProperty("os.arch"));						// os ��Ű����
		
		System.out.println(System.getProperty("os.version"));					// os ����
		
		System.out.println(System.getProperty("file.separator"));				// ���� ������
			
		System.out.println(System.getProperty("path.separator"));				// �н� ������
		
		System.out.println(System.getProperty("line.separator"));				// ���� ������
	}

}
