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
    // null 1 2 3 4 5 6
    public static Node reverse(Node head){
        if(head.next == null || head == null){
            return head;
        }
        Node current = head;
        Node temp = null;
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; 
        }
        temp = temp.prev;
        return temp;
    }
    //1 2 3 4 5
    public static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        current = current.next;
        current.prev = null;
        return current;
    }
    public static Node deleteLastNode(Node head){
        if(head == null ){
            return null;
        }
        if(head.next == null){
            return null;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.prev.next = null;
        return head;
    }
     public static void printlistCircular(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
    public static Node insertAtHeadCircularDoubly(Node head,int data){
           Node temp = new Node(data);
           if(head == null || head.next == null){
               return head;
           }
           temp.prev = head.prev;
           temp.next = head;
           head.prev.next = temp;
           head.prev = temp;
           return temp;
    }
    
    public static void main(String args[]){
        // Node head = new Node(10);
        // Node temp1 = new Node(20);
        // Node temp2 = new Node(30);
        // head.next = temp1;
        // temp1.prev = head;
        // temp1.next = temp2;
        // temp2.prev = temp1;
        // head = insertBegin(head,5);
        // head = insertAtEnd(head,40);
        // printlist(head);
        // head = deleteHead(head);
        // printlist(head);
        // head = deleteLastNode(head);
        // printlist(head);
        // head = reverse(head);
        // printlist(head);
         
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.next=temp2;
    	temp2.next=head;
    	temp2.prev=temp1;
    	temp1.prev=head;
    	head.prev=temp2;
    	head=insertAtHeadCircularDoubly(head,5);
    	printlistCircular(head);
        
    }
}