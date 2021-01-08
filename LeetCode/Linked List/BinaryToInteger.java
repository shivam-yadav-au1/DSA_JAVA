  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}

      public static void print(ListNode head){
          ListNode current = head;
          while(current != null){
              System.out.print(" "+current.val);
              current = current.next;
          }
      }

    public static int getDecimalValue(ListNode head) {
        ListNode current = head;
        int num = 0;
        while(current != null){
            //System.out.print(" val : "+current.val);
            num = num * 2 + current.val;
            current = current.next;
        }
        return num;
    }
 }


class BinaryToInteger{


    public static void main(String args[]){
        ListNode linkedList = new ListNode(1,new ListNode(0,new ListNode(1)));
        // linkedList.print(linkedList);
        int res = linkedList.getDecimalValue(linkedList);
        System.out.println("Res : "+res);
    }
}