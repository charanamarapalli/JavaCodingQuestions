package linkedlist;

public class DeleteMiddleOfLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		deleteMiddleOfLinkedList(head);
		
	}
	
	public static Node deleteMiddleOfLinkedList(Node head){
		Node back=null;
		if(head.next==null){
			return null;	
		}
		
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			back=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		
		back.next=slow.next;
		return head;
	}
}
