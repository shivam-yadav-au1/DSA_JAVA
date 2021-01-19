class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
}
// 10 20 30 40 50
class CircularLinkedList{

    public static void traverse(Node head){
        
        if(head == null){
            return ;
        }
        Node c = head;
        do{
            System.out.print(""+c.data+" ");
            c = c.next;
        }while(c != head);
    }

    public static Node insertAtBegin(Node head,int data){
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
        }else{
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = temp;
            temp.next = head;
        }
        return temp;
    }

    public static Node insertAtBeginEfficient(Node head,int data){
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
        }else{
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
        }
        return head;
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;
        traverse(head);
        System.out.println("After inserting at begining :");
        Node newhead = insertAtBeginEfficient(head,5);
        traverse(newhead);

    }
}