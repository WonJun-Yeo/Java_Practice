package chap10.EX07.EX04;

/*String���� ������ Ư¡ : 
 * ��ü�� ����ϸ� toString() �޼ҵ�� �ּҰ� ��ȯ�Ǿ� ������, ���� ��ȯ�ǵ��� �����ǰ� �Ǿ��ִ�.
 * String�� equals() �޼ҵ嵵 ���� ���ϵ��� ������ �Ǿ��ִ�.
 */

class AA {
	String name;
	AA(String name) {
		this.name = name;
	}
}

class BB {
	String name;
	BB(String name) {
		this.name = name;
	}
	
	/* toString() �޼ҵ��� �⺻ ���Ǵ� : ��Ű����.Ŭ������@�ؽ��ڵ� ��ȯ
	 * �������Ͽ� : name�� �ʵ尪�� ����
	 */
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((BB)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	
}



public class String_EX02 {

	public static void main(String[] args) {
		String s1 = new String("�ȳ�");
		String s2 = "�ȳ�";
		
		System.out.println(s1);	
		System.out.println(s1.equals(s2));
		
		
		AA aa1 = new AA("�ȳ�");
		AA aa2 = new AA("�ȳ�");
		
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));					// ��ü �� ���� �ּҸ� ��
		System.out.println(aa1.name == aa2.name);
		
		System.out.println();
		
		BB bb1 = new BB("�ȳ�");
		BB bb2 = new BB("�ȳ�");
		
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
	}

}
