import java.util.*;
class Node{

    int data;
    Node next;
    Node(int x){
        this.data = x;
        next = null;
    }
}

class ReverseLinkedList{


    public static Node reverseLinkedList(Node head){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Node current = head;
        while(current != null){
            array.add(current.data);
            current = current.next;
        }
        current = head;
        while(current != null ){
            current.data = array.remove(array.size() - 1);
            current = current.next;
        }
        return head;
    }
 // <==1  2 ==> 3 ==> 4
    public static Node efficientReverse(Node head){
        
        if(head == null) return null;
        Node current = head;
        Node previous = null;
        while(current != null){
            Node  next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    public static void print(Node head){
        
        Node curr = head;
        while(curr != null){
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head = efficientReverse(head);
        print(head);
    }
}