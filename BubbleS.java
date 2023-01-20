class BubbleS{
    public static void main(String ... args){
        int[] ar = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0,14, 46, 43, 27, 57, 41, 45, 21, 7};
        int x = 0;
        int n = ar.length;
        
        for(int i = n-1; i >= 0 ; i--){
            for(int j = 0 ; j<i;j++){
                if(ar[j] > ar[j+1]){
                    x = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = x;
                }
            }
        }
        for(int a : ar){
            System.out.print(a+" ");
        }
    }
}