package chap02;
public class PrimaryDataType_2 {
	public static void main(String[] args) {
		// char �ڷ����� ���� �Ҵ��ϴ� ���, 2byte
		
		// 1. ���ڷ� �Ҵ�
		char value1 = 'A';			// ������
		char value2 = '��';			// �ѱ�
		char value3 = '3';			// ���� 3�� ����Ų��.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// 2. ������ �Ҵ�
		char value4 = 65;			// �ƽ�Ű�ڵ�� �빮�� A
		char value5 = 0xac00;		// 16������ ���� �Ҵ� 0x : 16������ ���� �ְڴٰ� ����
		char value6 =51;			// 51 : ���� 3
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		// 3. �����ڵ� Ÿ������ �Ҵ�
		char value7 = '\u0041';		// �����ڵ�� �빮�� A
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		System.out.println("======== ���� A�� �Ҵ��ϴ� �پ��� ��� ========");
		char a = 'A';				// ���ڷ� ���� �Ҵ�
		char b = 65;				// 10������ �Ҵ� : �ƽ�Ű �ڵ� ��
		char c = 0b1000001;			// 0b(������)�� 2������ �����Ѵٴ� ��
		char d = 00101;				// 00(������)�� 8������ �����Ѵٴ� ��
		char e = 0x0041;			// 0x(������)�� 16������ �����Ѵٴ� ��
		char f = '\u0041';			// ���� �ڵ�� ���� �Ҵ�
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
