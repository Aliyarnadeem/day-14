import java.util.Iterator;
import java.util.*;

public class queueCollection {
	public static void main(String args[])
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();

		// Use add() method to add elements into the Queue
		queue.add("Banglore");
		queue.add("Chennai");
		queue.add("Hyderabad");
		queue.add("Kerela");
		queue.add("mysore");

		// Displaying the PriorityQueue
		System.out.println("PriorityQueue: " + queue);

		// Creating an iterator
		Iterator value = queue.iterator();

		// Displaying the values after iterating through the queue
		System.out.println("The iterator values are: ");
		while (value.hasNext()) {
			System.out.println(value.next());
		}
	}
}
