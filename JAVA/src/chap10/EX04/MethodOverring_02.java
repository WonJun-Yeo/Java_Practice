package chap10.EX04;

class Animal2 {
	void run() {
	}
}

class Tiger extends Animal2 {					// 호랑이는 네발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Egle extends Animal2 {					// 독수리는 하늘을 납니다.
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	
	void egleEat() {
		System.out.println("독수리는 새를 잡아먹습니다.");
	}
}

class Snake extends Animal2 {					// 뱀은 기어다닙니다.
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}

public class MethodOverring_02 {

	public static void main(String[] args) {
		// 1. 모든 객체는 Animal 타입으로 업캐스팅해서 생성
		Animal2 at = new Tiger();
		Animal2 ae = new Egle();
		Animal2 as = new Snake();
		
		at.run();
		ae.run();
		as.run();
		
		System.out.println("===============");
		
		
		// 2. Animal2 배열에 각 객체를 저장
		
		Animal2[] animal = {at, ae, as};
		
		// 3. for문으로 배열의 각 객체의 메소드를 출력
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].run();
		}
		
		System.out.println("================");
		
		
		//4. Enhanced for문을 사용해서 각 객체의 메소드를 출력
		
		for (Animal2 k : animal) {
			k.run();
		}
		
		System.out.println("================");
		
		
		// 5. instanceof를 사용해서 다운캐스팅 한 다음 출력
		
		if (at instanceof Tiger) {
			Tiger atd = (Tiger) at;
			atd.tigerEat();
		}
		
		if (ae instanceof Egle) {
			// 다운캐스팅
			Egle aed = (Egle) ae;
			aed.egleEat();
			
			// 다시 업캐시팅
			Animal2 aaa = (Animal2) aed;
			aaa.run();
		}
		
		
		
	}

}
