class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data = d;
        prev = null;
        next = null;
    }
}

class DublyLinkedList{

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static Node insertBegin(Node head,int data){
        Node temp = new Node(data);
        temp.next = head;
        if(head != null){
            head.prev = temp;
            return temp;
        }
        return temp;
    }

    public static Node insertAtEnd(Node head ,int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
    }
    
    public static void main(String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = insertBegin(head,5);
        head = insertAtEnd(head,40);
        printlist(head);
        
    }
}