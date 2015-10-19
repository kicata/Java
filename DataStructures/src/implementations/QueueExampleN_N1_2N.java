package implementations;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleN_N1_2N {

	// S = N, N+1, 2*N, N+2, 2*(N+1), 2*N+1, 4*N, ...

	public static void main(String[] args) {
		int n = 3;
		int p = 16;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(n);
		int index = 0;
		System.out.println("S =");
		while (queue.size() > 0) {
			index++;
			int current = queue.poll();
			System.out.print(" " + current);
			if (current == p) {
				System.out.println();
				System.out.println(" Index = " + index);
				return;
			}
			queue.offer(current + 1);
			queue.offer(2 * current);
		}
	}

}
