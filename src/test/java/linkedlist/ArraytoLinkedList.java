package linkedlist;

public class ArraytoLinkedList {

	public static void main(String[] args) {
		// code here
		int arr[]= {1,2,3,4,5,6};
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1; i<arr.length; i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        System.out.println(head.data);
	}
}
