package chap13.EX10.EX2;

class Abc {
	
	Abc(){}
	
	Abc(Def d){
		this.d = d;
	}
	
	Def d;
	
	interface Def {
		void run();
		void fly();
	}
	
	public void setDef(Def d) {
		this.d = d;
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}

public class InnerInterface_01_2 {
	public static void main(String[] args) {
		// 1. ��ü ���� ��, ��ü�� ���� �� �Ҵ�(d1)
		Abc d1 = new Abc();
		
		d1.d = (Abc.Def) new Abc.Def() {
			@Override
			public void run() {
				System.out.println("��ü ���� �� �Ű����� d�� ���� �Ҵ�");
			}
			@Override
			public void fly() {
				System.out.println("��ü ���� �� �Ű����� d�� ���� �Ҵ�");
			}
		};
		
		d1.ghi();
		
		System.out.println("=========================================");
		
		// 2. �����ڸ� ���ؼ� ���� �Ҵ�(d2)
		Abc d2 = new Abc(new Abc.Def() {
			@Override
			public void run() {
				System.out.println("�����ڸ� ���ؼ� ���� �Ҵ�");
			}
			@Override
			public void fly() {
				System.out.println("�����ڸ� ���ؼ� ���� �Ҵ�");
			}
		});
		
		d2.ghi();
		
		System.out.println("=========================================");
		
		// 3. setter�� ���ؼ� ���� �Ҵ�(d3)
		Abc d3 = new Abc();
		
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("setter�� ���ؼ� ���� �Ҵ�");
			}
			
			@Override
			public void fly() {
				System.out.println("setter�� ���ؼ� ���� �Ҵ�");
			}
		});
		
		d3.ghi();

	}

}
