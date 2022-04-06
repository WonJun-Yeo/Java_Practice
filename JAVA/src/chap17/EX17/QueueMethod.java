package chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

/* Queue : FIFO (First In First  Out) : ó�� �� ���� ó�� ���´�.
 */


public class QueueMethod {

	public static void main(String[] args) {
		
		// 1. ���� ó���� �������� �޼ҵ� ( add(), element(), remove() )
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
			// add() : ť�� ���� �߰�
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
			System.out.println();
			
			// element() : ���� ���� ���ð� Ȯ��
			System.out.println(queue1.element());						// ���� ���� ���¿��� ���� ��, NoSuchElementException ���� �߻�
			
			System.out.println();
			
			// remove() : ť�� ���� ������ ���� ���
			System.out.println(queue1.remove());
			System.out.println(queue1.remove());
			System.out.println(queue1.remove());
			//System.out.println(queue1.remove());						// ���� ���� ���¿��� ���� ��, NoSuchElementException ���� �߻�
			
			System.out.println("================================");
		
		// 2. ����ó�� ���� ���ҵ� ( offer(), peek(), poll() **������)
		Queue<Integer> queue2 = new LinkedList<Integer>();
			// offer() : ť�� ���� �߰�
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);

			System.out.println();
			
			// peek() : ���� ���� ���ð� Ȯ��
			System.out.println(queue2.peek());							// ���� ���� ���¿����� ����ó���� �Ǿ��־� �߻����� �ʰ� null ��ȯ

			System.out.println();
			
			// poll() : ť�� ���� ������ ���� ���
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());							// ���� ���� ���¿����� ����ó���� �Ǿ��־� �߻����� �ʰ� null ��ȯ
			
			
		
	}

}
