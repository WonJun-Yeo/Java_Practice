package chap03;
public class OperatorEx02 {
	public static void main(String[] args) {
		// ũ�� �� ( <, >, ,<=, >=)		=====> true, false
		System.out.println(5 < 2);
		System.out.println(-5 < 5);
		System.out.println(5 <= 5);
		System.out.println("============================");
		
		// � �� { ==(����) , !=(���� �ʴ�)}		====> true, false
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println("==============================");
		
		// ���� �ڷ��� � �� (��ü�� �޸��� ������ ��)
		String str1 = new String ("�ȳ�");
		String str2 = new String ("�ȳ�");
		
		System.out.println(str1 == str2);	// �ؽ�Ʈ�� ���ĸ� ���ϴ� ���� �ƴ϶�, ��ü�� �޸��� ������ ���ϱ� ������ false
		
		
	}
	
}
