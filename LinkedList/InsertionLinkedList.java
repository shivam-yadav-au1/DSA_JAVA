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

    public static Node insertAtPosition(Node head,int data,int position){
        if(head == null){
            return  null;
        }
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        for(int i=0;i<= position-2 && current != null;i++){
            current = current.next;
        }
        if(current == null){
            return head;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;

    }

    public static Node sortedInsert(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        if(data < head.data){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        while(current.next != null && current.next.data < data){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void printMiddle(Node head){

        int count = 0;
        Node slow = head;
        Node fast = head;
        if(head == null){
            return;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(" Middle Element : "+slow.data);
    }

    public static void main(String args[]){

        Node head = null;
        // head = insertAtBegin(head,10);
        // head = insertAtBegin(head,20);
        // head = insertAtBegin(head,30);
        // head = insertAtBegin(head,40);
        // head = insertAtEnd(head,100);
        // head = insertAtPosition(head,50,3);
        // head = insertAtPosition(head,150,6);
        // head = insertAtPosition(head,10,1);
        head = insertAtBegin(head,10);
        head = insertAtEnd(head,20);
        head = insertAtEnd(head,30);
        head = insertAtEnd(head,40);
        head = insertAtEnd(head,50);
        head = sortedInsert(head,25);
        print(head);
        System.out.println(" ");
        printMiddle(head);
    }
}