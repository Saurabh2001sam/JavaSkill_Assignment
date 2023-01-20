import java.util.Scanner;
public class HRPalindromeS {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int j = 0;
        //System.out.println(s.length()/2);
        for(int i = 0 ; i<=s.length()/2-1;i++){
            if(Character.compare(s.charAt(i), s.charAt(s.length()-1-i))==0) j++;
        }
        //System.out.println(j);
        if(j==s.length()/2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
