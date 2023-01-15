import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f = factorial(a);
        if(f == 0){
            a = sc.nextInt();
            f = factorial(a);
        }
        System.out.println(f);
        sc.close();
    }
    public static int factorial(int a){
        if (a < 0){System.out.println("Invalid Number"); return 0;}
        int f = 1;
        for(int i = 2;i <= a; i++ ){
            f = f*i;
        }
        return f;
    }
}
