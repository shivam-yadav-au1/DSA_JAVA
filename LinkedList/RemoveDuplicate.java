class Node{

    int data;
    Node next;
    Node(int x){
        this.data = x;
        next = null;
    }
}

// 10 ==>30 ==> 30==> 30==> 50
//  10 ==>30==>30==>50 
class RemoveDuplicate{

    public static void removeDuplicate(Node head){

            Node current = head;
            while(current != null && current.next != null){
                if(current.data == current.next.data){
                    current.next = current.next.next;
                }else{
                    current = current.next;
                }
            }
            // return head;
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
        head.next = new Node(30);
        head.next.next = new Node(30);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(50);
        removeDuplicate(head);
        print(head);

    }
}