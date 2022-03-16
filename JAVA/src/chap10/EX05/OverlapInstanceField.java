package chap10.EX05;

class AA {						// 부코 클래스
	int m = 3;					// 인스턴스 필드
	
	void print() {
		System.out.println("AA class");
	}
}

class BB extends AA {			// 자식 클래스
	int m = 4;					// 인스턴스 필드
	
	@Override
	void print() {
		System.out.println("BB class");
	}
}

class CC extends AA {			// 자식 클래스
	int m = 5;					// 인스턴스 필드
	
	@Override
	void print() {
		System.out.println("CC class");
	}
}






public class OverlapInstanceField {

	public static void main(String[] args) {
		AA aa =  new AA();
		BB bb = new BB();
		CC cc = new CC();
		
		AA ab = new BB();
		AA ac = new CC();
		
		// 인스턴스 필드 출력
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(cc.m);
		
		System.out.println();
		
		// 인스턴스 필드는 Overriding이 되지 않는다.
		System.out.println(ab.m);
		System.out.println(ac.m);
		
		System.out.println("===================");
		
		// 인스턴스 메소드는 Overriding 된다.
		
		aa.print();
		bb.print();
		cc.print();
		
		System.out.println();
		
		ab.print();
		ac.print();
		
	}

}
