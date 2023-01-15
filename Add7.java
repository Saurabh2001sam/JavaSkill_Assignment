// 3. Modify the above program (called RunningNumberMod7Sum) to sum all the
// numbers between 1 to 1000 that are divisible by 7. (Hint: Modify the
// initialization statement to begin from 7 and post-processing statement to
// increment by 7. (Ans: 71071

public class Add7 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}
