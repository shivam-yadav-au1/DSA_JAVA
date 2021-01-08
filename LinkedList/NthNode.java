class Node{

    int data;
    Node next;
    Node(int x){
        this.data = x;
        next = null;
    }
}


class NthNode{

    public static int naiveNthNode(Node head,int n){
        Node first = head;
        Node second = head;

        if(head == null) return -1;
        int len = 0;
        Node current = head;
        while(current != null){
            current = current.next;
            len+=1;
        }
        current = head;
        for(int i=1;i<len-n + 1;i++){
            current = current.next;
        }
        return current.data;
    }

    public static int twoPointerNthNode(Node head,int n){
        Node first= head;
        Node second = head;
        if(head == null) return -1;
        for(int i=0;i<n;i++){
            if(first == null) return -1;
            first = first.next;
        }
        while(first != null){
            second = second.next;
            first = first.next;
        }
        return second.data; 
    }


    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println(" Nth Node : "+twoPointerNthNode(head,2));
        System.out.println(" Nth Node : "+naiveNthNode(head,2));
    }
}