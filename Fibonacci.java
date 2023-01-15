import java.util.Scanner;
public class Fibonacci {
    public static void main(String [] args){
        System.out.print("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int a = 0;
        for(int i = 0; i<n;i++){
            a=x+y;
            System.out.print(a+" ");
            x=y;
            y=a;            
        }  
        sc.close();      
    }
}
