package chap06_07.EX06;

class Cde {
	String name;						// 인스턴스 필드 : static 이 붙지않아 객체화를 해야 호출가능
	int age;
	
	static String email;				// 정적 필드(스태틱 필드) : static이 붙어 객체 생성없이 클래스명으로 호출가능, 객체 생성후 사용도 가능
	static int num;						// 정적필드는 객체화되더라도 heap영역에 값이 있는것이 아니라 클래스영역에 값을 두고, 객체의 heap 메모리에는 주소값만 가진다.
}






public class Static_04 {

	public static void main(String[] args) {
		
		Cde cde1 = new Cde();
		
		// 인스턴스 필드
		cde1.name = "홀길동";
		cde1.age = 30;
		
		// 스태틱 필드 : 객체를 생성하고 사용할 수도 있고, 객체생성없이 클래스명으로 사용할 수 있으나 static은 객체생성하지 않고 사용하는 것을 권장한다.
		
		cde1.email = "aaa@aaa.com";
		cde1.num = 01012341234;
		
		// static은 모든 객체들이 공유한다.
		Cde.email = "aaa@aaa.com";
		Cde.num = 01012341234;
		
		
		// 인스턴스 필드 : Heap 영역에 저장되고, 각 객체에서 공유되지 않는 고유한 값을 가진다.
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		
		cde2.name = "김유신";
		cde2.age = 50;
		
		cde3.name = "킹세종";
		cde3.age = 60;
		
		cde4.name = "신사임당";
		cde4.age = 40;
		
		
		System.out.println(cde2.name);
		System.out.println(cde2.age);
		System.out.println();
		System.out.println(cde3.name);
		System.out.println(cde3.age);
		System.out.println();
		System.out.println(cde4.name);
		System.out.println(cde4.age);
		System.out.println("====================");
		
		// 스태틱 필드 : 클래스 영역에 값이 저장되고, 모든 객체들이 공유한다.
		
		cde2.email = "kkk@kkk.com";
		cde2.num = 55;
		
		System.out.println(cde2.email);
		System.out.println(cde2.num);
		System.out.println();
		
		System.out.println(cde3.email);
		System.out.println(cde3.num);
		System.out.println();
		
		System.out.println(cde4.email);
		System.out.println(cde4.num);
		
	}

}
