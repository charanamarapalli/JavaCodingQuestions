package linkedlist;

public class CountLinkedListNodes {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		System.out.println(getCount(head));

	}
	
	public static int getCount(Node head) {
        Node current=head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
}
