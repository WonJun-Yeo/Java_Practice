package Practice;

public class bitOperator {

	public static void main(String[] args) {
		// 10진수 3과 10의 AND 연산
		System.out.println(3 & 10);
		/*
		 * 		00000011		3
		 * 	&	00001010		10
		 * -------------
		 * 		00000010		2
		 */

		
		// 10진수 3과 10의 OR 연산
		System.out.println(3 | 10);
		/*
		 * 		00000011		3
		 * 	|	00001010		10
		 * -------------
		 * 		00001011		11
		 */
		
		// 10진수 3과 10의 OR 연산
		System.out.println(3 ^ 10);
		/*
		 * 		00000011		3
		 * 	^	00001010		10
		 * -------------
		 * 		00001001		9
		 */
		
		// 10진수 3의 NOT 연산
		System.out.println(~3);
		/*
		 * ~	00000011		3
		 * -------------
		 * 		11111100		-4
		 */
		
		
		
	}

}
