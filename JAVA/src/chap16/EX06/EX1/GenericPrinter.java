package chap16.EX06.EX1;

/*�پ��� ���� �������ϴ� ������ (�Ŀ��, �ö�ƽ, ��)
 * 
 */

// Generic Ŭ���� : �Ű������� ������ Ÿ���� �޾� �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter <T extends Material> {						// T�� �� �� �ִ� Ÿ���� Material ����, ���� Ŭ�����̴�.
	private T material;
	
	// getter & setter
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	// �ش� ��ü�� toString() �޼ҵ� ȣ��
	@Override
	public String toString() {
		return material.toString();
	}
	
	// �޼ҵ常 ����
	public void printing() {
		material.doPrinting();
	}
}
