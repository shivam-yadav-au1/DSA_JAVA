//Find the "Kth" max and min element of an array 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	static int getKsmallest(int arr[],int kth){
			return arr[kth];
	}

	static void quickSort(int arr[],int low,int high){
		
		if(low < high){
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	static int partition(int arr[],int low,int high){
		int pivot = arr[high];
		int i = low - 1;
		int j = 0;
		for(j=low;j<high;j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[j];
		arr[j] = temp;
		return (i+1);
	}

	public static void main (String[] args) {
		//code

        int arr[] = {1000, 11, 445, 1, 330, 3000};
		quickSort(arr,0,5);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");

		int kthSmallest = getKsmallest(arr,3);
		System.out.println("kth smallest minumum number "+kthSmallest);


	}
}