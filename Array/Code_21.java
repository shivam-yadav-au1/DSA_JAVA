// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Array {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Input testcases
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    //input size of Array
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    
		    //input elements in the Array
		    for(int i=0;i<sizeOfArray-1;i++)
		    {
		        int x;
		        x=sc.nextInt();
		        arr[i]=x;
		    }
		    
		    //input index
		    int index=sc.nextInt();
		    //input element
		    int element=sc.nextInt();
		    
		    Insert obj=new Insert();
		    
		    //calling insertAtIndex() function
		    obj.insertAtIndex(arr,sizeOfArray,index,element);
		    
		    //Printing the array for verification
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        System.out.print(arr[i]+" ");
		        
		    }
		    
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java
// 7 7 1 1
// 7 3 7 1 1
//Complete this function, Geeks
class Insert
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        System.out.println("Size of Array :"+arr.length);
        
        int n = sizeOfArray - 1;
        for(int i=n;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        
    }


}