/**
 * 
 */
package Chapter_2;

import Chapter_2.LinkedList.Node;

/**
 * @author yogeshverma
 *
 */
public class Q2 {

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
	
	public static void removeDuplicates(LinkedList list) {
		Node ptr1 = null;
		Node ptr2 = null;
		Node dup = null;
		
		while(ptr1 != null && ptr1.next != null) {
			while(ptr2 != null && ptr2.next != null) {
				
			}
		}
	}
	
	

}
