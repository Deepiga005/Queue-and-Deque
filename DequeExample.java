package JavaProgm;
import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> d = new ArrayDeque<>();
		
		d.addFirst("1");		
		d.addLast("2");
		d.addLast("3");
		d.addLast("4");
		d.addLast("5");
		d.addLast("6");
		d.addLast("7");
		
		System.out.println("the list"+d);
		
		String l =d.removeLast();
		String fr =d.removeFirst();
		String t=d.getFirst();
		String last=d.getLast();
		
		//display the Deque
		System.out.println("First: "+fr+", Last: "+l);
		System.out.println("GetFirst: "+t+", GetLost: "+last);
	
	
	
	}

}
