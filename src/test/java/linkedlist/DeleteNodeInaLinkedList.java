package linkedlist;


//Start from the node given
//bring each node value one step back
//at each point , check if current.next.next==null -if true,set current.next=null and break
public class DeleteNodeInaLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		deleteNode(head);

	}
	
	public static void deleteNode(Node node) {
        Node current=node;
        while(current.next!=null){
            current.data=current.next.data;
            if(current.next.next==null){
                current.next=null;
                break;
            }
            current=current.next;
        }
}
}
