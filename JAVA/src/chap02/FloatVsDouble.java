package chap02;
public class FloatVsDouble {
	public static void main(String[] args) {
		//float vs double 의 정밀도 : float은 소숫점이하 7자리까지, double은 소숫점이하 15자리까지 정밀도 유지.
		float f1 = 1.0000001f; //float에는 변수의 값(리터럴)을 담을 때, f 또는 F 로 명시해서 저장
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		System.out.println("=============================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}
}
