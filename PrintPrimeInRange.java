import java.util.Scanner;
public class PrintPrimeInRange {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        
        for(int i = l;i< h; i++){
            int a = 0;
            for(int j = 2; j<i;j++){
                if (i%j==0){
                    a++;
                    break;
                }
            }
            if (a==0)System.out.print(i+" ");
        }
        sc.close();
    }
}
