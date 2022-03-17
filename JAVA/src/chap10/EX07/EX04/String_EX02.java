package chap10.EX07.EX04;

/*String만의 고유의 특징 : 
 * 객체를 출력하면 toString() 메소드로 주소가 반환되야 하지만, 값이 반환되도록 재정의가 되어있다.
 * String의 equals() 메소드도 값을 비교하도록 재정의 되어있다.
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
	
	/* toString() 메소드의 기본 정의는 : 패키지명.클래스명@해쉬코드 반환
	 * 재정의하여 : name의 필드값을 리턴
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
		String s1 = new String("안녕");
		String s2 = "안녕";
		
		System.out.println(s1);	
		System.out.println(s1.equals(s2));
		
		
		AA aa1 = new AA("안녕");
		AA aa2 = new AA("안녕");
		
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));					// 객체 두 개의 주소를 비교
		System.out.println(aa1.name == aa2.name);
		
		System.out.println();
		
		BB bb1 = new BB("안녕");
		BB bb2 = new BB("안녕");
		
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
	}

}
