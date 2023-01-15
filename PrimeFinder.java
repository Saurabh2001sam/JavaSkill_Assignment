import java.util.Scanner;
public class PrimeFinder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primeFinder(num);
        sc.close();
    }

    public static void primeFinder(int n){
        int a = 0;
        for(int i = 2;i < n; i++){
            if(n%i==0){
                System.out.println(n+" is not a prime number "+i);
                a++;
                break;
            }
        }
        if(a == 0) System.out.println(n+" is a prime number") ;
    }
}
