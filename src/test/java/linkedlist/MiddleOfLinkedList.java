package linkedlist;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		
	}
	
	public static Node middleNode(Node head) {
		if(head==null) {
			return null;
		}
		Node first=head;
		if(first.next==null) {
			return head;
		}
		Node second=first.next;
		
		while(second!=null && second.next!=null && second.next.next!=null) {
			first=first.next;
			second=second.next.next;
			
		}
        return first.next;
    }
	
	public static Node middleNodeEvenSimplerWay(Node head) {
		Node first=head;
		Node second=head;
		
		while(second!=null && second.next!=null) {
			first=first.next;
			second=second.next.next;
			
		}
        return first;
    }
}
