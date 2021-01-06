class Node{

    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class DeletionLinkedList{

    public static Node deleteHead(Node head){
        if(head == null) return null;
        return head.next;
    }

    public static Node deleteLastNode(Node head){
        if(head == null) return null;
        if(head.next == null) return null;

        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }
    
    public static Node insertAtBegin(Node head ,int data){
        
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
        Node head = new Node(10);
        head = insertAtEnd(head,20);
        head = insertAtEnd(head,30);
        head = insertAtEnd(head,40);
        print(head);
        System.out.println(" ");
        head = deleteHead(head);
        System.out.println("===== After Deleting Head =======");
        print(head);
        System.out.println("===== After Deleting Last Node =======");
        head = deleteLastNode(head);
        print(head);



    }
}