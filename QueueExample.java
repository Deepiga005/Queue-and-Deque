package JavaProgm;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> que=new LinkedList<>();
		// add elements to the queue
		que.add("apple");
		que.add("banana");
		que.add("cherry");
		
		//print the queue
		System.out.println("Queue:" +que);
		
		//remove element at the front of the queue
		String front =que.remove();
		System.out.println("Remove element : "+front);
		
		//print the updated queue
		System.out.println("queue after removal 1: "+que);
		
		//add another element to queue
		que.add("date");
		
		//peek at the element at the front of the queue
		String peeked =que.peek();
		System.out.println("Peeked element:  "+peeked);
		
		//print the updated queue
		System.out.println("queue after peek: "+que);
		
		
	
	}

}
