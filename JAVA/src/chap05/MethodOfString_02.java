package chap05;

import java.util.Arrays;

public class MethodOfString_02 {
	public static void main(String[] args) {
		// 1. 문자열 수정 : toLowerCase() : 소문자로 변환, toUpperCase() : 대문자로 변환
		
		String str1 = "Java Study";
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("=================");
		
		
		// 2. 문자열 변경 : replace(old, new) : old 를 new로 변경
		System.out.println(str1.replace("Study", "공부"));
		
		System.out.println("=================");
		
		// 3. 문자열의 특정부분을 추출 substring(시작 index, 마지막 index)
		
		System.out.println(str1.substring(0, 6));
		System.out.println(str1.substring(6, 8));
		
		System.out.println("=================");
		
		// 4. 특정 문자를 기준으로 구분하여 String[] 배열에 저장 : split(기준1|기준2|기준3|)
		
		String str11 ="abc/def-ghi jkl";
		String[] strArray = str11.split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "오늘의 날씨는 흐립니다. ";
		String[] strArray2 = str111.split(" ");
		System.out.println(Arrays.toString(strArray2));		// 마지막 공백뒤에 아무것도 없기 때문에 null값으로 저장될 것 같지만, 배열에 저장되지 않는다.
		
		String str1111 = "이름, 나이, 성별, 전화번호, 메일주소";
		String[] strArray3 = str1111.split(",");
		System.out.println(Arrays.toString(strArray3));
		for(int i = 0; i < strArray3.length; i++) {
			System.out.print(strArray3[i] + " ");
		}
		
		System.out.println();
		System.out.println("=================");
		
		// 5. 앞뒤의 공백을 제거해 반환 : trim()
		
		System.out.println("      abc        ");
		System.out.println("      abc        ".trim());
		System.out.println("    abc    abc    ".trim());
		System.out.println("    abc    abc    abc    ".trim());
		
		System.out.println("=================");
		
		// 6. 문자열의 값 비교 : equals() : 대소문자 구분, equalsIgnoreCase : 대소문자 구분X
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		/* 메모리 주소 값 비교
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str2==str4);
		*/
		
	}
}
