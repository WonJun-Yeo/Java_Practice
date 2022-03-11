package chap10.EX04;

class Animal2 {
	void run() {
	}
}

class Tiger extends Animal2 {					// ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Egle extends Animal2 {					// �������� �ϴ��� ���ϴ�.
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	void egleEat() {
		System.out.println("�������� ���� ��ƸԽ��ϴ�.");
	}
}

class Snake extends Animal2 {					// ���� ���ٴմϴ�.
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}

public class MethodOverring_02 {

	public static void main(String[] args) {
		// 1. ��� ��ü�� Animal Ÿ������ ��ĳ�����ؼ� ����
		Animal2 at = new Tiger();
		Animal2 ae = new Egle();
		Animal2 as = new Snake();
		
		at.run();
		ae.run();
		as.run();
		
		System.out.println("===============");
		
		
		// 2. Animal2 �迭�� �� ��ü�� ����
		
		Animal2[] animal = {at, ae, as};
		
		// 3. for������ �迭�� �� ��ü�� �޼ҵ带 ���
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].run();
		}
		
		System.out.println("================");
		
		
		//4. Enhanced for���� ����ؼ� �� ��ü�� �޼ҵ带 ���
		
		for (Animal2 k : animal) {
			k.run();
		}
		
		System.out.println("================");
		
		
		// 5. instanceof�� ����ؼ� �ٿ�ĳ���� �� ���� ���
		
		if (at instanceof Tiger) {
			Tiger atd = (Tiger) at;
			atd.tigerEat();
		}
		
		if (ae instanceof Egle) {
			// �ٿ�ĳ����
			Egle aed = (Egle) ae;
			aed.egleEat();
			
			// �ٽ� ��ĳ����
			Animal2 aaa = (Animal2) aed;
			aaa.run();
		}
		
		
		
	}

}
