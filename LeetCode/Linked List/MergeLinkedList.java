  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}}

class MergeLinkedList{

// -9 3
//  5 7
// 9 3
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode newList = head;
            while(l1 != null && l2 != null ){
                if(l1.val <= l2.val){
                     newList.next = l1;
                     l1 = l1.next;
                }else if(l1.val > l2.val){
                     newList.next = l2;
                     l2 = l2.next;
                }
                    newList = newList.next;
            }
            while(l1 != null){
                newList.next = l1;
                l1 = l1.next;
                newList = newList.next;
            }
            while(l2 != null){
                System.out.println(" inside l2 "+l2.val);
                newList.next = l2;
                l2 = l2.next;
                newList = newList.next;
            }
            return head.next;          
    }

    public static void print(ListNode head){
          ListNode current = head;
          while(current != null){
              System.out.print(" "+current.val);
              current = current.next;
          }
      }

    public static void main(String args[]){
        ListNode n2 = new ListNode(3);
        ListNode n1 = new ListNode(-9,n2);
        
        ListNode n4 = new ListNode(7);
        ListNode n3 = new ListNode(5,n4);
        ListNode node = mergeTwoLists(n1,n3);
        print(node);
        
    }
}