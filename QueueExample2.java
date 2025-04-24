package JavaProgm;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueExample2 {

	public static void main(String[] args) {
		Queue<String> que=new LinkedList<>();
		// add elements to the queue
		que.add("apple");
		que.add("banana");
		que.add("cherry");
		
		Queue<String> que1=new LinkedList<>();
		que1.add("iceapple");
		que1.add("orange");
		que1.add("guava");
		que1.add("guava");
		que1.add("orange");
		
		//for removing duplication
		Queue<String> duplicateremoval=new PriorityQueue<String>(new TreeSet<String>(que1));
		System.out.println("the duplicates:"+" "+duplicateremoval);
		// also remove duplicate by using offer
	     
		
		//print the queue
		System.out.println("Queue:" +que);
		
		//remove element at the front of the queue
		String front =que.remove();
		System.out.println("Remove element : "+front);
		
		//print the updated queue
		System.out.println("queue after removal 1: "+que);
		
		//add another element to queue in queue
		que.add("date");
		
		//peek in the element is  at the front of the queue 
		String peeked =que.peek();
		System.out.println("Peeked element:  "+peeked);
		
		//print the updated queue
		System.out.println("queue after peek: "+que);
		
		String poll=que.poll();
		System.out.println("que after poll:"+poll);
		
		boolean isEmpty=que.isEmpty();
		System.out.println("que after is empty:"+isEmpty);
		
		//comparing two queue
		int size=que.size();
		int size1=que1.size();
		System.out.println("queue size:"+size+" "+"queue1 size: "+size1);
		if(size1>size) {
			System.out.println("queue1 is bigger");
			
		}else {
			System.out.println("queue is bigger");
		}
		
		
		
	
	}

}
