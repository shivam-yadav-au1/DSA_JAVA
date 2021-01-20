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
        System.out.println("");
    }

    public static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = head.next;
        return current.next;
    }
    // 1 ==> 2 ==>3 ==> 4 ==> 5
    // 2 ==> 2 ==>3 ==>4 ==>5
    public static Node deleteHeadEfficient(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
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

    public static Node deleteKthNode(Node head,int k){
        if(head == null) return head;
        if(k == 1){
            return deleteHeadEfficient(head);
        }
        Node current = head;
        for(int i=0;i<k - 1;i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
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

    public static Node insertAtEnd(Node head,int data){
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
        return head;
    }
    // 1 2 3 4 
    // 1-> 7 ->2
    public static Node insertAtEndEfficient(Node head,int data){
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }else{
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
        }
        return temp;
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
        System.out.println("After inserting at end .");
        newhead = insertAtEndEfficient(newhead,60);
        traverse(newhead);
        newhead = deleteHeadEfficient(newhead);
        traverse(newhead);
        System.out.println("After deleting at kth node.");
        newhead = deleteKthNode(newhead,4);
        traverse(newhead);


    }
}