class MergeSort{

    public static int[] merge(int a[],int b[]){
        int i=0;
        int j=0;
        int k = 0;
        int m = a.length;
        int n = b.length;
        int res[] = new int[m+n];
        while(i<m && j<n){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            }else{
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<m){
           res[k] = a[i];
           k++;
           i++; 
        }
        while(j<n){
            res[k] = b[j];
            k++;
            j++;
        }
        return res;
    }

    public static void mergeV1(int a[],int low,int mid,int high){
        int n1 = mid-low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i] = a[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j] = a[mid+1+j];
        }
        int i=0;int j=0;int k=low;
        while(i<n1 && j< n2){
            if(left[i] <= right[j]){
                a[k] = left[i];
                k++;
                i++;
            }else{
                a[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            a[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = right[j];
            j++;
            k++;
        }
        // for(i=0;i<k;i++){
        //     System.out.print(" "+a[i]);
        // }
    }

    public static void mergeSort(int a[],int l,int r){
        if(r>l){
            int m = l +(r-l)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            mergeV1(a,l,m,r);
        }
    }

    public static void main(String args[]){
        // int a [] = { 10,20,50};
        // int b[] = {3,5,50};
        // int res[] = merge(a,b);
        int a[] ={10,5,30,15,7};
        int low = 0;
        int mid = 2;
        int high = 4;
        mergeSort(a,low,high);
        //mergeV1(a,low,mid,high);
        // int n = res.length;
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
}