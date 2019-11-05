/**
 * 
 */
package Chapter_2;

import java.util.EmptyStackException;

/**
 * @author yogeshverma
 *
 */
public class Stack {
	
	private static class Node {
		private int data;
		private Node next;
		private Stack s = new Stack();
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	
	public int pop() {
		if (top == null) throw new EmptyStackException();
		int item = top.data;
		top = top.next;
		return item;
	}
	public void push(int data) {
		Node item = new Node(data);
		item.next = top;
		top = item;
	}
	public int top() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	public int getMin() {
		Node item = top;
		int min = item.data;
		while(item.next != null) {
			item = item.next;
			if (item.data < min) {
				min = item.data;
			}
		}
		return min;
	}

}
