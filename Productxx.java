// 5. Modify the above program (called RunningNumberProduct) to compute
// the product of all the numbers from 1 to 10. (Hint: Use a variable
// called product instead of sum and initialize product to 1. Modify the sum = sum
// + number statement to do the multiplication on
// variable product. (Ans: 3628800)

public class Productxx {
    public static void main(String[] args) {
        int p = 1;
        for (int i = 1; i <= 10;i++){
            p *= i;
        }
        System.out.println(p);
    }
}
