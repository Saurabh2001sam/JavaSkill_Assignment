public class SelectionS {
    public static void main(String ... args){
        int[] ar = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0, 14, 46, 43, 27, 57, 41, 45, 21, 7 };
        int n = ar.length;
        int m = 0;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++ ){
                if(j == i){
                    m = j;
                }else{
                    if(ar[m] > ar[j]){
                        m = j;
                    }
                }
            }
            int x = ar[i];
            ar[i] = ar[m];
            ar[m] = x;
        }
        for(int a : ar){
            System.out.print(a+" ");
        }
    }
}
