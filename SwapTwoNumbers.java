//Write a Java Program to swap two numbers using the third variable.

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int temp;

        // Displaying the numbers before swapping
        System.out.println("Before swapping num1 is: " + num1);
        System.out.println("Before swapping num2 is: " + num2);

        // Swapping numbers using third variable
        temp = num1;
        num1 = num2;
        num2 = temp;

        // Displaying the numbers after swapping
        System.out.println("After swapping num1 is: " + num1);
        System.out.println("After swapping num2 is: " + num2);
    }
}