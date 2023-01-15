// 2. Modify the above program (called RunningNumberOddSum) to sum all
// the odd numbers between 1 to 1000. (Hint: Change the postprocessing statement to "number = number + 2". (Ans: 250000)


public class AddOdd {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 1000;i++){
            if(i % 2 != 0){
                s += i;
            }
        }
        System.out.println(s);
    }
}
