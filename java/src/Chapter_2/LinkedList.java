/**
 * 
 */
package Chapter_2;

/**
 * @author yogeshverma
 *
 */
public class LinkedList {
	
	Node head;
	
	public static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		a.head = new Node(1);
		
		Node second = new Node(3);
		Node third = new Node(2);
		Node fourth = new Node(3);
		
		a.head.next = second;
		second.next = third;
		third.next = fourth;
		
		a.printList();
	}
}
