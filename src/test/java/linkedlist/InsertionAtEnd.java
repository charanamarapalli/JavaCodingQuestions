package linkedlist;

public class InsertionAtEnd {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		
		System.out.println(insertAtEnd(head, 4));
	}
	
	public static Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null){
            return new Node(x);
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        
        current.next=new Node(x);
        return head;
    }
}
