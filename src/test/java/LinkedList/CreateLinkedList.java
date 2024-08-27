package LinkedList;

import java.util.List;

public class CreateLinkedList {

    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode kotta = head.next;
        ListNode temp = null;
        while (current != null && kotta != null) {
            if (kotta.val == val && kotta.next != null) {
                current.next = kotta.next;
                current = kotta.next;
                kotta = current.next;
            }
        }
        return head;
    }

    public static void printElements(ListNode head) {
        /*ListNode current = head;
        ListNode kotta = head.next;
        ListNode temp = null;
        while(current!=null && kotta!=null ){
            if(kotta.val==val && kotta.next!=null){
                current.next=kotta.next;
                current=kotta.next;
                kotta=current.next;
            }
            }*/
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void insertElement(ListNode head, int ind, int value) {
        ListNode current = head;
        ListNode prev = null;
        int i = 0;
        while (current != null) {
            if (i == ind) {
                ListNode newNode = new ListNode(value, current);
                if (prev == null) {
                    head = newNode;
                } else {
                    prev.next = newNode;
                }
                break;


            } else {
                i++;
                prev = current;
                current = current.next;
            }
        }

    }

    public static void insertElementAtLastIndex(int value, ListNode head) {
        ListNode current = head;
        ListNode newNode = new ListNode(value, null);

        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = newNode;
        } else {
            // Traverse the list to find the last node
            while (current.next != null) {
                current = current.next;
            }

            // Append the new node to the end
            current.next = newNode;
        }

    }

    public static ListNode deleteFirstNode(ListNode head) {
        head = head.next;
        return head;
    }

    public static ListNode deleteLastNode(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return head;
    }

    public static ListNode deleteNodeWithValue(ListNode head, int value) {
        ListNode current = head;
        ListNode prev = null;


        return head;
    }

    public static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode fut = head.next;
        while (current != null) {
            current.next = prev;
            try {
                prev = current;
                current = fut;
                fut = current.next;
            } catch (NullPointerException e) {
                break;
            }

            /*System.out.println(prev.val);
            System.out.println(current.val);*/
        }
        return prev;
    }

    public static ListNode recursiveReverse(ListNode head) {
        return functionRecursion(head, null);
    }

    public static ListNode functionRecursion(ListNode current, ListNode prev) {
        if (current == null) {
            return prev;
        }

        ListNode fut = current.next;
        current.next = prev;

        return functionRecursion(fut, current);

    }

    public static ListNode removeElement(ListNode head, int val) {
        if (head == null || head.next == null) {

            if (head.val == val) return null;
            else return head;
        }

        ListNode current = head;
        ListNode prev = head;
        while (current != null) {
            if (current.val == val && current== head) {
                head=current.next;
                current=current.next;
                prev=prev.next;
            }
            else if(current.val==val && current!=head ){
                prev.next = current.next;
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int put;
        int left=0;
        ListNode current1 = l1;
        ListNode current2=l2;

        if(current1==null && current2==null){
            return null;
        }
        if(current1==null){
            return l2;
        }
        if(current2==null){
            return l1;
        }
        ListNode l3;



        if((l1.val + l2.val) >9){
            put = (l1.val + l2.val)%10;
            left = (l1.val + l2.val)/10;
            l3 = new ListNode(put);
            current1 = l1.next;
            current2 = l2.next;
        }
        else{
            l3=new ListNode(l1.val + l2.val);
            current1 = l1.next;
            current2 = l2.next;
        }


        while(current1!=null && current2!=null){
            if((l1.val + l2.val +left) >9){
                put = (l1.val + l2.val)%10;
                left = (l1.val + l2.val)/10;
                l3.next = new ListNode(l1.val + l2.val + put);
                current1 = l1.next;
                current2 = l2.next;
            }
            else{
                l3.next = new ListNode(l1.val + l2.val);
                current1 = l1.next;
                current2 = l2.next;
            }
        }

        while(current1!=null){
            l3.next = current1;
            l3.next.val = current1.val+ left;
            left=0;
            current1=current1.next;
        }
        while(current2!=null){
            l3.next = current2;
            l3.next.val = current2.val+ left;
            left=0;
            current2=current2.next;
        }

        return l3;
    }

    /*public static ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2){


        return null;

    }

    public static ListNode addTwoNumbersRecursiveFunction(ListNode l1, ListNode l2){


        return null;

    }*/

    public static ListNode addTwoNumbersMethod2(ListNode l1, ListNode l2){
        ListNode current1 = l1;
        ListNode current2 = l2;
        int left=0;
                int put;
        while(current1!=null && current2!=null) {
            if (l1.val + l2.val + left > 9) {
                put = (l1.val + l2.val) % 10;
                left = (l1.val + l2.val) / 10;
                l1.val = put;
                current1 = current1.next;
                current2 = current2.next;
            } else {
                l1.val = l1.val + l2.val + left;
                left=0;
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        while(left!=0){
            current1=new ListNode(left, null);
        }


        return l1;

    }

    public static ListNode middleNode(ListNode head) {
        ListNode current = head;
        int index=0;
        while(current!=null){
            ++index;
            current = current.next;
        }

        int position = index/2;
        System.out.println("position" + position);
        index=0;

        ListNode temp = head;
        while(temp!=null){
            if(position==index){
                System.out.println("I entered here");
                return temp;
            }
            else {
                System.out.println("hey"+ index);
                index++;
                temp=temp.next;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        /*ListNode t2 = new ListNode(4, null);
        ListNode t1 = new ListNode(3, t2);*/
        //ListNode t = new ListNode(2, null);
        ListNode l1 = new ListNode(2,null);

        //printElements(l1);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2, l2);
        l2.next.next = new ListNode(3, l2);
        l2.next.next = new ListNode(4, l2);
        l2.next.next.next = new ListNode(5, null);
        printElements(l2);
        System.out.println("process satrted");

        ListNode nest= middleNode(l2);

        printElements(nest);


        /*ListNode l3 = addTwoNumbersMethod2(l1,l2);
        printElements(l3);*/

        /*ListNode l3 = addTwoNumbers(l1, l2);
        printElements(l3);*/

        /*l2 = removeElement(l2, 7);
        System.out.println("AFTER");
        printElements(l2);*/

        /*head = recursiveReverse(head);
        System.out.println("AFTER");
        printElements(head);*/


        /*insertElement(head, 4,5);
        System.out.println("AFTER");
        printElements(head);*/

        /*insertElementAtLastIndex(10, head);
        System.out.println("AFTER");
        printElements(head);*/

       /* head = deleteFirstNode(head);
        System.out.println("AFTER");
        printElements(head);*/

        /*head= deleteLastNode(head);
        System.out.println("AFTER");
        printElements(head);*/

        /*head = reverseLinkedList(head);
        System.out.println("AFTER");
        printElements(head);*/


    }
}
