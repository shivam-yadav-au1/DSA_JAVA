// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class InsertAtNthNode
{
    public static Node insertNode(Node head, int data)
    {
        if(head == null)
            return new Node(data);
            
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
            
        temp.next = new Node(data);
        return head;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            String str[] = read.readLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
            
            str = read.readLine().trim().split(" ");
            int pos = Integer.parseInt(str[0]);
            int data = Integer.parseInt(str[1]);
            makeCircular(head);
            new Solution().insertAtPosition(head, pos, data);
            displayList(head);
            System.out.println();
        }
    }
    
    public static void displayList(Node head)
    {
        Node temp = head;
        while(temp.next != head)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }
    
    
    
    
    
    
    
    public static void makeCircular(Node head)
    {
        Node temp = head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
    }
    
    
}// } Driver Code Ends


//User function Template for Java


/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution
{
    public static void insertAtPosition(Node head, int pos, int data)
    {
        // your code here
        Node newNode = new Node(data);
        int count = 1;
        Node current = head;
        while(current.next != head){
            count += 1;
            current = current.next;
        }
        System.out.println("count : "+count);
        if(pos > count){
            return;
        }else if(pos == count){
            Node  temp=head;
            while(temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = new Node(data);
            temp = temp.next;
            temp.next = head;
            return;
        }
        
        current = head;
        int counter = 1;
        while(counter != pos && current.next != null){
            counter += 1;
            current = current.next;
        }
        Node next  = current.next;
        current.next = newNode;
        newNode.next = next;
        
    }
}

