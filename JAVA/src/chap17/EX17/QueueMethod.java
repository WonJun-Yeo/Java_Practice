package chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

/* Queue : FIFO (First In First  Out) : 처음 들어간 값이 처음 나온다.
 */


public class QueueMethod {

	public static void main(String[] args) {
		
		// 1. 예외 처리를 미포함한 메소드 ( add(), element(), remove() )
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
			// add() : 큐에 값을 추가
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
			System.out.println();
			
			// element() : 가장 먼저 나올값 확인
			System.out.println(queue1.element());						// 값이 없는 상태에서 실행 시, NoSuchElementException 예외 발생
			
			System.out.println();
			
			// remove() : 큐의 값을 끄집어 낼때 사용
			System.out.println(queue1.remove());
			System.out.println(queue1.remove());
			System.out.println(queue1.remove());
			//System.out.println(queue1.remove());						// 값이 없는 상태에서 실행 시, NoSuchElementException 예외 발생
			
			System.out.println("================================");
		
		// 2. 예외처리 포함 에소드 ( offer(), peek(), poll() **사용권장)
		Queue<Integer> queue2 = new LinkedList<Integer>();
			// offer() : 큐에 값을 추가
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);

			System.out.println();
			
			// peek() : 가장 먼저 나올값 확인
			System.out.println(queue2.peek());							// 값이 없는 상태에서도 예외처리가 되어있어 발생되지 않고 null 반환

			System.out.println();
			
			// poll() : 큐의 값을 끄집어 낼때 사용
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());							// 값이 없는 상태에서도 예외처리가 되어있어 발생되지 않고 null 반환
			
			
		
	}

}
