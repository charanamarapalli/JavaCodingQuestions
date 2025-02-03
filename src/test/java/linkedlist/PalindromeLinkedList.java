package linkedlist;

import java.util.Stack;


public class PalindromeLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
//		head.next.next=new Node(6);
//		head.next.next.next=new Node(6);
//		head.next.next.next.next=new Node(2);
//		head.next.next.next.next.next=new Node(1);

		System.out.println(isPalindromeBruteForce(head));
		System.out.println(isPalindromeOptimalApproach(head));
	}
	
	public static boolean isPalindromeBruteForce(Node head) {
		Stack<Integer> st=new Stack<>();
		Node current=head;
		while(current!=null) {
			st.push(current.data);
			current=current.next;
		}
		
		current=head;
	    while(!st.isEmpty()) {
	    	if(st.pop()!=current.data) {
	    		return false;
	    	}
	    	current=current.next;
	    }
		return true;
	}
	
	public static boolean isPalindromeOptimalApproach(Node head) {
		
		Node fast=head;
		Node slow=head;
		
		// Go till middle position
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		//if nodes are odd - then skip the slow node
		//then slow at 2 and fast is null - then move slow by 1 point
		//slow becomes 3
		//reverse 3 which is again
		//compare 3 with 1 - false
		if(fast!=null) {
			slow=slow.next;
		}
		
		//Reverse from slow to end of list

		Node prev=null;
		while(slow!=null) {
			Node front = slow.next;
			slow.next=prev;
			prev=slow;
			slow=front;
		}
		
		fast=head;
		//compare reversed half and starting half
		while(prev!=null) {
			if(prev.data!=fast.data) {
				return false;
			}
			prev=prev.next;
			fast=fast.next;
		}
		return true;
	}
	
	
}
