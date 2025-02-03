package doublyLinkedList;

public class Node {

	int data;
	Node prev;
	Node next;
	Node(){
		
	}
	
	Node(int data){
		next=null;
		prev=null;
		this.data=data;
	}
	
    Node(Node prev, Node next, int data){
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}
