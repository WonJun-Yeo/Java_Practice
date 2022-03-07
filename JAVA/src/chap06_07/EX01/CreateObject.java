package chap06_07.EX01;




class AA {
	String name;			// �ʵ�(���) : ��üȭ(�ν��Ͻ�ȭ) ���Ѿ� ����� �����ϴ�. (RAM(�޸�)�� Heep ������ ���� �������� ����)
	int age;				// ���� �Ǿ� �ֱ� ������ default ���� �Ҵ�ȴ�.
	String email;
	
	AA() {}					// �⺻������, ������ ����, �ٸ� �����ڰ� ������ ��쿡�� �����ؼ� �ȵȴ�.
	
	
	public String getName() {			// �޼ҵ�(���) : ��üȭ(�ν��Ͻ�ȭ) ���Ѿ� ����� �����ϴ�. (RAM(�޸�)�� Heep ������ �ּҸ� ����, �޼ҵ� ������ �ڵ���� Ŭ������������ �޼ҵ� ������ ����)
		return name;
	}
	public void setName(String name) {	// void : ���ϰ��� ���ٸ� �˷��ִ� �ĺ���
		this.name = name;				// this : �ڽ��� ��ü(Ŭ����), �Ķ���Ϳ� �������� �ٸ��� ��������
	}
	public int getAge() {
		return age;						// return : �޼ҵ带 ȣ���ϴ� ������ ������ ���� ��ȯ
	}
	public void setAge(int age) {		// parameter�� age�� int �ڷ������� ������
		this.age = age;					// �� �ڷ����� RAM(�޸�)�� �����Ѵ�.
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


public class CreateObject {

	public static void main(String[] args) {
		
		AA aa = new AA();					
		/* AAŬ����(���赵)�� aa(��ü)�� ����, �� ��ü�� stack������ ����ǰ� Ŭ���� ������ �ڵ���� heep ������ ����ȴ�.
		 * AA() : ������, ��ü�� �ʵ尪�� �ʱ�ȭ, �����ڵ� �ϳ��� �޼ҵ�
		 * 		1. �����ڸ��� Ŭ������� �����ؾ��Ѵ�.
		 * 		2. ����Ÿ���� ����.
		 * 		3. �������� �Ű������� ���� �����ڸ� �⺻ �����ڶ�� �Ѵ�.
		 * 		4. �⺻�����ڴ� ������ �����ϴ�.
		 * 		5. ��ü�� ������ ��, �ݵ�� �����ڸ� ȣ��
		*/
		
		// ��ü�� �޼ҵ� ȣ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("==============");
		
		// ��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		System.out.println("==============");
		
		// ��ü�� �޼ҵ忡 ���� �Ҵ��ϰ� ȣ��
		aa.setName("ȫ�浿");					// setter : ��ü�� �޸𸮿� ���� �Ҵ�
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		System.out.println(aa.getName());	// getter : ��ü�� �޸� ���� ȣ��
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("==============");
		
		// �ϳ��� Ŭ������ �������� ��ü�� ������ �� �ִ�.
		
		AA bb = new AA();
		bb.setName("������");
		bb.setAge(50);
		bb.setEmail("bbb@bbb.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		System.out.println();
		
		AA cc = new AA();
		cc.setName("�ɻ��Ӵ�");
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
