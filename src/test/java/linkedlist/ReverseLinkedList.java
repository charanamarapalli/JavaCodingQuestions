package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		
		reverseList(head);
		Node current = reverseListRecursive(head);
		while(current!=null) {
			System.out.print(current.data+ " -> ");
			current=current.next;
		}
	}
	
	private static Node reverseListRecursive(Node head) {
		Node current=head;
		Node prev=null;
		return reverse(prev, current);
		
	}
   private static Node reverse(Node prev, Node current) {
		if(current==null) {
			return prev;
		}
		
		Node front=current.next;
		current.next=prev;
		prev=current;
		
		return reverse(prev, front);	
	}

private static Node reverseList(Node head) {
		Node prev=null;
		Node current=head; //Only current is initialised
		Node nex=null;
		
		while(current!=null) {
			//step1 - remember the current next position
			nex=current.next;
			
			//step2 - point current to prev
			current.next=prev;
			
			//step3 - move next to current position
			prev=current;
			
			//step 4- move current to next position
			current=nex;
		}
		return prev;
	}



public static Node reverseListMyOwnFailed(Node head) {
	   Node current=head;
	   Node prev=null;
	   if(head.next==null) {
		   return head;
	   }
	   Node nex=head.next;
	   
	   while(current.next!=null) {
		   current.next=prev;
		   prev=current;
		   current=nex;
		   nex=nex.next;
	   }
        return prev;
    }
}
