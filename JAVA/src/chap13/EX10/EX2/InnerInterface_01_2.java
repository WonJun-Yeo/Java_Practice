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
		// 1. 객체 생성 후, 객체에 직접 값 할당(d1)
		Abc d1 = new Abc();
		
		d1.d = (Abc.Def) new Abc.Def() {
			@Override
			public void run() {
				System.out.println("객체 생성 후 매개변수 d에 값을 할당");
			}
			@Override
			public void fly() {
				System.out.println("객체 생성 후 매개변수 d에 값을 할당");
			}
		};
		
		d1.ghi();
		
		System.out.println("=========================================");
		
		// 2. 생성자를 통해서 값을 할당(d2)
		Abc d2 = new Abc(new Abc.Def() {
			@Override
			public void run() {
				System.out.println("생성자를 통해서 값을 할당");
			}
			@Override
			public void fly() {
				System.out.println("생성자를 통해서 값을 할당");
			}
		});
		
		d2.ghi();
		
		System.out.println("=========================================");
		
		// 3. setter를 통해서 값을 할당(d3)
		Abc d3 = new Abc();
		
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("setter를 통해서 값을 할당");
			}
			
			@Override
			public void fly() {
				System.out.println("setter를 통해서 값을 할당");
			}
		});
		
		d3.ghi();

	}

}
