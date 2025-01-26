package doublyLinkedList;

public class ArrayToDoubleLinkedList {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		//Best Way--
		arrToDoubLinkList(arr);
		
		//my way
        Node current = new Node(arr[0]);
        Node head=current;
        Node back=null;
        head.prev=back;
        
        for(int i=1; i<arr.length;i++) {
        	current.next=new Node(arr[i]);  // create a node and set it as currents'next node
        	back=current;  //set back to current
        	current=current.next; //current to current.next
        	current.prev=back; //current's previous as back
        }
        
        printAll(head);
        
	}

	private static void printAll(Node head) {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data + "->");
			current=current.next;
		}
	}
	
	public static Node arrToDoubLinkList(int arr[]) {
		Node head = new Node(arr[0]);
		Node current=head;
		
		for(int i=1; i<arr.length;i++) {
			Node nextNode =new Node(arr[i]); //create a node
			current.next=nextNode; //point the created node as current's next Node
			nextNode.prev=current; //point the current node as created's prev node
			current=nextNode;
		}
		return head;
	}
	

}
