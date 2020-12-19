// { Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Triplet g=new Triplet();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}// } Driver Code Ends


/*Complete the function below*/


class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        int sum = 0;
        int left;
        int right;
        for(int i=0;i<n-2;i++){
            left = i+1;
            right = n - 1;
            while(left < right){
                if((arr[i] + arr[left] + arr[right]) == sum){
                    return true;
                }else if((arr[i] + arr[left] + arr[right]) < sum){
                    left ++;
                }else {
                    right --;
                }
            }               
        }
        return false;
    }
}