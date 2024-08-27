package Collections;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class LinkedList{
    Node head;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }

        else{
            Node current =head;
            while(current.next!=null){
                current=current.next;
            }

            current.next = newNode;
        }
    }

    public void deleteNode(int data){
        if(head==null){
            return;
        }

        if(head.data==data){
            head=head.next;
        }

        Node prev = head;
        Node current = head.next;

        while(current.data!=data && current!=null){
            prev = current;
            current= current.next;
        }

        if(current!=null){
            prev.next = current.next;
        }
    }

    public void printList(){
        if(head==null){
            return;
        }

        Node current = head;
        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        list.printList(); // output: 1 2 3 4

        list.deleteNode(2);

        list.printList(); // output: 1 3 4
    }
        }

