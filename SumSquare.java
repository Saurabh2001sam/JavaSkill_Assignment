// 4. Modify the above program (called RunningNumberSquareSum) to find the
// sum of the square of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3
// +... (Hint: Modify the sum = sum + number statement. (Ans: 338350)



public class SumSquare {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i<= 100 ;i++){
            s += i*i;
        }
        System.out.println(s);
    }
}
