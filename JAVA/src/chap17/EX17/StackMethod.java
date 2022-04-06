package chap17.EX17;

import java.util.Stack;

/* Stack 자료구조 : LIFO (Last In First Out) : 제일 마지막에 저장하는 값이 제일 처음 나옴
 * 
 */


public class StackMethod {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// 1. E push (E element) : Stack에 값을 넣을 때 사용.
		
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		
		System.out.println(stack);
		
		System.out.println("================================");
		
		// 2. E peek() : 가져올 값을 위에서 쳐다봄
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println("================================");
		
		// 3. search(Object o) : 값을 넣어 index를 반환 **index는 위에서 1부터 할당된다. 값이 존재하지 않으면 -1
		
		System.out.println(stack.search(7));
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(1));

		System.out.println("================================");
		
		// 4. E pop() : Stack 값 가져오기 **index 1부터 가져올 수 있다. 중간에 존재하는 임의의값은 가져오지 못한다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// System.out.println(stack.pop());									// 더이상 값이 존재하지 않으면 EmptyStackException 발생
		
		System.out.println("================================");
		
		// 5. boolean empty() : Stack 이 비어 있을경우 true, 값이 존재할 경우 false 반환
		System.out.println(stack.empty());
		
		
		
	}

}
