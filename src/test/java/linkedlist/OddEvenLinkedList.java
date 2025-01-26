package linkedlist;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(10);
		head.next.next.next=new Node(4);
		
		// for code 1,3,10,5,4,6,8 - o/p is 1,3,5,10,4,6,8.
		//segregation is done based on node value.
		printAll(diffOddEven(head));
		
		//https://leetcode.com/problems/odd-even-linked-list/
		//As per this leetcode - just segregate based on odd and even indexes
		printAll(diffOddEvenNodes(head));
		
		
	}
	
	public static Node diffOddEvenNodes(Node current) {
		Node evenTail=null, evenHead=null;
		Node oddHead=null, oddTail=null;
		Boolean isEvenBool=false;
		while(current!=null) {
		if(isEvenBool) {
			if(evenHead==null) {
				evenHead=evenTail=current;
			}
			else {
				evenTail.next=current;
				evenTail=evenTail.next;
			}
			isEvenBool=false;
		}
		else {
			if(oddHead==null) {
				oddHead=oddTail=current;
			}
			else {
				oddTail.next=current;
				oddTail=oddTail.next;
			}
			isEvenBool=true;
		}
		current=current.next;
		}
		
		if(evenTail!=null){
            evenTail.next=null;
        }
        if(oddTail!=null){
            oddTail.next=evenHead;
        }
		return oddHead;
	}
	
	
	public static Node diffOddEven(Node current) {
		Node evenTail=null, evenHead=null;
		Node oddHead=null, oddTail=null;
		while(current!=null) {
		if(current.data%2==0) {
			if(evenHead==null) {
				evenHead=evenTail=current;
			}
			else {
				evenTail.next=current;
				evenTail=evenTail.next;
			}
		}
		else {
			if(oddHead==null) {
				oddHead=oddTail=current;
			}
			else {
				oddTail.next=current;
				oddTail=oddTail.next;
			}
		}
		current=current.next;
		}
		
		if(evenTail!=null){
            evenTail.next=null;
        }
        if(oddTail!=null){
            oddTail.next=evenHead;
        }
		return oddHead;
		
	}

	private static void printAll(Node even) {
		while(even!=null) {
			System.out.println(even.data);
			even=even.next;
		}
		
	}
}
