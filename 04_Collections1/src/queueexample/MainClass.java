package queueexample;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainClass {

	public static void main(String[] args) {
		
		//pop, poll, removeFirst, removeLast, offer, peek, push
		
		
		Deque<String> queue = new ArrayDeque<String>();
		
		queue.add("item 1");
		queue.add("item 2");
		queue.add("item 3");
		queue.add("item 4");
		
		
		
		System.out.println("queue:" + queue);
		
		
		System.out.println("Item picked:" + queue.pop());
		
		System.out.println("queue:" + queue);
		
		//queue.pus
		
	}
	
	
}
