package chap17.EX17;

import java.util.Stack;

/* Stack �ڷᱸ�� : LIFO (Last In First Out) : ���� �������� �����ϴ� ���� ���� ó�� ����
 * 
 */


public class StackMethod {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// 1. E push (E element) : Stack�� ���� ���� �� ���.
		
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		
		System.out.println(stack);
		
		System.out.println("================================");
		
		// 2. E peek() : ������ ���� ������ �Ĵٺ�
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println("================================");
		
		// 3. search(Object o) : ���� �־� index�� ��ȯ **index�� ������ 1���� �Ҵ�ȴ�. ���� �������� ������ -1
		
		System.out.println(stack.search(7));
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(1));

		System.out.println("================================");
		
		// 4. E pop() : Stack �� �������� **index 1���� ������ �� �ִ�. �߰��� �����ϴ� �����ǰ��� �������� ���Ѵ�.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// System.out.println(stack.pop());									// ���̻� ���� �������� ������ EmptyStackException �߻�
		
		System.out.println("================================");
		
		// 5. boolean empty() : Stack �� ��� ������� true, ���� ������ ��� false ��ȯ
		System.out.println(stack.empty());
		
		
		
	}

}
