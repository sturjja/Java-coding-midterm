package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
Queue<String> queue = new LinkedList<String>();
		queue.add("basketball");
		queue.add("baseball");
		queue.add("volleyball");
		queue.add("football");
		queue.add("handball");

		System.out.println("Demonstrating Queue methods:");
		System.out.println("The Queue is: " + queue);
		System.out.println("Peeking at the front of the Queue: " + queue.peek());
		System.out.println("Removing the front element of the Queue: " + queue.remove());
		System.out.println("The Queue is now: " + queue);
		System.out.println("Polling the front element of the Queue: " + queue.poll());
		System.out.println("The Queue is now: " + queue);

		//iterating using for each loop
		System.out.println("iterating using for each loop");
		for(String element : queue) {
			System.out.print(element + " ");
		}
		System.out.println();

	//iterating using a while loop

		System.out.println("iterating using a while loop and Iterator");
	Iterator<String> iterator = queue.iterator();
	while (iterator.hasNext()){
		String element = iterator.next();
		System.out.print(element + " ");
	}

	}

}
