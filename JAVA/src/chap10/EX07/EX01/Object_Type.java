package chap10.EX07.EX01;



class AA {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a 변수값 : " + a + "b 변수값 : " + b;
	}
}

class BB {
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a 변수값 : " + a + "b 변수값 : " + b;
	}
}

class CC {
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a 변수값 : " + a + "b 변수값 : " + b;
	}
}

public class Object_Type {

	public static void main(String[] args) {
		// 자바의 모든 객체는 Object 타입으로 형변환이 가능하다.
		
		Object aa = new AA();
		Object bb = new BB();
		Object cc = new CC();
		
		
		// Object 배열에 객체 저장
		Object[] arr1 = {aa, bb, cc};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i].toString());
		}
		
		System.out.println("========================");
		
		for (Object k : arr1) {
			System.out.println(k);
		}
		

	}

}
