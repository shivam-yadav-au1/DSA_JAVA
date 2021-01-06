class Node{

    int data;
    Node next;
    Node(int x){
        this.data = x;
        next = null;
    }
}

class TraversLinkedList{

    public static void print(Node head){
        
        Node curr = head;
        while(curr != null){
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }

    public static void recursivePrint(Node head){
        if(head == null){
            return;
        }
        System.out.print(" "+head.data);
        recursivePrint(head.next);
    }

    public static int search(Node head,int data){
        Node current  = head;
        int findIndex = 0;
        while(current != null){
            findIndex += 1;
            if(current.data == data){
                
                return findIndex;
            }
            current = current.next;
        }
        return -1;
    }

    public static int recursiveSearch(Node head,int data){

        if(head == null){
            return -1;
        }
        if(head.data == data){
            return 1;
        }else{

            int res = recursiveSearch(head.next,data);
            if(res == -1){
                return -1;
            }else{
                return (res + 1);
            }
        }
    }

    public static void main (String args[]){

            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            recursivePrint(head);
            int index = recursiveSearch(head,20);
            System.out.println(" ");
            System.out.println(" Index : "+index);
    }
}