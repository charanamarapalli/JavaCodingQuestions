package doublyLinkedList;

public class InsertionAtGivenPosition {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6}; 
		Node head=ArrayToDoubleLinkedList.arrToDoubLinkList(arr);
		addNode(head, 7, 3);
	}
	
    public static Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);
        int start=0;
        Node current=head;
        while(start<=p) {
        	current=current.next;
        }
        
        Node nodeAfterCurrent = current.next;
        current.next=newNode;
        nodeAfterCurrent.prev=newNode;
        return head;
    }
}
