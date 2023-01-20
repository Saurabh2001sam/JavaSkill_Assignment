public class MergeSort {
    public static void main(String [] args){
        int [] arr = {6,3,9,5,4,2,8,7,1,4};
        mergeSort(arr,0,arr.length-1);
    }
    public static void mergeSort(int[] ar, int f,int l){
        if(f<l){
            int mid = (f+l)/2;
            mergeSort(ar, f, mid);
            mergeSort(ar, mid+1, l);
            merge(ar, f,mid,l);
        }
    }

    public static void merge(int[] arr, int f, int mid, int l){
        int[] a = new int [l-f+1];
        int n = 0, m = 0;
        // for(int i : a){
        //     System.out.print(i+" ");
        // }
        for(int i = 0; i < l-f+1; i++){
            int x =0,y=0;
            if(f+m==mid){
                
                for(int j = i ;j<l-f+1 && mid+1+n+x < l;j++ ){
                    i = j;
                    a[j] = arr[mid + 1+n+x];
                    x++;
                }
            }
            if(mid + 1 + n == l){
                for(int j = i; j< l-f+1 && f+m+y<mid;j++){
                    i = j;
                    a[j] = arr[f+m+y];
                    y++;
                }
            }
            if(arr[f+m] < arr[mid+1+n]){
                a[i] = arr[f+m];
                m++;
            }
            else  {
                a[i] = arr[mid+1+n];
                n++;
            }
            
        
        }
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}