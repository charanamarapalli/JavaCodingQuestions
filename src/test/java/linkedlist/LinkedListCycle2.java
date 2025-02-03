package linkedlist;

import java.util.HashSet;

public class LinkedListCycle2 {
	public static void main(String[] args) {
		Node head=new Node(90);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=head;
		System.out.println(hasCycle(head).data);
		System.out.println(hasCycleOptimised(head).data);
	}
	
	public static Node hasCycle(Node head) {
		//o(N) extra space
		HashSet<Node> hs=new HashSet<>();
		Node current=head;
		while(current!=null) {
			if(hs.contains(current)) {
				return current;
			}
			hs.add(current);
			current=current.next;
		}
		return null;
	}
	
	public static Node hasCycleOptimised(Node head) {
		//o(1) extra space
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
