package linkedlist;

public class SearchInLInkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		System.out.println(searchKey(3, head, 5));
	}
	
	static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node current=head;
        while(n!=0){
            if(current.data==key){
                return true;
            }
            current = current.next;
            n--;
        }
        return false;
    }
}
