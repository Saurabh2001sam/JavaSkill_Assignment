public class InsertionS {
    public static void main (String ... args){
        int[] ar = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0, 14, 46, 43, 27, 57, 41, 45, 21, 7 };
        int n = ar.length;
        int x = 0;
        
        for(int i = 0 ; i< n ;i++){
            x = ar[i];
            for(int j = i; j >= 0 ;j--){
                if(x < ar[j]) ar[j+1] = ar[j];
                if(x > ar[j]){
                    ar[j+1] = x;
                    break;
                }
                if(j == 0 )ar[j] = x;
            }
        }
        
        for (int a : ar) {
            System.out.print(a + " ");
        }
    }
}
