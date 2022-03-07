package chap06_07.EX04;


// 명시적 this 키워드 추가 (반드시 this 키워드를 사용해줘야 하는 경우)

class Aa {								// this 키워드를 사용하지 않은 경우 : 지역변수로 인식
	int m, n;
	
	void init(int m, int n) {
		m = m;							// this 키워드를 사용하지 않는 경우 m은 지역변수 m
		n = n;							// this 키워드를 사용하지 않는 경우 n은 지역변수 n
	}
}

class Bb {								// this 키워드를 사용하는 경우 : 필드로 인식
	int m, n;
	
	void init(int m, int n) {
		this.m = m;						// this 키워드를 사용하는 경우 m은 필드 m
		this.n = n;						// this 키워드를 사용하는 경우 n은 필드 n
	}
}




public class ThisKeyword_02 {
	public static void main(String[] args) {
		// 1. 필드명과 지역변수명이 같은 경우 (this 키워드를 사용하지 않은 경우 : 지역변수에 저장)
		
		Aa aa = new Aa();
		aa.init(1, 3);
		System.out.println(aa.m);
		System.out.println(aa.n);
		System.out.println("=====================");
		
		// 2. 필드명과 지역변수명이 같은 경우 (this 키워드를 사용한 경우 : 필드에 저장)

		Bb bb = new Bb();
		bb.init(1, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);
		System.out.println("=====================");
	}
}
