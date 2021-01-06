class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
}

class InsertionLinkedList{

    public static Node insertAtBegin(Node head,int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public static Node insertAtEnd(Node head,int data){
        if(head == null) return null;
        Node current = head;
        Node newNode = new Node(data);
        while(current.next !=  null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(" "+current.data);
            current = current.next;
        }
    }

    public static void main(String args[]){

        Node head = null;
        head = insertAtBegin(head,10);
        head = insertAtBegin(head,20);
        head = insertAtBegin(head,30);
        head = insertAtBegin(head,40);
        head = insertAtEnd(head,100);
        print(head);
    }
}