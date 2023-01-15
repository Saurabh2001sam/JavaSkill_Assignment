// 1. Modify the above program (called RunningNumberSum1) to sum all the
// numbers from 9 to 899. (Ans: 404514)

public class Addxx {
    public static void main(String[] args) {
        int s = 0;
        for(int i = 9; i <= 899;i++){
            s += i;
        }
        System.out.println(s);
    }
}
