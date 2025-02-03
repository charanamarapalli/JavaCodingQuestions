package linkedlist;


import java.util.HashSet;

public class LinkedListCycle {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=head;
		System.out.println(hasCycle(head));
	}
	
	public static boolean hasCycle(Node head) {
		//o(N) extra space
		HashSet<Node> hs=new HashSet<>();
		Node current=head;
		while(current!=null) {
			if(hs.contains(current)) {
				return true;
			}
			hs.add(current);
			current=current.next;
		}
		return false;
	}
	
	public static boolean hasCycleOptimised(Node head) {
		//o(N) extra space
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	
}
