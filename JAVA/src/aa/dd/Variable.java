package aa.dd;
public class Variable {
	public static void main(String[] args) {
		int a = 3;				// ���� a <== ����         =�� ���ٶ�� ���� �ƴ϶� �������� ���� ���ʿ� �־�� ��� ��
		String b = "ȭ��";		// ���� b <== ���ڿ�		�ڹٿ����� ������ ������ �� �ڷ����� ���� �������־���Ѵ�
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		System.out.println(b + "���");
		System.out.println(a + b + "���");
		
		System.out.println("=====================");
		System.out.println();
		
		a = 10;
		b = "����";
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		System.out.println(b + "���");
		System.out.println(a + b + "���");
		
		a = 30;
		b = "10";
		
		
		System.out.println("==================================");
		// String�� ���� �Ҵ� �Ҵ� �����ڸ� ���� �Ҵ�. ������ ������ �޸� ����(heep ����)�� ������. ������ �ּҰ��� ������.
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		
		System.out.println(aa);
		System.out.println(bb);
		
		if (aa == bb) {					// �� ������ �޸��� �ּҰ��� �� (aa, bb�� �ٸ� �޸� �ּӸ� ���´�.)
			System.out.println(true);	// �����ڷ������� == �� �޸� �ּҰ� ���İ� ����� ���̴�. (�⺻ �ڷ��������� ���� ��)
		} else {
			System.out.println(false);
		}
		
		if (aa.equals(bb)) {
			System.out.println(true);
		} else {						// �����ڷ������� ���� ���ϱ� ���ؼ��� aa.equals(bb) ó�� equals �޼ҵ带 ����ؾ��Ѵ�.
			System.out.println(false);
		}
		System.out.println();
		
		// String�� ���� ���ͷ� ������ �ٷ� �Ҵ�. �޸� ������ �����Ѵ�.
		
		String cc = "�ȳ�";
		String dd = "�ȳ�";
		
		System.out.println(cc);
		System.out.println(dd);
		
		if (cc == dd) {					// �� ������ �޸��� �ּҰ��� �� (aa, bb�� ���� �޸� �ּӸ� ���´�.)
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if (cc.equals(dd)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
