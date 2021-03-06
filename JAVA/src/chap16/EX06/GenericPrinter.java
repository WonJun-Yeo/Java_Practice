package chap16.EX06;

/*다양한 재료로 프린팅하는 프린터 (파우더, 플라스틱, 물)
 * 
 */

// Generic 클래스 : 매개변수로 데이터 타입을 받아 다양한 타입을 사용할 수 있는 클래스
public class GenericPrinter <T> {
	private T material;
	
	// getter & setter
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	// 해당 객체의 toString() 메소드 호출
	public String toString() {
		return material.toString();
	}
	
	// 메소드만 정의
	public void printing() {
		//material.doPrinting();
	}
}
